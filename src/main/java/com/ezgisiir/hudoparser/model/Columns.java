
package com.ezgisiir.hudoparser.model;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "sharepointid",
    "Rank",
    "ECHRRanking",
    "languagenumber",
    "itemid",
    "docname",
    "doctype",
    "application",
    "appno",
    "conclusion",
    "importance",
    "originatingbody",
    "typedescription",
    "kpdate",
    "kpdateAsText",
    "documentcollectionid",
    "documentcollectionid2",
    "languageisocode",
    "extractedappno",
    "isplaceholder",
    "doctypebranch",
    "respondent",
    "advopidentifier",
    "advopstatus",
    "ecli",
    "appnoparts",
    "sclappnos"
})
public class Columns {

    @JsonProperty("sharepointid")
    private String sharepointid;
    @JsonProperty("Rank")
    private String rank;
    @JsonProperty("ECHRRanking")
    private String eCHRRanking;
    @JsonProperty("languagenumber")
    private String languagenumber;
    @JsonProperty("itemid")
    private String itemid;
    @JsonProperty("docname")
    private String docname;
    @JsonProperty("doctype")
    private String doctype;
    @JsonProperty("application")
    private String application;
    @JsonProperty("appno")
    private String appno;
    @JsonProperty("conclusion")
    private String conclusion;
    @JsonProperty("importance")
    private String importance;
    @JsonProperty("originatingbody")
    private String originatingbody;
    @JsonProperty("typedescription")
    private String typedescription;
    @JsonProperty("kpdate")
    private String kpdate;
    @JsonProperty("kpdateAsText")
    private String kpdateAsText;
    @JsonProperty("documentcollectionid")
    private String documentcollectionid;
    @JsonProperty("documentcollectionid2")
    private String documentcollectionid2;
    @JsonProperty("languageisocode")
    private String languageisocode;
    @JsonProperty("extractedappno")
    private String extractedappno;
    @JsonProperty("isplaceholder")
    private String isplaceholder;
    @JsonProperty("doctypebranch")
    private String doctypebranch;
    @JsonProperty("respondent")
    private String respondent;
    @JsonProperty("advopidentifier")
    private String advopidentifier;
    @JsonProperty("advopstatus")
    private String advopstatus;
    @JsonProperty("ecli")
    private String ecli;
    @JsonProperty("appnoparts")
    private String appnoparts;
    @JsonProperty("sclappnos")
    private String sclappnos;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("sharepointid")
    public String getSharepointid() {
        return sharepointid;
    }

    @JsonProperty("sharepointid")
    public void setSharepointid(String sharepointid) {
        this.sharepointid = sharepointid;
    }

    @JsonProperty("Rank")
    public String getRank() {
        return rank;
    }

    @JsonProperty("Rank")
    public void setRank(String rank) {
        this.rank = rank;
    }

    @JsonProperty("ECHRRanking")
    public String getECHRRanking() {
        return eCHRRanking;
    }

    @JsonProperty("ECHRRanking")
    public void setECHRRanking(String eCHRRanking) {
        this.eCHRRanking = eCHRRanking;
    }

    @JsonProperty("languagenumber")
    public String getLanguagenumber() {
        return languagenumber;
    }

    @JsonProperty("languagenumber")
    public void setLanguagenumber(String languagenumber) {
        this.languagenumber = languagenumber;
    }

    @JsonProperty("itemid")
    public String getItemid() {
        return itemid;
    }

    @JsonProperty("itemid")
    public void setItemid(String itemid) {
        this.itemid = itemid;
    }

    @JsonProperty("docname")
    public String getDocname() {
        return docname;
    }

    @JsonProperty("docname")
    public void setDocname(String docname) {
        this.docname = docname;
    }

    @JsonProperty("doctype")
    public String getDoctype() {
        return doctype;
    }

    @JsonProperty("doctype")
    public void setDoctype(String doctype) {
        this.doctype = doctype;
    }

    @JsonProperty("application")
    public String getApplication() {
        return application;
    }

    @JsonProperty("application")
    public void setApplication(String application) {
        this.application = application;
    }

    @JsonProperty("appno")
    public String getAppno() {
        return appno;
    }

    @JsonProperty("appno")
    public void setAppno(String appno) {
        this.appno = appno;
    }

