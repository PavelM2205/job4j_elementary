package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class EndsWithTest {

    @Test
    public void whenEndWithPostThenTrue() {
        char[] word = {'H', 'e', 'l', 'l', 'o'};
        char[] post = {'l', 'o'};
        boolean out = EndsWith.endsWith(word, post);
        Assert.assertTrue(out);
    }

    @Test
    public void whenNotEndWithPostThenFalse() {
        char[] word = {'H', 'e', 'l', 'l', 'o'};
        char[] post = {'l', 'e'};
        boolean out = EndsWith.endsWith(word, post);
        Assert.assertFalse(out);
    }
}