package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MatrixCheckTest {

    @Test
    public void whenHasMonoHorizontal() {
        char[][] board = {
                {' ', ' ', ' '},
                {'X', 'X', 'X'},
                {' ', ' ', ' '}
        };
        int row = 1;
        boolean out = MatrixCheck.monoHorizontal(board, row);
        Assert.assertTrue(out);
    }

    @Test
    public void whenDoesNotHasMonoHorizontal() {
        char[][] board = {
                {'X', 'X', 'X'},
                {' ', ' ', ' '},
                {' ', ' ', ' '},
        };
        int row = 1;
        boolean out = MatrixCheck.monoHorizontal(board, row);
        Assert.assertFalse(out);
    }
}