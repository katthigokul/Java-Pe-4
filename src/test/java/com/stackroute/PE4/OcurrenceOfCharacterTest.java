package com.stackroute.PE4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class OcurrenceOfCharacterTest {

    private OcurrenceOfCharacter ocurrenceOfCharacter;

    @Before
    public void setUp() {
        ocurrenceOfCharacter = new OcurrenceOfCharacter();
    }

    @After
    public void teardown() {
        ocurrenceOfCharacter = null;
    }

    @Test
    public void givenStringShouldReturnTotalNumberOfOccurencesOfAGivenCharacters() {
        assertEquals(10, ocurrenceOfCharacter.numberOfOccurances("Java is java again java again", "a"));
    }

    @Test
    public void givenStringShouldReturnNullInput() {
        assertEquals(0, ocurrenceOfCharacter.numberOfOccurances(null, "a"));
    }

    @Test
    public void givenStringShouldReturnTotalNumberOfOccurencesOfAGivenCharactersFailure() {
        assertEquals(0, ocurrenceOfCharacter.numberOfOccurances("Java is java again java again", "A"));
    }
}