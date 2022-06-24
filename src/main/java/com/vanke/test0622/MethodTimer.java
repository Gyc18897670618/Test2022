package com.vanke.test0622;

import java.awt.event.ActionListener;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MethodTimer {

    private static final Logger myLogger = Logger.getLogger("com.vanke.test0622.MethodTimer");

    public static void main(String[] args) {
        String[] strings = {"51doyQ8zF6","JNP4219nDs","N8L1xuagQR","4dNbCCv94Q","ijn3G5tJZF",
                "n47gbmHbsv","CoKIH3bBSl","f7vmfQvmx9","WT1nEpOTTc","HuzB0sTrNh"};

       /* for (int i = 1; i < 20; i++) {
            String randomString = getRandomString(10);
            list.add(randomString);
        }*/
       // System.out.println(list);
        myLogger.info("");
        //排序后
        Arrays.sort(strings, String::compareToIgnoreCase);

        for (int i = 0; i < strings.length; i++) {
            System.out.println(strings[i]);
        }

    }


    //length用户要求产生字符串的长度
    public static String getRandomString(int length) {
        String str = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        Random random = new Random();
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < length; i++) {
            int number = random.nextInt(62);
            sb.append(str.charAt(number));
        }
        return sb.toString();
    }


}
