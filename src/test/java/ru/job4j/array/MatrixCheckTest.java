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

    @Test
    public void whenDiagonalFullX() {
        char[][] board = {
                {'X', ' ', ' '},
                {' ', 'X', ' '},
                {' ', ' ', 'X'},
        };
        char[] expected = {'X', 'X', 'X'};
        char[] out = MatrixCheck.extractDiagonal(board);
        Assert.assertArrayEquals(expected, out);
    }

    @Test
    public void whenDiagonalFullOne() {
        char[][] board = {
                {'1', ' ', ' '},
                {' ', '1', ' '},
                {' ', ' ', '1'},
        };
        char[] expected = {'1', '1', '1'};
        char[] out = MatrixCheck.extractDiagonal(board);
        Assert.assertArrayEquals(expected, out);
    }

    @Test
    public void whenDiagonalFullMix() {
        char[][] board = {
                {'X', ' ', ' '},
                {' ', 'Y', ' '},
                {' ', ' ', 'Z'},
        };
        char[] expected = {'X', 'Y', 'Z'};
        char[] out = MatrixCheck.extractDiagonal(board);
        Assert.assertArrayEquals(expected, out);
    }
}