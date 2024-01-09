package org.example;

public class App {
    public static void main(String[] args) {
        forAgeVerification();
    }

    public static void forAgeVerification() {
        int age1 = 22;
        System.out.println("Let's check your age to watch the movie :");
        System.out.println("Your age - " + age1);
        boolean isVerification1 = AgeVerification.isVerification(age1);
        System.out.println("Can you watch the movie? - " + isVerification1);

        int age2 = 12;
        System.out.println("\nLet's check your age to watch the movie :");
        System.out.println("Your age - " + age2);
        boolean isVerification2 = AgeVerification.isVerification(age2);
        System.out.println("Can you watch the movie? - " + isVerification2);
    }
}
