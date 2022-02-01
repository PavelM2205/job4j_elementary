package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SwitchArrayTest {

    @Test
    public void whenSwap0To3() {
        int[] array = {1, 2, 3, 4};
        int source =  0;
        int dest = array.length - 1;
        int[] expected = {4, 2, 3, 1};
        int[] out = SwitchArray.swap(array, source, dest);
        Assert.assertArrayEquals(expected, out);
    }

    @Test
    public void whenSwap2To4() {
        int[] array = {1, 2, 3, 4, 5, 6};
        int source =  2;
        int dest = 4;
        int[] expected = {1, 2, 5, 4, 3, 6};
        int[] out = SwitchArray.swap(array, source, dest);
        Assert.assertArrayEquals(expected, out);
    }

    @Test
    public void whenSwap1To3() {
        int[] array = {1, 2, 3, 4, 5, 6};
        int source =  1;
        int dest = 3;
        int[] expected = {1, 4, 3, 2, 5, 6};
        int[] out = SwitchArray.swap(array, source, dest);
        Assert.assertArrayEquals(expected, out);
    }
}