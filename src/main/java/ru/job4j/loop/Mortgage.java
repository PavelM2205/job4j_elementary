package ru.job4j.loop;

public class Mortgage {
    public static int year(double amount, int salary, double percent) {
        int count = 0;
        while (amount > 0) {
            amount = ((amount * percent) / 100) + amount - salary;
            count++;
        }
        return count;
    }
}
