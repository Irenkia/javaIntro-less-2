package org.example;

public class VerificationIsAdultAge {
    public static boolean isOfAge(int age) {
        return (age >= 18 && age <= 100);
    }
    public static void printAnswerIsOfAge(int age){
        if (age > 18 && age <= 100) {
            System.out.println("Yes, your age = " + age + " and it is over 18 years old");
        } else if (age == 18){
            System.out.println("Yes, your age = " + age + " years");
        }else {
            System.out.println("No, your age = " + age + " and it is under 18 years old");
        }
    }
}
