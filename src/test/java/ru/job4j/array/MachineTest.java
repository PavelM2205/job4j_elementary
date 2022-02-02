package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

import javax.crypto.Mac;

import static org.junit.Assert.*;

public class MachineTest {

    @Test
    public void whenEquals() {
        int money = 100;
        int price = 100;
        int[] expected = {};
        int[] out = Machine.change(money, price);
        Assert.assertArrayEquals(expected, out);
    }

    @Test
    public void when50by35() {
        int money = 50;
        int price = 35;
        int[] expected = {10, 5};
        int[] out = Machine.change(money, price);
        Assert.assertArrayEquals(expected, out);
    }

    @Test
    public void when50by21() {
        int money = 50;
        int price = 21;
        int[] expected = {10, 10, 5, 2, 2};
        int[] out = Machine.change(money, price);
        Assert.assertArrayEquals(expected, out);
    }

    @Test
    public void when50by32() {
        int money = 50;
        int price = 32;
        int[] expected = {10, 5, 2, 1};
        int[] out = Machine.change(money, price);
        Assert.assertArrayEquals(expected, out);
    }
}