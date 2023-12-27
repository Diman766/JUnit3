package org.example;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class MainTest {

    @Test
    void testSearchEvenTrue() {
        int n = 6;
        assertThat(Main.searchEven(n)).isTrue();
    }

    @Test
    void testSearchEvenFalse() {
        int n = 5;
        assertThat(Main.searchEven(n)).isFalse();
    }

    @Test
    void testGetIntoIntervalTrue() {
        int n = 26;
        assertThat(Main.getIntoInterval(n)).isTrue();
    }

    @Test
    void testGetIntoIntervalFalse() {
        int n = 23;
        assertThat(Main.getIntoInterval(n)).isFalse();
    }
}