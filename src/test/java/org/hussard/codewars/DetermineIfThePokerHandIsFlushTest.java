package org.hussard.codewars;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class DetermineIfThePokerHandIsFlushTest {
    public static Stream<Arguments> getData() {
        return Stream.of(
                Arguments.of(new String[]{"AS", "3S", "9S", "KS", "4S"}, true),
                Arguments.of(new String[]{"AD", "4S", "7H", "KC", "5S"}, false),
                Arguments.of(new String[]{"AD", "4S", "10H", "KC", "5S"}, false),
                Arguments.of(new String[]{"QD", "4D", "10D", "KD", "5D"}, true)
        );
    }

    @ParameterizedTest(name = "expected = {1} => {0}")
    @MethodSource("getData")
    void BasicTests(String[] cartes,
                    boolean excepted) {
        assertThat(DetermineIfThePokerHandIsFlush.checkIfFlush(cartes)).isEqualTo(excepted);
    }
}
