package org.hussard.codewars;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EvenOrOddTest {
    @Test @DisplayName("Should return \"Odd\" for num = 1")
     void testPositiveOddNumbers() {
        assertEquals("Odd", EvenOrOdd.evenOrOdd(1));
    }

    @Test @DisplayName("Should return \"Even\" for num = 2")
     void testPositiveEvenNumbers() {
        assertEquals("Even", EvenOrOdd.evenOrOdd(2));
    }

    @Test @DisplayName("Should return \"Odd\" for num = -1")
     void testNegativeOddNumbers() {
        assertEquals("Odd", EvenOrOdd.evenOrOdd(-1));
    }

    @Test
    @DisplayName("Should return \"Even\" for num = -2")
     void testNegativeEvenNumbers() {
        assertEquals("Even", EvenOrOdd.evenOrOdd(-2));
    }

    @Test @DisplayName("Should return \"Even\" for num = 0")
     void testZero() {
        assertEquals("Even", EvenOrOdd.evenOrOdd(0));
    }
}
