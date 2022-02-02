package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MonoVerticalTest {

    @Test
    public void whenHasMonoVertical() {
        char[][] board = {
            {' ', ' ', 'X'},
            {' ', ' ', 'X'},
            {' ', ' ', 'X'}
        };
        int column = 2;
        boolean out = MonoVertical.monoVertical(board, column);
        Assert.assertTrue(out);
    }

    @Test
    public void whenDoesNotHasMonoVertical() {
        char[][] board = {
                {' ', ' ', 'X'},
                {' ', ' ', 'X'},
                {' ', ' ', 'X'}
        };
        int column = 1;
        boolean out = MonoVertical.monoVertical(board, column);
        Assert.assertFalse(out);
    }
}