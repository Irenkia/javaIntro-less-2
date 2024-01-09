package org.example;

public class Calculator {
    public static int sum(int number1, int number2) {
        return number1 + number2;
    }

    public static int subtraction(int number1, int number2) {
        return number1 - number2;
    }

    public static int multiplication(int number1, int number2) {
        return number1 * number2;
    }

    public static int division(int number1, int number2) {
        if (number2 == 0) {
            System.out.println("Error: you cannot divide by zero.");
            return 0;
        }
        return number1 / number2;
    }
}
