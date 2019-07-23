package com.stackroute.PE4;
/*
 * To Write a program to replace all d with f and all l with t in the given String
 * */

public class ReplaceAllDWithFAndLWithT {
    static String replaceAllDWithFAndLWithT(String str) {
        if (str == null||str.isEmpty())
        {
            return null;

        }
        return str.replaceAll("d","f").replaceAll("l","t");
    }
}
