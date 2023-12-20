package org.hussard.codewars;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class StopGninnipSMySdroWTest {
    public static Stream<Arguments> getData() {
        return Stream.of(
                Arguments.of("emocleW","Welcome"),
                Arguments.of("Hey wollef sroirraw", "Hey fellow warriors"),
                Arguments.of("Hey fellow warriors", "Hey wollef sroirraw"),
                Arguments.of("This is a test",  "This is a test"),
                Arguments.of("This is another test","This is rehtona test")
        );
    }
    @ParameterizedTest(name = "expected = {0} : {1}")
    @MethodSource("getData")
    void test(String value,String except) {
        assertThat(StopGninnipSMySdroW.spinWords(value)).hasToString(except);
    }
}
