import java.util.Scanner;

public class simplecal {
    // method 1: addition
    public static int add(int a, int b) {
        return a + b;
    }

    // method 2: subtraction
    public static int sub(int a, int b) {
        return a - b;
    }

    // method 3: multiplication
    public static int multiply(int a, int b) {
        return a * b;
    }

    // method 4: division
    public static String divide(int a, int b) {
        if (b == 0) {
            return "Not Defined";

        }
        return String.valueOf((double) a / b);
    }

    public static void main(String[] args) {
        System.out.println("For simplecal.java");
        // create Scanner object
        Scanner sc = new Scanner(System.in);
        // take input from user
        System.out.println("Enter First Number:");
        int a = sc.nextInt();

        System.out.println("Enter Secopnd Numbver:");
        int b = sc.nextInt();
        // perform operations
        System.out.println(" Adition:" + add(a, b));
        System.out.println("Subtraction:" + sub(a, b));
        System.out.println("Multiplication:" + multiply(a, b));
        System.out.println("Division:" + divide(a, b));
        sc.close();
    }
}
