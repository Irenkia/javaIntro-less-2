package org.example;

public class App {
    public static void main(String[] args) {
        forCheckingNumber();
    }

    public static void forCheckingNumber() {
        int number1 = 22;
        System.out.println("Let's check if your number is even: ");
        System.out.println("Your number - " + number1);
        boolean isEven1 = CheckingNumber.isNumberEven(number1);
        System.out.println("Your number " + number1 + " is Even? - " + isEven1);

        int number2 = 11;
        System.out.println("\nLet's check if your number is even: ");
        System.out.println("Your number - " + number2);
        boolean isEven2 = CheckingNumber.isNumberEven(number2);
        System.out.println("Your number " + number2 + " is Even? - " + isEven2);
    }
}
