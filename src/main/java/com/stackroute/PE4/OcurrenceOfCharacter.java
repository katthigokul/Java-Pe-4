package com.stackroute.PE4;
/*
*  To Write a java program to count the total number of occurrences of a given character in a string
without using any loop*/

public class OcurrenceOfCharacter {
    int numberOfOccurances(String string, String character) {
        if (string == null || character == null) {
            System.out.println("Invalid Character");
            return 0;
        }
        return string.length() - string.replaceAll(character, "").length();
    }
}
