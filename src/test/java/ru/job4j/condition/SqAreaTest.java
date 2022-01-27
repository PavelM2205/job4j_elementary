package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SqAreaTest {

    @Test
    public void whenP6K2ThenSquare2() {
        double p = 6;
        double k = 2;
        double expected = 2;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenP8K3ThenSquare3() {
        double p = 8;
        double k = 3;
        double expected = 3;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenP4K4ThenSquare0dot64() {
        double p = 4;
        double k = 4;
        double expected = 0.64;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }
}