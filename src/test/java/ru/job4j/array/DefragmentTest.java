package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class DefragmentTest {

    @Test
    public void singleFirstNull() {
        String[] input = {null, "I"};
        String[] expected = {"I", null};
        String[] out = Defragment.compress(input);
        Assert.assertArrayEquals(expected, out);
    }

    @Test
    public void notFirstNull() {
        String[] input = {"I", null, "wanna", null, "be", null, "compressed"};
        String[] expected = {"I", "wanna", "be", "compressed", null, null, null};
        String[] out = Defragment.compress(input);
        Assert.assertArrayEquals(expected, out);
    }

    @Test
    public void firstNull() {
        String[] input = {null, "I", "wanna", null, "be", null, "compressed"};
        String[] expected = {"I", "wanna", "be", "compressed", null, null, null};
        String[] out = Defragment.compress(input);
        Assert.assertArrayEquals(expected, out);
    }

    @Test
    public void notAllNull() {
        String[] input = {null, null, null};
        String[] expected = {null, null, null};
        String[] out = Defragment.compress(input);
        Assert.assertArrayEquals(expected, out);
    }

    @Test
    public void notAllFirstNull() {
        String[] input = {null, null, null, "I", "wanna", "be", "compressed"};
        String[] expected = {"I", "wanna", "be", "compressed", null, null, null};
        String[] out = Defragment.compress(input);
        Assert.assertArrayEquals(expected, out);
    }
}