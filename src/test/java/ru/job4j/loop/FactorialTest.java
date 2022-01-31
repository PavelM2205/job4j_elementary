package ru.job4j.loop;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class FactorialTest {

    @Test
    public void whenCalculateFactorialForFiveThenOneHundredTwenty() {
        int n = 5;
        int expected = 120;
        int out = Factorial.calc(5);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void whenCalculateFactorialForNullThenOne() {
        int n = 0;
        int expected = 1;
        int out = Factorial.calc(0);
        Assert.assertEquals(expected, out);
    }
}