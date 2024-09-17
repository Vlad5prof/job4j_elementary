package ru.job4j.loop;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class CounterTest {

    @Test
    void whenSumEvenNumbersFromZeroToTenThenThirty() {
        int start = 0;
        int finish = 10;
        int result = Counter.sumByEven(start, finish);
        int expected = 30;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenSumEvenNumbersFromNineTo59Then850() {
        int start = 9;
        int finish = 59;
        int result = Counter.sumByEven(start, finish);
        int expected = 850;
        assertThat(result).isEqualTo(expected);
        }

    @Test
    void whenSumEvenNumbersFromSevenToSevenThenZero() {
        int start = 7;
        int finish = 7;
        int result = Counter.sumByEven(start, finish);
        int expected = 0;
        assertThat(result).isEqualTo(expected);
        }

    @Test
    void whenSumEvenNumbersFromMinus2To32Then270() {
          int start = -2;
          int finish = 32;
          int result = Counter.sumByEven(start, finish);
          int expected = 270;
          assertThat(result).isEqualTo(expected);
          }
    }