package org.hussard.codewars;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class WhoLikesItTest {
    @Test
    @DisplayName("no one likes this")
    void whoLikesIt1() {
        assertThat(WhoLikesIt.whoLikesIt()).isEqualTo("no one likes this");
    }

    @Test
    @DisplayName("Peter likes this")
    void whoLikesIt2() {
        assertThat(WhoLikesIt.whoLikesIt("Peter")).isEqualTo("Peter likes this");
    }

    @Test
    @DisplayName("Jacob and Alex like this")
    void whoLikesIt3() {
        assertThat(WhoLikesIt.whoLikesIt("Jacob", "Alex")).isEqualTo("Jacob and Alex like this");
    }

    @Test
    @DisplayName("Max, John and Mark like this")
    void whoLikesIt4() {
        assertThat(WhoLikesIt.whoLikesIt("Max", "John", "Mark")).isEqualTo("Max, John and Mark like this");
    }

    @Test
    @DisplayName("Alex, Jacob and 2 others like this")
    void staticTests() {
        assertThat(WhoLikesIt.whoLikesIt("Alex", "Jacob", "Mark", "Max")).isEqualTo("Alex, Jacob and 2 others like this");
    }
}
