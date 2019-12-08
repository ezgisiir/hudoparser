package com.ezgisiir.hudoparser;

import java.util.Random;
import java.util.UUID;

public class StringTest {

    public static void main(String[] args) {
        String name = UUID.randomUUID().toString();

        Random random = new Random();
        int age = random.nextInt(100);

        String parseString = name + " naber napiyosun iyi misin benim yasim:" + age + " \"tamam mi.\" ";

        int firstSpaceIndex = parseString.indexOf(" ");

        String parsedName = parseString.substring(0,firstSpaceIndex);
        System.out.println(parsedName);

        String parseString2 = parseString.substring(firstSpaceIndex);

        int  ikiNoktaIndex = parseString2.indexOf(":");
        String ageContainingString = parseString2.substring(ikiNoktaIndex);
        System.out.println(ageContainingString);
        int secondSpaceIndex = ageContainingString.indexOf(" ");

        ageContainingString = ageContainingString.substring(1,secondSpaceIndex);
        System.out.println(ageContainingString);
    }

}
