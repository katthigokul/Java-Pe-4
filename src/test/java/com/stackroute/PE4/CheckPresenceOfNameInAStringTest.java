package com.stackroute.PE4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CheckPresenceOfNameInAStringTest {
    CheckPresenceOfNameInAString checkPresenceOfNameInAString;


    @Before
    public void setup() {
        checkPresenceOfNameInAString = new CheckPresenceOfNameInAString();

    }

    @After
    public void teardown() {
        checkPresenceOfNameInAString = null;
    }

    @Test
    public void givenStringShouldReturnNamePresentInGivenString() {
        assertEquals(true, checkPresenceOfNameInAString.checkPresence("This is Harry"));
    }

    @Test(expected = NullPointerException.class)
    public void givenNullStringShouldThrowNullPointerException() {
        checkPresenceOfNameInAString.checkPresence(null);
    }

}