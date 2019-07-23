package com.stackroute.PE4;
/* To Write a program to find out the multiple occurrences of the given word in a string using Matcher
methods.*/

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class OccurenceOfWordInString {
    private CharSequence givenString;

    List<String> getoccurenceOfWordInString(String pattern){
        if (pattern.trim().isEmpty()){
            throw new RuntimeException();
        }
        List<String> occurrenceIndex = new ArrayList<>();
        Pattern pattern1 = Pattern.compile(pattern);
        Matcher matcher = pattern1.matcher(this.givenString);
        while (matcher.find()){
            occurrenceIndex.add(
                    String.valueOf(matcher.start()).concat("-").concat(
                            String.valueOf(matcher.end())
                    )
            );
        }
        if (occurrenceIndex.size() == 0){
            occurrenceIndex = null;
        }
        return occurrenceIndex;
    }


    public boolean setString(String how_is_the_weather_today) {
        return null;
    }
}