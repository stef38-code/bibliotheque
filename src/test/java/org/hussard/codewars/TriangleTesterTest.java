package org.hussard.codewars;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TriangleTesterTest {
    @Test
    public void publicTests() {
        assertEquals(true, TriangleTester.isTriangle(1,2,2));
        assertEquals(false, TriangleTester.isTriangle(7,2,2));
    }
}
