package ru.job4j.array;

public class Check {
    public static boolean mono(boolean[] data) {
        boolean result = true;
        for (boolean n : data) {
            if (n != data[0]) {
                result = false;
                break;
            }
        }
        return result;
    }
}