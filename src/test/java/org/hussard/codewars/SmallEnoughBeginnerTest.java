package org.hussard.codewars;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;
import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.hussard.codewars.SmallEnoughBeginner.smallEnough;

class SmallEnoughBeginnerTest {
    @Test
    void constructeur_Quand_EstPrivate_Alors_getModifiersEstEgalAModifierPrivate() throws NoSuchMethodException {
        Constructor<SmallEnoughBeginner> constructor = SmallEnoughBeginner.class.getDeclaredConstructor();
        assertThat(constructor.getModifiers()).isEqualTo(Modifier.PRIVATE);
    }

    @Test()
    void constructeur_Quand_ModificationAccessible_Alors_UnsupportedOperationException() throws NoSuchMethodException {
        final Constructor<SmallEnoughBeginner> constructor = SmallEnoughBeginner.class.getDeclaredConstructor();
        constructor.setAccessible(true);
        assertThatThrownBy(constructor::newInstance).
                hasCauseExactlyInstanceOf(UnsupportedOperationException.class);

    }

    public static Stream<Arguments> getData() {
        return Stream.of(
                Arguments.of(new int[]{66, 101}, 200, true),
                Arguments.of(new int[]{78, 117, 110, 99, 104, 117, 107, 115}, 100, false),
                Arguments.of(new int[]{101, 45, 75, 105, 99, 107}, 107, true),
                Arguments.of(new int[]{80, 117, 115, 104, 45, 85, 112, 115}, 120, true)
        );
    }

    @ParameterizedTest(name = "expected = {0} <= {1} ==> {2}")
    @MethodSource("getData")
    void basicTests(int[] values,
                    int limit,
                    boolean excepted) {
        assertThat(smallEnough(values, limit)).isEqualTo(excepted);
    }
}
