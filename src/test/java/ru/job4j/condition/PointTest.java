package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PointTest {

    @Test
    public void when00to20Then2() {
        Point one = new Point(0, 0);
        Point two = new Point(2, 0);
        double expected = 2;
        double out = one.distance(two);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when10to20Then1() {
        Point one = new Point(1, 0);
        Point two = new Point(2, 0);
        double expected = 1;
        double out = one.distance(two);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when01to02Then1() {
        Point one = new Point(0, 1);
        Point two = new Point(0, 2);
        double expected = 1;
        double out = one.distance(two);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when35to82Then5dot83() {
        Point one = new Point(3, 5);
        Point two = new Point(8, 2);
        double expected = 5.83;
        double out = one.distance(two);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when111to222Then1dot73() {
        Point one = new Point(1, 1, 1);
        Point two = new Point(2, 2, 2);
        double expected = 1.73;
        double out = one.distance3d(two);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when123to456Then5dot19() {
        Point one = new Point(1, 2, 3);
        Point two = new Point(4, 5, 6);
        double expected = 5.19;
        double out = one.distance3d(two);
        Assert.assertEquals(expected, out, 0.01);
    }
}