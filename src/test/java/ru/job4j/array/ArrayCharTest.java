package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ArrayCharTest {

    @Test
    public void whenStartWithprefixThenTrue() {
        char[] word = {'H', 'e', 'l', 'l', 'o'};
        char[] pref = {'H', 'e'};
        boolean out = ArrayChar.startsWith(word, pref);
        Assert.assertTrue(out);
    }

    @Test
    public void whenNotStartWithprefixThenFalse() {
        char[] word = {'H', 'e', 'l', 'l', 'o'};
        char[] pref = {'H', 'i'};
        boolean out = ArrayChar.startsWith(word, pref);
        Assert.assertFalse(out);
    }
}