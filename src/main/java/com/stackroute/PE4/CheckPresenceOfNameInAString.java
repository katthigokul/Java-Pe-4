package com.stackroute.PE4;
/* To Write a program with the implementation of Regular Expression to find the presence of the name
Harry in a string.*/

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CheckPresenceOfNameInAString {
    boolean checkPresence(String str){
        if (str.isBlank() || str.isEmpty()) {
            return false;
        }
        Pattern pattern = Pattern.compile("(\\s?)(?i)harry\\1");
        Matcher matcher = pattern.matcher(str);
        return matcher.find();
    }
}
