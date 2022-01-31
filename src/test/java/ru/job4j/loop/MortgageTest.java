package ru.job4j.loop;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MortgageTest {

    @Test
    public void whenOneYear() {
        double amount = 1000;
        int salary = 1200;
        double percent = 1;
        int expected = 1;
        int out = Mortgage.year(amount, salary, percent);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void whenTwoYear() {
        double amount = 100;
        int salary = 120;
        double percent = 50;
        int expected = 2;
        int out = Mortgage.year(amount, salary, percent);
        Assert.assertEquals(expected, out);
    }
}