package org.example;

public class App {
    public static void main(String[] args) {
        fromWeekdays();
    }

    public static void fromWeekdays() {
        System.out.println("Your day of week - " + Weekdays.days(1));
        System.out.println("Your day of week - " + Weekdays.days(2));
        System.out.println("Your day of week - " + Weekdays.days(3));
        System.out.println("Your day of week - " + Weekdays.days(4));
        System.out.println("Your day of week - " + Weekdays.days(5));
        System.out.println("Your day of week - " + Weekdays.days(6));
        System.out.println("Your day of week - " + Weekdays.days(7));
        System.out.println("Your day of week - " + Weekdays.days(22));
    }
}