    @JsonProperty("conclusion")
    public String getConclusion() {
        return conclusion;
    }

    @JsonProperty("conclusion")
    public void setConclusion(String conclusion) {
        this.conclusion = conclusion;
    }

    @JsonProperty("importance")
    public String getImportance() {
        return importance;
    }

    @JsonProperty("importance")
    public void setImportance(String importance) {
        this.importance = importance;
    }

    @JsonProperty("originatingbody")
    public String getOriginatingbody() {
        return originatingbody;
    }

    @JsonProperty("originatingbody")
    public void setOriginatingbody(String originatingbody) {
        this.originatingbody = originatingbody;
    }

    @JsonProperty("typedescription")
    public String getTypedescription() {
        return typedescription;
    }

    @JsonProperty("typedescription")
    public void setTypedescription(String typedescription) {
        this.typedescription = typedescription;
    }

    @JsonProperty("kpdate")
    public String getKpdate() {
        return kpdate;
    }

    @JsonProperty("kpdate")
    public void setKpdate(String kpdate) {
        this.kpdate = kpdate;
    }

    @JsonProperty("kpdateAsText")
    public String getKpdateAsText() {
        return kpdateAsText;
    }

    @JsonProperty("kpdateAsText")
    public void setKpdateAsText(String kpdateAsText) {
        this.kpdateAsText = kpdateAsText;
    }

    @JsonProperty("documentcollectionid")
    public String getDocumentcollectionid() {
        return documentcollectionid;
    }

    @JsonProperty("documentcollectionid")
    public void setDocumentcollectionid(String documentcollectionid) {
        this.documentcollectionid = documentcollectionid;
    }

    @JsonProperty("documentcollectionid2")
    public String getDocumentcollectionid2() {
        return documentcollectionid2;
    }

    @JsonProperty("documentcollectionid2")
    public void setDocumentcollectionid2(String documentcollectionid2) {
        this.documentcollectionid2 = documentcollectionid2;
    }

    @JsonProperty("languageisocode")
    public String getLanguageisocode() {
        return languageisocode;
    }

    @JsonProperty("languageisocode")
    public void setLanguageisocode(String languageisocode) {
        this.languageisocode = languageisocode;
    }

    @JsonProperty("extractedappno")
    public String getExtractedappno() {
        return extractedappno;
    }

    @JsonProperty("extractedappno")
    public void setExtractedappno(String extractedappno) {
        this.extractedappno = extractedappno;
    }

    @JsonProperty("isplaceholder")
    public String getIsplaceholder() {
        return isplaceholder;
    }

    @JsonProperty("isplaceholder")
    public void setIsplaceholder(String isplaceholder) {
        this.isplaceholder = isplaceholder;
    }

    @JsonProperty("doctypebranch")
    public String getDoctypebranch() {
        return doctypebranch;
    }

    @JsonProperty("doctypebranch")
    public void setDoctypebranch(String doctypebranch) {
        this.doctypebranch = doctypebranch;
    }

    @JsonProperty("respondent")
    public String getRespondent() {
        return respondent;
    }

    @JsonProperty("respondent")
    public void setRespondent(String respondent) {
        this.respondent = respondent;
    }

    @JsonProperty("advopidentifier")
    public String getAdvopidentifier() {
        return advopidentifier;
    }

    @JsonProperty("advopidentifier")
    public void setAdvopidentifier(String advopidentifier) {
        this.advopidentifier = advopidentifier;
    }

    @JsonProperty("advopstatus")
    public String getAdvopstatus() {
        return advopstatus;
    }

    @JsonProperty("advopstatus")
    public void setAdvopstatus(String advopstatus) {
        this.advopstatus = advopstatus;
    }

    @JsonProperty("ecli")
    public String getEcli() {
        return ecli;
    }

    @JsonProperty("ecli")
    public void setEcli(String ecli) {
        this.ecli = ecli;
    }

    @JsonProperty("appnoparts")
    public String getAppnoparts() {
        return appnoparts;
    }

    @JsonProperty("appnoparts")
    public void setAppnoparts(String appnoparts) {
        this.appnoparts = appnoparts;
    }

    @JsonProperty("sclappnos")
    public String getSclappnos() {
        return sclappnos;
    }

    @JsonProperty("sclappnos")
    public void setSclappnos(String sclappnos) {
        this.sclappnos = sclappnos;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
