package ru.vsu.cs.task7.gui.logics;

public class QuantityCalculator {
    public static int findMaximumNumberRepetitions(int[] numbers) {
        int number = 0;
        for (int i = 0; i < numbers.length; i++) {
            int quantity = 0;
            for (int k = i; k <= numbers.length - 1; k++)
                if (numbers[i] == numbers[k])
                    quantity += 1;
            if (quantity > number) {
                number = quantity;
            }
        }
        return number;
    }
}
