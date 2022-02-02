package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SortSelectedTest {

    @Test
    public void whenSortArrayOf5Elements() {
        int[] data = {3, 4, 1, 2, 5};
        int[] expected = {1, 2, 3, 4, 5};
        int[] out = SortSelected.sort(data);
        Assert.assertArrayEquals(expected, out);
    }

    @Test
    public void whenSortArrayOf3Elements() {
        int[] data = {95, 16, 32};
        int[] expected = {16, 32, 95};
        int[] out = SortSelected.sort(data);
        Assert.assertArrayEquals(expected, out);
    }

    @Test
    public void whenSortArrayOf6Elements() {
        int[] data = {-3, -5, 8, 4, -1, 0};
        int[] expected = {-5, -3, -1, 0, 4, 8};
        int[] out = SortSelected.sort(data);
        Assert.assertArrayEquals(expected, out);
    }
}