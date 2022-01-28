package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MaxTest {

    @Test
    public void when12Then2() {
        int first = 1;
        int second = 2;
        int expexted = 2;
        int out = Max.max(first, second);
        Assert.assertEquals(expexted, out);
    }

    @Test
    public void when53Then5() {
        int first = 5;
        int second = 3;
        int expexted = 5;
        int out = Max.max(first, second);
        Assert.assertEquals(expexted, out);
    }

    @Test
    public void when55Then5() {
        int first = 5;
        int second = 5;
        int expexted = 5;
        int out = Max.max(first, second);
        Assert.assertEquals(expexted, out);
    }
}