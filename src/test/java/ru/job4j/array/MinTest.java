package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MinTest {

    @Test
    public void whenFirstMin() {
        int[] array = {0, 5, 10};
        int expected = 0;
        int out = Min.findMin(array);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void whenLastMin() {
        int[] array = {10, 5, 3};
        int expected = 3;
        int out = Min.findMin(array);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void whenMiddleMin() {
        int[] array = {10, 2, 5};
        int expected = 2;
        int out = Min.findMin(array);
        Assert.assertEquals(expected, out);
    }
}