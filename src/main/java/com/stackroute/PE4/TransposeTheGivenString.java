package com.stackroute.PE4;
/* To Write a program to transpose the given string.*/

import java.util.Arrays;

public class TransposeTheGivenString {
    String getTransposeOfString(String str) {
        if(str==null)
        {
            return null;
        }
        return Arrays.stream(str.split(" ")).map(s -> new StringBuilder(s).reverse().toString()).reduce((a, b) -> a.concat(" ").concat(b)).get();
    }
}
