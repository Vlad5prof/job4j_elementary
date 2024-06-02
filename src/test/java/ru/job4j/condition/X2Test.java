package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class X2Test {

    @Test
    void whenA5B0C0X2Then20() {
        int a = 5;
        int b = 0;
        int c = 0;
        int x = 2;
        int expected = 20;
        int result = X2.calc(a, b, c, x);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenA2B2C2X2Then14() {
        int a = 2;
        int b = 2;
        int c = 2;
        int x = 2;
        int expected = 14;
        int result = X2.calc(a, b, c, x);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenA0B2C2X2Then6() {
        int a = 0;
        int b = 2;
        int c = 2;
        int x = 2;
        int expected = 6;
        int result = X2.calc(a, b, c, x);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenA2B2C0X2Then12() {
        int a = 2;
        int b = 2;
        int c = 0;
        int x = 2;
        int expected = 12;
        int result = X2.calc(a, b, c, x);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenA2B2C2X0Then2() {
        int a = 2;
        int b = 2;
        int c = 2;
        int x = 0;
        int expected = 2;
        int result = X2.calc(a, b, c, x);
        assertThat(result).isEqualTo(expected);
    }
 }