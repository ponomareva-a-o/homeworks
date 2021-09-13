package pro.sky.java.course1.lesson3;

public abstract class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
    }

    public static void task1() {
        int clientOS = 0 ; // 0 - iOS, 1 - Android

        if (clientOS == 0) {
            System.out.println("Task 1: Install the iOS version of the app using the link.");
        } else {
            System.out.println("Task 1: Install the Android version of the app using the link.");
        }
    }

    public static void task2() {
        int clientOS = 1 ; // 0 - iOS, 1 - Android
        int clientDeviceYear = 2015;

        if (clientOS == 0) {

            if (clientDeviceYear < 2019){
                System.out.println("Task 2: Install the lite version of the app for iOS at the link");
            } else {
                System.out.println("Task 2: Install the iOS version of the app using the link.");
            }
        } else {
            if (clientDeviceYear < 2019){
                System.out.println("Task 2: Install the lite version of the app for Android at the link");
            } else {
                System.out.println("Task 2: Install the Android version of the app using the link.");
            }
        }
    }

    public static void task3() {
        int year = 2020 ;
        boolean yearDivisible4 = (year % 4 == 0);
        boolean yearDivisible100 = (year % 100 == 0);
        boolean yearDivisible400 = (year % 400 == 0);

        if (yearDivisible4 || yearDivisible100 || yearDivisible400) {
            System.out.println("Task 3: Year is a leap.");
        } else {
            System.out.println("Task 3: Year isn't a leap.");
        }
    }

    public static void task4() {
        int deliveryDistance = 95;
        int daysOnTheWay = 1;

        if (deliveryDistance > 20 && deliveryDistance < 60) {
            daysOnTheWay++;
        } else if (deliveryDistance >= 60){
            daysOnTheWay++;
            daysOnTheWay++;
        }

        System.out.println("Task 4: Hello! Delivery of a bank card will take " + daysOnTheWay + " day.");
    }

    public static void task5() {
        int monthNumber = 12 ;

        switch (monthNumber) {
            case 12:
            case 1:
            case 2:
                System.out.println("Task 5: Today is winter.");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Task 5: Today is spring.");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Task 5: Today is summer.");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Task 5: Today is autumn.");
                break;
            default:
                System.out.println("Task 5: You live out of time.");
        }
    }

    public static void task6() {
        int age = 19;
        int salary = 58_000;
        int limit;
        double finalLimit;

        if (age < 23) {
            limit = salary * 2;
        } else {
            limit = salary * 3;
        }

        if (salary > 50_000 && salary < 80_000) {
            finalLimit = limit * 1.2;
        } else if (salary >= 80_000) {
            finalLimit = limit * 1.5;
        } else {
            finalLimit = limit;
        }

        System.out.println("Task 6: We are ready to issue you a credit card with a limit of " + finalLimit + " rubles.");
    }

    public static void task7() {
        int age = 25;
        double salary = 60_000;
        int wantedSum = 330_000;
        int baseRate = 10;
        int term = 12;
        double maximumMonthlyPaymentRate = 50;
        double rate;
        double finalRate;

        if (age < 23) {
            rate = baseRate + 1;
        } else if (age >= 23 && age < 30){
            rate = baseRate + 0.5;
        } else {
            rate = baseRate;
        }

        if (salary > 80_000) {
            finalRate = rate - 0.7;
        } else {
            finalRate = rate;
        }

        double creditSum = wantedSum + ((finalRate / 100) * wantedSum);
        double monthlyPayment = creditSum / term;
        double maximumMonthlyPayment = salary * (maximumMonthlyPaymentRate / 100);

        if (monthlyPayment <= maximumMonthlyPayment) {
            System.out.println("Task 7: The maximum payment for a salary " + salary + " rubbles is equal to " + maximumMonthlyPayment + " rubles. Payment " + monthlyPayment + " rubles. Approved.");
        } else {
            System.out.println("Task 7: The maximum payment for a salary " + salary + " rubbles is equal to " + maximumMonthlyPayment + " rubles. Payment " + monthlyPayment + " rubles. Denied.");
        }

    }

}
