package org.hussard.bidon;

import org.assertj.core.api.SoftAssertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.time.LocalDate;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Stream;


class PeriodeDtoTest {
    @ParameterizedTest(name = "expected = {1} => {0}")
    @MethodSource("getData")
    void test(List<PeriodeDto> periodes,
              List<PeriodeDto> periodesResultat) {
        PeriodeTri periodeTri = new PeriodeTri();
        List<PeriodeDto> periodesTriees = periodeTri.trier(periodes);

        AtomicInteger index = new AtomicInteger();
        periodesTriees.forEach(periodeDto -> {
            SoftAssertions softly = new SoftAssertions();
            softly.assertThat(periodeDto.getDateDebut()).isEqualTo(periodesResultat.get(index.get()).getDateDebut());
            softly.assertThat(periodeDto.getDateFin()).isEqualTo(periodesResultat.get(index.get()).getDateFin());
            softly.assertAll();
            index.getAndIncrement();
        });
    }

    public static Stream<Arguments> getData() {
        return Stream.of(
                Arguments.of(
                        List.of(
                                new PeriodeDto(LocalDate.of(2020, 01, 01), LocalDate.of(2020, 01, 31)),
                                new PeriodeDto(LocalDate.of(2019, 01, 01), LocalDate.of(2020, 01, 31))
                        )
                        , List.of(
                                new PeriodeDto(LocalDate.of(2019, 01, 01), LocalDate.of(2020, 01, 31)),
                                new PeriodeDto(LocalDate.of(2020, 01, 01), LocalDate.of(2020, 01, 31))
                        )
                )
        );

    }
}
