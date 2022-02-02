package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MatrixSumTest {

    @Test
    public void whenSingle() {
        int[][] array = {
                {10}
        };
        int expected = 10;
        int out = MatrixSum.sum(array);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void whenTwo() {
        int[][] array = {
                {1, 2},
                {1, 2}
        };
        int expected = 6;
        int out = MatrixSum.sum(array);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void whenThree() {
        int[][] array = {
                {1, 2, 1},
                {1, 2, 0}
        };
        int expected = 7;
        int out = MatrixSum.sum(array);
        Assert.assertEquals(expected, out);
    }
}