package pro.sky.java.course1.lesson4;

public class Main {
    public static void main(String[] args) {

        task1();
        task2();
        task3();
        task4();
        task5();
    }

    public static void task1() {
        int i = 0;

        System.out.println("Task 1: ");
        while (i < 10) {
            i++;
            System.out.print(i + " ");
        }

        System.out.println();
        for (; i > 0; --i) {
            System.out.print(i + " ");
        }
    }

    public static void task2() {

        System.out.println("\n\nTask 2: ");
        for (int numDayFriday = 6; numDayFriday <= 31; numDayFriday += 7) {
            System.out.println("Today is Friday, the " + numDayFriday + "th day. It is necessary to prepare a report.");
        }
    }

    public static void task3() {
        int currentYear = 2021;
        int earlyYear = currentYear - 200;
        int lateYear = currentYear + 100;

        System.out.println("\nTask 3: ");

        for (; earlyYear <= lateYear; earlyYear++) {
            if (earlyYear % 79 == 0) {
                System.out.println(earlyYear);
            }
        }
    }

    public static void task4() {
        System.out.print("\nTask 4:");

        for (int i = 1; i <= 30; i++) {
            System.out.print("\n" + i + ":");
            if (i % 3 == 0) {
                System.out.print(" ping");
            }
            if (i % 5 == 0) {
                System.out.print(" pong");
            }
        }
    }

    public static void task5() {
        int previous = 0;
        int current = 1;
        int temp;

        System.out.println("\n Task 5:");
        System.out.print(previous + " ");
        for (int i = 1; i < 10; i++) {
            System.out.print(current + " ");

            temp = current;
            current += previous;
            previous = temp;
        }
    }
}
