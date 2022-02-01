package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CheckTest {

    @Test
    public void whenDataMonoByTrueThenTrue() {
        boolean[] data = {true, true, true};
        boolean out = Check.mono(data);
        Assert.assertTrue(out);
    }

    @Test
    public void whenDataNotMonoByTrueThenFalse() {
        boolean[] data = {true, false, true};
        boolean out = Check.mono(data);
        Assert.assertFalse(out);
    }

    @Test
    public void whenDataMonoByFalseThenTrue() {
        boolean[] data = {false, false, false};
        boolean out = Check.mono(data);
        Assert.assertTrue(out);
    }
}