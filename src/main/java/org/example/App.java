package org.example;

public class App {
    public static void main(String[] args) {
        fromCalculator();
    }

    public static void fromCalculator() {
        int sum = Calculator.sum(1, 1);
        System.out.println("1 + 1 = " + sum);
        int subtraction = Calculator.subtraction(5, 4);
        System.out.println("5 - 4 = " + subtraction);
        int multiplication = Calculator.multiplication(3, 3);
        System.out.println("3 * 3 = " + multiplication);
        int division1 = Calculator.division(10, 2);
        System.out.println("10 / 2 = " + division1);
        int division2 = Calculator.division(5, 0);
        System.out.println("5 / 0 = " + division2);
    }
}
