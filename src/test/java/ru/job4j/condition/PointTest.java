package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class PointTest {

    @Test
    void when00to20then2() {
        double expected = 2;
        int x = 0;
        int y = 0;
        int x2 = 2;
        int y2 = 0;
        double output = Point.distance(x, y, x2, y2);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when23toMinus45then10() {
        double expected = 10;
        int x = 2;
        int y = 3;
        int x2 = -4;
        int y2 = -5;
        double output = Point.distance(x, y, x2, y2);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when32to97then7() {
        double expected = 7.81;
        int x = 3;
        int y = 2;
        int x2 = 9;
        int y2 = 7;
        double output = Point.distance(x, y, x2, y2);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }
}