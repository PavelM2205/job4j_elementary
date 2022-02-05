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

    @Test
    public void when234Then4() {
        int first = 2;
        int second = 3;
        int third = 4;
        int expexted = 4;
        int out = Max.max(first, second, third);
        Assert.assertEquals(expexted, out);
    }

    @Test
    public void when243Then4() {
        int first = 2;
        int second = 4;
        int third = 3;
        int expexted = 4;
        int out = Max.max(first, second, third);
        Assert.assertEquals(expexted, out);
    }

    @Test
    public void when423Then4() {
        int first = 4;
        int second = 2;
        int third = 3;
        int expexted = 4;
        int out = Max.max(first, second, third);
        Assert.assertEquals(expexted, out);
    }

    @Test
    public void when443Then4() {
        int first = 4;
        int second = 4;
        int third = 3;
        int expexted = 4;
        int out = Max.max(first, second, third);
        Assert.assertEquals(expexted, out);
    }

    @Test
    public void when444Then4() {
        int first = 4;
        int second = 4;
        int third = 4;
        int expexted = 4;
        int out = Max.max(first, second, third);
        Assert.assertEquals(expexted, out);
    }

    @Test
    public void when4444Then4() {
        int first = 4;
        int second = 4;
        int third = 4;
        int fourth = 4;
        int expexted = 4;
        int out = Max.max(first, second, third, fourth);
        Assert.assertEquals(expexted, out);
    }

    @Test
    public void when1235Then5() {
        int first = 1;
        int second = 2;
        int third = 3;
        int fourth = 5;
        int expexted = 5;
        int out = Max.max(first, second, third, fourth);
        Assert.assertEquals(expexted, out);
    }

    @Test
    public void when1532Then5() {
        int first = 1;
        int second = 5;
        int third = 3;
        int fourth = 2;
        int expexted = 5;
        int out = Max.max(first, second, third, fourth);
        Assert.assertEquals(expexted, out);
    }

    @Test
    public void when5123Then5() {
        int first = 5;
        int second = 1;
        int third = 2;
        int fourth = 3;
        int expexted = 5;
        int out = Max.max(first, second, third, fourth);
        Assert.assertEquals(expexted, out);
    }
}