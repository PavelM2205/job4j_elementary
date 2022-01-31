package ru.job4j.loop;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CounterTest {

    @Test
    public void whenSumByEvenNumbersFromOneToTenThenThirty() {
        int start = 1;
        int finish = 10;
        int expected = 30;
        int out = Counter.sumByEven(start, finish);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void whenSumByEvenNumbersFromFiveToFifteenThenFifty() {
        int start = 5;
        int finish = 15;
        int expected = 50;
        int out = Counter.sumByEven(start, finish);
        Assert.assertEquals(expected, out);
    }
}