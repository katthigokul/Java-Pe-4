package com.stackroute.PE4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.*;

import static org.junit.Assert.*;


public class OccurenceOfWordInStringTest {
    private OccurenceOfWordInString occurenceOfWordInString;

    @Before
    public void setUp() throws Exception {
        occurenceOfWordInString=new OccurenceOfWordInString();
    }

    @After
    public void tearDown() throws Exception {
        occurenceOfWordInString=null;
    }

    @Test
    public void givenStringAndPatternShouldReturnStringArray() {
        String[] exptectedResult = {
                "4-6",
                "10-12",
                "27-29"
        };
        assertArrayEquals("givenStringAndPatternShouldReturnStringArray: Should return an array containing first and end positions of the substring where the match occurred.",
                exptectedResult, OccurenceOfWordInString.getoccurenceOfWordInString("She sells seashells by the seashore", "se"));
    }
    @Test
    public void givenStringAndWrongPatternShouldReturnNull() {
        assertNull("givenStringAndWrongPatternShouldReturnNull: getOccurrencePositions() should return null",
                OccurenceOfWordInString.getoccurenceOfWordInString("She sells seashells by the seashore", "de"));
    }



}