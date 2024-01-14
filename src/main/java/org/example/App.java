package org.example;

public class App {
    public static void main(String[] args) {
        fromCalculator();
    }

    public static void fromCalculator() {
        int sum = Calculator.add(1, 1);
        System.out.println("1 + 1 = " + sum);
        int subtraction = Calculator.subtract(5, 4);
        System.out.println("5 - 4 = " + subtraction);
        int multiplication = Calculator.multiply(3, 3);
        System.out.println("3 * 3 = " + multiplication);
        int division1 = Calculator.divide(10, 2);
        System.out.println("10 / 2 = " + division1);
        System.out.println("5 / 0 = " + Calculator.divide(5, 0));
    }
}
