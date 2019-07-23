package com.stackroute.PE4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ReplaceAllDWithFAndLWithTTest {
    private ReplaceAllDWithFAndLWithT replaceAllDWithFAndLWithT;

    @Before
    public void setUp() {
        replaceAllDWithFAndLWithT = new ReplaceAllDWithFAndLWithT();
    }
    @After
    public void teardown() {

        replaceAllDWithFAndLWithT = null;
    }

    @Test
    public void givenStringshouldReturnByReplacingDWithFAndLWithT() {
        assertEquals("faity fry", ReplaceAllDWithFAndLWithT.replaceAllDWithFAndLWithT("daily dry"));
    }

    @Test
    public void givenStringshouldReturnByReplacingDWithFAndLWithTForNullInput() {
        assertEquals(null, ReplaceAllDWithFAndLWithT.replaceAllDWithFAndLWithT(null));
    }
}

