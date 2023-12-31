package org.hussard;

import org.hussard.codewars.SmallEnough;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class SmallEnoughTest {
    public static Stream<Arguments> getDataTest() {
        return Stream.of(
                Arguments.of(new int[]{66, 101}, 200, true),
                Arguments.of(new int[]{78, 117, 110, 99, 104, 117, 107, 115}, 100, false),
                Arguments.of(new int[]{101, 45, 75, 105, 99, 107}, 107, true),
                Arguments.of(new int[]{80, 117, 115, 104, 45, 85, 112, 115}, 120, true));
    }

    @ParameterizedTest()
    @MethodSource("getDataTest")
    void basicTests(int[] a,
                           int limit,
                           boolean excepted) {
        assertThat(SmallEnough.smallEnough(a, limit)).isEqualTo(excepted);
    }
}
