package org.hussard.codewars;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class LaxativeShotRouletteTest {
    public static Stream<Arguments> getTest() {
        return Stream.of(
                Arguments.of( 0.5,     2,   1,  1),
                Arguments.of( 0.25,    4,   1,  3),
                Arguments.of( 0.33,  100,  10, 10),
                Arguments.of( 0.04, 1000, 150, 20),
                Arguments.of( 0.29,   25,   5,  5),
                Arguments.of( 0.42,    9,   3,  2));
    }
    @ParameterizedTest(name ="expected = {0} => n = {1}, x = {2}, a = {3}")
    @MethodSource("getTest")
    void testChances(double expected, int n, int x, int a) {
        double actual = LaxativeShotRoulette.getChance(n, x, a);
        String message = String.format("n = %d, x = %d, a = %d\n", n, x, a);
        assertEquals(expected, actual, message);
    }

}
