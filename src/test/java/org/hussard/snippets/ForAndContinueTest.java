package org.hussard.snippets;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class ForAndContinueTest {
    private static final Logger log = LoggerFactory.getLogger(ForAndContinueTest.class);
    private List<Integer> list ;
    @BeforeEach
    void setUp() {
        list = List.of(-11,1,2,3,-12,4,-14,5,6,9, -13,-15,-16,7,8,-17,0,-18,-19);
    }

    //le cas normal
    @Test
    void normalTest(){
        ForAndContinue forAndContinue = new ForAndContinue();
        List<Integer> integers = forAndContinue.basiqueSolution(list);
        log.info("valeurs positive: {}",integers);
        assertThat(integers).isNotEmpty().containsExactly(2, 3, 4, 5, 6, 7, 10, 8, 9, 1);
    }
    //le cas où on ne travaille que sur les éléments voulus
    @Test
    void filtreTest(){
        ForAndContinue forAndContinue = new ForAndContinue();
        List<Integer> integers = forAndContinue.filterAndFor(list);
        log.info("valeurs positive: {}",integers);
        assertThat(integers).isNotEmpty().containsExactly(2, 3, 4, 5, 6, 7, 10, 8, 9, 1);
    }
    //le cas où on ne travaille que sur les éléments voulus
    @Test
    void filtreBestPraticeTest(){
        ForAndContinue forAndContinue = new ForAndContinue();
        List<Integer> integers = forAndContinue.filterAndForeach(list);
        log.info("valeurs positive: {}",integers);
        assertThat(integers).isNotEmpty().containsExactly(2, 3, 4, 5, 6, 7, 10, 8, 9, 1);
    }
    //le cas où on ne travaille que sur les éléments voulus
    @Test
    void filtreBestOfTheBestPraticeTest(){
        ForAndContinue forAndContinue = new ForAndContinue();
        List<Integer> integers = forAndContinue.filterAndMapToList(list);
        log.info("valeurs positive: {}",integers);
        assertThat(integers).isNotEmpty().containsExactly(2, 3, 4, 5, 6, 7, 10, 8, 9, 1);
    }
}
