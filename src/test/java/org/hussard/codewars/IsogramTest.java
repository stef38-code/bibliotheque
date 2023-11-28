package org.hussard.codewars;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IsogramTest {
    @Test
     void FixedTests() {
        assertTrue(Isogram.isIsogram("Dermatoglyphics"));
        assertTrue( Isogram.isIsogram("isogram"));
        assertFalse(Isogram.isIsogram("moose"));
        assertFalse(Isogram.isIsogram("isIsogram"));
        assertFalse(Isogram.isIsogram("aba"));
        assertFalse(Isogram.isIsogram("moOse"));
        assertTrue(Isogram.isIsogram("thumbscrewjapingly"));
        assertTrue(Isogram.isIsogram(""));
    }
}
