package pro.sky.java.course1.lesson3;

import org.w3c.dom.ls.LSOutput;
import java.io.BufferedReader;
import java.util.Scanner;

public abstract class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("What task do you want to check?\n");
        int numberOfTasks = sc.nextInt();

        switch (numberOfTasks) {
            case 1:
                task1();
                break;
            case 2:
                task2();
            case 3:
                task3();
            case 4:
                task4();
            case 5:
                task5();
        }

    }

    public static void task1() {
        int clientOS = 0 ; // 0 - iOS, 1 - Android

        if (clientOS == 0) {
            System.out.println("Install the iOS version of the app using the link.");
        } else {
            System.out.println("Install the Android version of the app using the link.");
        }
    }

    public static void task2() {
        int clientOS = 1 ; // 0 - iOS, 1 - Android
        int clientDeviceYear = 2015;

        if (clientOS == 0) {

            if (clientDeviceYear < 2019){
                System.out.println("Install the lite version of the app for iOS at the link");
            } else {
                System.out.println("Install the iOS version of the app using the link.");
            }
        } else {
            if (clientDeviceYear < 2019){
                System.out.println("Install the lite version of the app for Android at the link");
            } else {
                System.out.println("Install the Android version of the app using the link.");
            }
        }
    }

    public static void task3() {
        int year = 2020 ;
        boolean yearLeap = (year % 4 == 0);

        if (yearLeap) {
            System.out.println("Year is a leap.");
        } else {
            System.out.println("Year isn't a leap.");
        }
    }

    public static void task4() {
        int deliveryDistance = 95;
        int daysOnTheWay = 1;

        if (deliveryDistance <= 20) {
            System.out.println("Hello! Delivery of a bank card will take " + daysOnTheWay + " day.");
        }
        if (deliveryDistance < 60) {
            daysOnTheWay += daysOnTheWay;
            System.out.println("Hello! Delivery of a bank card will take " + daysOnTheWay + " days.");
        } else {
            daysOnTheWay = ++daysOnTheWay;
            daysOnTheWay = ++daysOnTheWay;
            System.out.println("Hello! Delivery of a bank card will take " + daysOnTheWay + " days.");
        }
    }

    public static void task5() {
        int monthNumber = 12 ;

        switch (monthNumber) {
            case 1:
                System.out.println("Today is winter.");
            case 2:
                System.out.println("Today is winter.");
            case 3:
                System.out.println("Today is spring.");
            case 4:
                System.out.println("Today is spring.");
            case 5:
                System.out.println("Today is spring.");
            case 6:
                System.out.println("Today is summer.");
            case 7:
                System.out.println("Today is summer.");
            case 8:
                System.out.println("Today is summer.");
            case 9:
                System.out.println("Today is autumn.");
            case 10:
                System.out.println("Today is autumn.");
            case 11:
                System.out.println("Today is autumn.");
            case 12:
                System.out.println("Today is winter.");
            default:
                System.out.println("You live out of time.");
        }
    }

}
