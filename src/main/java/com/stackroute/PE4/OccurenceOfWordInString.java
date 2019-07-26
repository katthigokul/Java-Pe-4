package com.stackroute.PE4;
/* To Write a program to find out the multiple occurrences of the given word in a string using Matcher
methods.*/

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class OccurenceOfWordInString {


    public static String[] getoccurenceOfWordInString(String stringToMatch, String patternToSearch) {
        if (stringToMatch.isEmpty() || stringToMatch.isBlank() || patternToSearch.isEmpty() || patternToSearch.isBlank()) {
            throw new RuntimeException("Empty or Blank string given");
        }
        Pattern pattern = Pattern.compile(patternToSearch);
        Matcher matcher = pattern.matcher(stringToMatch);
        if (matcher.find()) {
            List<String> occurrencesString = new ArrayList<>();
            occurrencesString.add(matcher.start() + "-" + matcher.end());
            while (matcher.find()) {
                occurrencesString.add(matcher.start() + "-" + matcher.end());
            }
            return occurrencesString.toArray(new String[occurrencesString.size()]);
        }
        return null;
    }
}