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
    public void givenStringAndPatternShouldReturnTheStringArray() {
        assertTrue(occurenceOfWordInString.setString("How is the weather today"));
        List<String> expectedOutput = new ArrayList<>();
        expectedOutput.add("7-10");
        expectedOutput.add("14-17");
        assertEquals(expectedOutput, occurenceOfWordInString.getoccurenceOfWordInString("the"));
    }


}