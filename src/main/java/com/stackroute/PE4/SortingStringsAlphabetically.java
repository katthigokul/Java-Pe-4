package com.stackroute.PE4;
/*
To Write a program that sets up a String variable containing a paragraph of text of your choice.
a. Extract the words from the text and sort them into alphabetical order.
b. Display the sorted list of words.*/


import java.util.Arrays;

public class SortingStringsAlphabetically {
    String sortAlphabetically(String paragraph) {
        if (paragraph == null || paragraph.isEmpty()) {
            System.out.println("Paragraph is null or empty");
            return "";
        }
        return Arrays.stream(paragraph.split(" ")).sorted().reduce((a, b) -> a.concat(" ").concat(b)).get();
    }

}
