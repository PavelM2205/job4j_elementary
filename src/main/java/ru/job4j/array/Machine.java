package ru.job4j.array;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Machine {
    public static int[] change(int money, int price) {
        int[] coins = {10, 5, 2, 1};
        int[] rsl = new int[100];
        int size = 0;
        int delta = money - price;
        for (int n: coins) {
            while (delta >= n) {
                delta -= n;
                rsl[size] = n;
                size++;
            }
        }
        return Arrays.copyOf(rsl, size);
    }
}