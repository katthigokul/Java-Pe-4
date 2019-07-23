package com.stackroute.PE4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TransposeTheGivenStringTest {

    private TransposeTheGivenString transposeTheGivenString;

    @Before
    public void setUp() {
        transposeTheGivenString = new TransposeTheGivenString();
    }

    @After
    public void teardown() {
        transposeTheGivenString = null;
    }

    @Test
    public void givenStringShouldReturnTheTransposeOfThatString(){
        assertEquals("a kciuq nworb xof spmuj revo eht yzal god", transposeTheGivenString.getTransposeOfString("a quick brown fox jumps over the lazy dog"));
    }
    @Test
    public void givenSEmptytringShouldReturnErrorMessage()
    {
        assertEquals(null,transposeTheGivenString.getTransposeOfString(null));
    }
}
