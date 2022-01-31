package ru.job4j.loop;

public class Mortgage {
    public static int year(double amount, int salary, double percent) {
        int count = 0;
        while (amount > 0) {
            double debt = ((amount * percent) / 100) + amount;
            amount = debt - salary;
            count += 1;
        }
        return count;
    }
}
