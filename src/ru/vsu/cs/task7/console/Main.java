package ru.vsu.cs.task7.console;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int n = readSomething("Enter the size of the array: ");
        int[] numbers = setArray(n);
        int amount = findMaximumNumberRepetitions(numbers);

        printAnswer(amount);
    }

    public static int[] setArray(int n) {
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.printf("Number %1s = ", i + 1);
            numbers[i] = readSomething("");
        }
        return numbers;
    }

    public static int findMaximumNumberRepetitions(int[] numbers) {
        int number = 0;
        for (int i = 0; i < numbers.length; i++) {
            int quantity = 0;
            for (int k = i; k < numbers.length; k++)
                if (numbers[i] == numbers[k])
                    quantity += 1;
            if (quantity > number) {
                number = quantity;
            }
        }
        return number;
    }

    public static void printAnswer(int amount) {
        System.out.printf("Maximum number of identical elements in an array = %1s", amount);
    }

    public static int readSomething(String name) {
        Scanner scn = new Scanner(System.in);
        System.out.print(name);
        return scn.nextInt();
    }
}

