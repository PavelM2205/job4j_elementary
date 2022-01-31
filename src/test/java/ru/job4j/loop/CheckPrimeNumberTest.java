package ru.job4j.loop;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CheckPrimeNumberTest {

    @Test
    public void when5() {
        int number = 5;
        boolean out = CheckPrimeNumber.check(number);
        Assert.assertTrue(out);
    }

    @Test
    public void when4() {
        int number = 4;
        boolean out = CheckPrimeNumber.check(number);
        Assert.assertFalse(out);
    }

    @Test
    public void when1() {
        int number = 1;
        boolean out = CheckPrimeNumber.check(number);
        Assert.assertFalse(out);
    }
}