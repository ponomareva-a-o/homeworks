package pro.sky.java.course1.lesson2;

public class Main {

    public static void main(String[] args) {
        double mass1 = 78.2;
        double mass2 = 82.7;

        float banana = 5 * 80F;
        float milk = 2 * 105F;
        float iceCream = 2 * 100F;
        float egg = 4 * 70F;

        int divider250 = 250;
        int divider500 = 500;

        int salaryMasha = 67760;
        int salaryDenis = 83690;
        int salaryKristina = 76230;
        int months = 12;


        System.out.println("Answer to the ex2:\n Sum = " + secondExSum(mass1, mass2) + ".\n" + " Diff:" + secondExDiff(mass1, mass2) + ".");
        System.out.println("Answer to the ex3:\n Weight = " + thirdEx(banana, milk, iceCream, egg) + "kg");
        System.out.println("Answer to the ex3:\n " + fourthEx(divider250) + " days will be needed if you lose 250 per day");
        System.out.println("Answer to the ex4:\n " + fourthEx(divider500) + " days will be needed if you lose 500 per day");
        System.out.println("Answer to the ex4:\n Average " + (fourthEx(divider250) + fourthEx(divider500)) / 2);
        System.out.println("Answer to the ex5:\n Salary after up for Masha: " + fifthEx(salaryMasha) + " rub");
        System.out.println(" Salary after up for Denis: " + fifthEx(salaryDenis) + " rub");
        System.out.println(" Salary after up for Kristina: " + fifthEx(salaryKristina) + " rub");
        System.out.println(" Masha's salary diff year: " + ((fifthEx(salaryMasha) * months) - (salaryMasha * months)) + " rub");
        System.out.println(" Denis's salary diff year: " + ((fifthEx(salaryDenis) * months) - (salaryDenis * months)) + " rub");
        System.out.println(" Kristina's salary diff year: " + ((fifthEx(salaryKristina) * months) - (salaryKristina * months)) + " rub");
    }

    public static void firstEx(String[] args) {
        byte b = 1;
        short sh = -200;
        int i = 33000;
        long l = -3000000000L;
        float f = 2.5F;
        double dd = -3.000004;
        char ch = 'a';
        boolean bl = false;
    }

    public static double secondExSum(double mass1, double mass2) {
        return mass1 + mass2;
    }

    public static double secondExDiff(double mass1, double mass2) {
        return mass2 - mass1;
    }

    public static float thirdEx(float banana, float milk, float iceCream, float egg) {
        return (banana + milk + iceCream + egg) / 1000;
    }

    public static int fourthEx(int divider) {
        return (7 * 1000) / divider;
    }

    public static int fifthEx(double salary) {
        return (int) (salary * 1.1);
    }

}
