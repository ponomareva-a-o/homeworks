package pro.sky.java.course1.lesson2;

public class Main {

    public static void main(String[] args) {

        firstEx();
        secondEx();
        thirdEx();
        fourthEx();
        fifthEx();
        sixthEx();
        seventhEx();
        eighthEx();
    }

    public static void firstEx() {
        byte b = 1;
        short sh = -200;
        int i = 33000;
        long l = -3000000000L;
        float f = 2.5F;
        double dd = -3.000004;
        char ch = 'a';
        boolean bl = false;
    }

    public static void secondEx() {
        double mass1 = 78.2;
        double mass2 = 82.7;

        double sumMass = mass1 + mass2;
        double sumDiff = mass2 - mass1;

        System.out.println("Answer to the ex2:\n Sum = " + sumMass + " kg.\n" + " Diff:" + sumDiff + " kg.");
    }

    public static void thirdEx() {
        float banana = 5 * 80F;
        float milk = 2 * 105F;
        float iceCream = 2 * 100F;
        float egg = 4 * 70F;
        int kgToGr = 1000;

        float weight = (banana + milk + iceCream + egg) / kgToGr;

        System.out.println("Answer to the ex3:\n Weight = " + weight + "kg");
    }

    public static void fourthEx() {
        int divider250 = 250;
        int divider500 = 500;
        int amountKg = 7;
        int kgToGr = 1000;

        int amountDays250 = (amountKg * kgToGr) / divider250;
        int amountDays500 = (amountKg * kgToGr) / divider500;
        int averageAmount = (amountDays250 + amountDays500) / 2;


        System.out.println("Answer to the ex4:\n " + amountDays250 + " days will be needed if you lose 250 per day");
        System.out.println(" " + amountDays500 + " days will be needed if you lose 500 per day");
        System.out.println(" Average = " + averageAmount);
    }

    public static void fifthEx() {
        int salaryMasha = 67760;
        int salaryDenis = 83690;
        int salaryKristina = 76230;
        int months = 12;
        int percent = 10;

        double salaryMashaUp = salaryMasha * 1.1;
        double salaryDenisUp = salaryDenis * 1.1;
        double salaryKristinaUp = salaryKristina * 1.1;


        System.out.println("Answer to the ex5:\n Salary after up for Masha: " + salaryMashaUp + " rub");
        System.out.println(" Salary after up for Denis: " + salaryDenisUp + " rub");
        System.out.println(" Salary after up for Kristina: " + salaryKristinaUp + " rub");
        System.out.println(" Masha's salary diff year: " + (salaryMashaUp - salaryMasha) * months + " rub");
        System.out.println(" Denis's salary diff year: " + (salaryDenisUp - salaryDenis) * months + " rub");
        System.out.println(" Kristina's salary diff year: " + (salaryKristinaUp - salaryKristina) * months + " rub");
    }

    public static void sixthEx() {
        int a = 12;
        int b = 27;
        int c = 44;
        int d = 15;
        int e = 9;

        int result = a * (b + (c - d * e));
        int invResult = -result;

        System.out.println("Answer to the ex6: " + invResult);
    }

    public static void seventhEx() {
        int a = 5;
        int b = 7;

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("Answer to the ex7:\n a = " + a + ", b = " + b);
    }

    public static void eighthEx() {
        int a = 143;
        int b;

        b = a / 10;
        b = b % 10;

        System.out.println("Answer to the ex8:\n b = " + b);
    }
}
