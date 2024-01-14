package org.example;

public class App {
    public static void main(String[] args) {
        forAgeVerification();
    }

    public static void forAgeVerification() {
        int age1 = 22;
        System.out.println("\nLet's check if you are over or equal to 18 years of age :" + VerificationIsAdultAge.isOfAge(age1));
        System.out.println("Your age - " + age1);
        VerificationIsAdultAge.printAnswerIsOfAge(age1);

        int age2 = 12;
        System.out.println("\nLet's check if you are over or equal to 18 years of age :" + VerificationIsAdultAge.isOfAge(age2));
        System.out.println("Your age - " + age2);
        VerificationIsAdultAge.printAnswerIsOfAge(age2);

        int age3 = 18;
        System.out.println("\nLet's check if you are over or equal to 18 years of age :" + VerificationIsAdultAge.isOfAge(age3));
        System.out.println("Your age - " + age3);
        VerificationIsAdultAge.printAnswerIsOfAge(age3);
    }
}
