package pro.sky.java.course1.lesson5;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
        task9();
    }


    public static void task1() {
        int[] arr = generateRandomArray();
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println("Task 1:\n The amount spent for the month was " + sum + " rubles.");
    }

    public static void task2() {
        int[] arr = generateRandomArray();
        int minSum = arr[0];
        int maxSum = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < minSum) {
                minSum = arr[i];
            }
            if (arr[i] > maxSum) {
                maxSum = arr[i];
            }
        }
        System.out.println("Task 2:\n The minimum amount spent per day was " + minSum + " rubles.");
        System.out.println(" The maximum amount spent per day was " + maxSum + " rubles.");
    }

    public static void task3() {
        int[] arr = generateRandomArray();
        double sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        sum = sum / arr.length;

        System.out.println("Task 3:\n The average amount spent for the month was " + sum + " rubles.");
    }

    public static void task4() {
        char prev;
        char next;
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};

        for (int i = 0; i < reverseFullName.length / 2; i++) {
            next = reverseFullName[i];
            prev = reverseFullName[reverseFullName.length - 1 - i];
            reverseFullName[i] = prev;
            reverseFullName[reverseFullName.length - 1 - i] = next;
        }
        System.out.print("Task 4:\n ");
        System.out.println(reverseFullName);
    }

    public static void task5() {
        int[][] matrix = new int[3][3];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if ((i == j) || (i - j == 2) || (j - i == 2)) {
                    matrix[i][j] = 1;
                }
            }
        }
        System.out.print("Task 5:\n");
        for (int[] row : matrix) {
            for (int column : row) {
                System.out.print(" " + column + " ");
            }
            System.out.println();
        }
    }

    public static void task6() {
        int[] arrOld = {5, 4, 3, 2, 1};
        int[] arrNew = new int[arrOld.length];

        System.out.println("Task 6:\n " + Arrays.toString(arrOld));
        for (int i = 0; i < arrOld.length; i++) {
            arrNew[arrNew.length - 1 - i] = arrOld[i];
        }
        System.out.println(" " + Arrays.toString(arrNew));
    }

    public static void task7() {
        int prev;
        int next;
        int[] arrOld = {5, 4, 3, 2, 1};

        System.out.println("Task 7:\n " + Arrays.toString(arrOld));
        for (int i = 0; i < arrOld.length / 2; i++) {
            next = arrOld[i];
            prev = arrOld[arrOld.length - 1 - i];
            arrOld[i] = prev;
            arrOld[arrOld.length - 1 - i] = next;
        }
        System.out.println(" " + Arrays.toString(arrOld));
    }

    public static void task8() {
        int[] arr = {-6, 2, 5, -8, 8, 10, 4, -7, 12, 1};
        int num1 = 0;
        int num2 = 0;

        Arrays.sort(arr);
        System.out.println("Task 8:\n ");
        for (int i = 0; i < (arr.length - 1) / 2; i++) {
            num1 = arr[i];
            for (int j = 0; j < arr.length; j++) {
                if (num1 + arr[j] == -2) {
                    num2 = arr[j];
                    System.out.println(" " + num1 + " & " + num2);
                }
            }
        }
    }

    public static void task9() {
        int[] arr = {-6, 2, 5, -8, 8, 10, 4, -7, 12, 1};
        int num1 = 0;
        int num2 = 0;

        Arrays.sort(arr);
        System.out.println("Task 9:\n ");
        for (int i = 0; i < (arr.length - 1) / 2; i++) {
            num1 = arr[i];
            for (int j = 0; j < arr.length; j++) {
                if (num1 + arr[j] == -2) {
                    num2 = arr[j];
                    System.out.println(" " + num1 + " & " + num2);
                }
            }
        }
    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
}


