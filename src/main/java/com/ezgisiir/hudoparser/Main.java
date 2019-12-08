package com.ezgisiir.hudoparser;

import com.ezgisiir.hudoparser.model.Columns;
import com.ezgisiir.hudoparser.model.HudoResults;
import com.ezgisiir.hudoparser.model.Result;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.commons.io.FileUtils;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;

import java.io.File;
import java.io.IOException;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        try {
            StringBuilder sb = new StringBuilder();
            sb.append("APPNO").append(",").append("KPDATE").append(System.lineSeparator());
            Set<String> uniqueAppNos = new HashSet<>();
            int start = 0;
            final int fetchCount = 200;
            boolean hasMore = true;

            while(hasMore){
                System.out.println(String.format("Fetching %s - %s", start, (start+fetchCount)));
                HttpClient httpClient = HttpClientBuilder.create().build();
                HttpGet httpGet = new HttpGet("https://hudoc.echr.coe.int/app/query/results?query=contentsitename%3AECHR%20AND%20(NOT%20(doctype%3DPR%20OR%20doctype%3DHFCOMOLD%20OR%20doctype%3DHECOMOLD))%20AND%20((respondent%3D%22TUR%22))%20AND%20((documentcollectionid%3D%22GRANDCHAMBER%22)%20OR%20(documentcollectionid%3D%22CHAMBER%22))%20AND%20(kpdate%3E%3D%222006-06-01T00%3A00%3A00.0Z%22)&select=sharepointid,Rank,ECHRRanking,languagenumber,itemid,docname,doctype,application,appno,conclusion,importance,originatingbody,typedescription,kpdate,kpdateAsText,documentcollectionid,documentcollectionid2,languageisocode,extractedappno,isplaceholder,doctypebranch,respondent,advopidentifier,advopstatus,ecli,appnoparts,sclappnos&sort=&start=" + start + "&length=" + fetchCount +"&rankingModelId=11111111-0000-0000-0000-000000000000");

                String responseStr = EntityUtils.toString(httpClient.execute(httpGet).getEntity());

                HudoResults hudoResults = parseHudoResults(responseStr);
                Integer resultCount = hudoResults.getResultcount();

                start = start + fetchCount;

                if(resultCount <= start){
                    hasMore = false;
                }

                List<Result> results = hudoResults.getResults();
                for (Result result : results) {
                    Columns columns = result.getColumns();
                    String appNo = columns.getAppno();
                    String kpDate = columns.getKpdate();
                    if(!uniqueAppNos.contains(appNo)){
                        sb.append(appNo).append(",").append(kpDate).append(System.lineSeparator());
                        uniqueAppNos.add(appNo);
                    }
                }
            }



            String fileContent = sb.toString();

            File hudoResultsCSV = new File("hudoResults.csv");

            FileUtils.writeStringToFile(hudoResultsCSV,fileContent,"utf-8");
        } catch (Throwable t) {
            t.printStackTrace();
            System.err.println("YAPAMADIM ABI!!!!!");
        }

    }



    private static HudoResults parseHudoResults(String response) throws com.fasterxml.jackson.core.JsonProcessingException {
        ObjectMapper om = new ObjectMapper();
        return om.readValue(response, HudoResults.class);
    }


}
