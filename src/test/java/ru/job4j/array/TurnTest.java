package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class TurnTest {

    @Test
    public void whenTurnArrayWithEvenAmountOfElementsThenTurnedArray() {
        int[] array = {4, 1, 6, 2};
        int[] expected = {2, 6, 1, 4};
        int[] out = Turn.back(array);
        Assert.assertArrayEquals(expected, out);
    }

    @Test
    public void whenTurnArrayWithNotEvenAmountOfElementsThenTurnedArray() {
        int[] array = {4, 1, 6, 2, 5};
        int[] expected = {5, 2, 6, 1, 4};
        int[] out = Turn.back(array);
        Assert.assertArrayEquals(expected, out);
    }
}