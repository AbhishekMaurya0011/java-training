public class SimpleCalulator {
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
    public static int divide(int a, int b) {
        return (a / b);
    }

    public static void main(String[] args) {
        System.out.println("For SimpleCalulator.java");
        // declear two numbers
        int a = 200;
        int b = 100;
        // call the funtion and print result
        System.out.println("Addition:" + add(a, b));
        System.out.println("Subtraction:" + sub(a, b));
        System.out.println("Multiplication:" + multiply(a, b));
        System.out.println("Division:" + divide(a, b));

    }
}
