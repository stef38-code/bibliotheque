package org.hussard.codewars;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class NumberOfPeopleInTheBusTest {
    public static Stream<Arguments> getDataTest() {
        return Stream.of(
                Arguments.of(List.of(new int[]{10, 0}), 10),
                Arguments.of(List.of(new int[]{10, 0}, new int[]{3, 5}), 8),
                Arguments.of(List.of(new int[]{10, 0}, new int[]{3, 5}), 8),
                Arguments.of(List.of(new int[]{10, 0}, new int[]{3, 5}, new int[]{2, 5}), 5));
    }

    @ParameterizedTest()
    @MethodSource("getDataTest")
    void countPassengers(List<int[]> list,
                         int excepted) {
        assertThat(NumberOfPeopleInTheBus.countPassengers(list)).isEqualTo(excepted);
    }
}
