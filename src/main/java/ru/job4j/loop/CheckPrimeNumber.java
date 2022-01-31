package ru.job4j.loop;

public class CheckPrimeNumber {
    public static boolean check(int number) {
        boolean result = false;
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                break;
            } else if (number % number == 0) {
                result = true;
            }
        }
        return result;
    }
}
