package com.stackroute.PE4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SortingStringsAlphabeticallyTest {
    private SortingStringsAlphabetically sortingStringsAlphabetically;

    @Before
    public void setUp() {

        sortingStringsAlphabetically = new SortingStringsAlphabetically();
    }
    @After
    public void teardown() {
        sortingStringsAlphabetically = null;
    }

    @Test
    public void givenStringShouldReturnSortingAlphabetically() {
        assertEquals("Anymore Don't Talk We", sortingStringsAlphabetically.sortAlphabetically("We Don't Talk Anymore"));
    }

    @Test
    public void givenStringShouldReturnNullInput() {
        assertEquals("", sortingStringsAlphabetically.sortAlphabetically(null));
    }


}