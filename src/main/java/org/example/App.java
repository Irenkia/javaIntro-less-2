package org.example;

public class App {
    public static void main(String[] args) {
        forCheckNumberEvenOrOdd();
    }

    public static void forCheckNumberEvenOrOdd() {
        int number1 = 22;
        System.out.println("\nLet's check if your number is even: ");
        System.out.println("Your number - " + number1);
        boolean isEven1 = CheckNumberEvenOrOdd.isEvenNumber(number1);
        System.out.println("Your number " + number1 + " is Even? - " + isEven1);

        int number2 = 11;
        System.out.println("\nLet's check if your number is even: ");
        System.out.println("Your number - " + number2);
        boolean isEven2 = CheckNumberEvenOrOdd.isEvenNumber(number2);
        System.out.println("Your number " + number2 + " is Even? - " + isEven2);
        System.out.println("-------------------------------------------------");

        int number3 = 8;
        System.out.println("\nLet's check if your number is odd: ");
        System.out.println("Your number - " + number3);
        boolean isOdd1 = CheckNumberEvenOrOdd.isOddNumber(number3);
        System.out.println("Your number " + number3 + " is Odd? - " + isOdd1);

        int number4 = 5;
        System.out.println("\nLet's check if your number is odd: ");
        System.out.println("Your number - " + number4);
        boolean isOdd2 = CheckNumberEvenOrOdd.isOddNumber(number4);
        System.out.println("Your number " + number4 + " is Odd? - " + isOdd2);
    }
}
