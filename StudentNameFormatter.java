import java.util.Scanner;

public class StudentNameFormatter {
    public static void main(String[] args) {
        System.out.println("For StudentNameFormatter.java");
        // Create a Scanner object to read input from the user
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Student Name:");
        String name = sc.nextLine();

        System.out.println("Original Name:" + name);
        System.out.println("Length:" + name.length());
        System.out.println("Uppercase:" + name.toUpperCase());
        System.out.println("Lowercase:" + name.toLowerCase());
        sc.close();

    }
}