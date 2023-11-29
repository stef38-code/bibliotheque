package org.hussard.codewars;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DnaStrandTest {

    @Test
     void test01() {
        assertEquals("TTTT", DnaStrand.makeComplement("AAAA"));
    }
    @Test
     void test02() {
        assertEquals("TAACG", DnaStrand.makeComplement("ATTGC"));
    }
    @Test
     void test03() {
        assertEquals("CATA", DnaStrand.makeComplement("GTAT"));
    }
}
