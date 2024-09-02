package ru.job4j.loop;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class CounterTest {

    @Test
    void when0Then25() {
        int start = 0;
        int finish = 25;
        int result = Counter.sum(start, finish);
        int expected = 325;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void when3Then7() {
        int start = 3;
        int finish = 7;
        int result = Counter.sum(start, finish);
        int expected = 25;
        assertThat(result).isEqualTo(expected);
        }

    @Test
    void whenSumEven() {
        int start = 3;
        int finish = 3;
        int result = Counter.sum(start, finish);
        int expected = 3;
        assertThat(result).isEqualTo(expected);
        }

    @Test
    void when9Then2() {
          int start = 9;
          int finish = 2;
          int result = Counter.sum(start, finish);
          int expected = 0;
          assertThat(result).isEqualTo(expected);
          }
    }