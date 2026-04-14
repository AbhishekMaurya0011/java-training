/*Input from the user,I want to calcutate bill for  purchased products so that I can know the total cost of purchased products.*/

// ProductBilling class to demonstrate method overloading

import java.util.Scanner;

class ProductBilling {

    public static void main(String[] args) {
        System.out.println("For Product Billing Demo.java");
        // create Scanner object
        Scanner sc = new Scanner(System.in);
        // take input from user
        System.out.println("Enter First Product Price:");
        int a = sc.nextInt();

        System.out.println("Enter Second Product Price :");
        int b = sc.nextInt();
        System.out.println("Enter Third Product Price :");
        int c = sc.nextInt();
        // perform operations
        System.out.println("\nTotal Bill (1 product): " + a);
        System.out.println();
        System.out.println("Total Bill (2 products): " + (a + b));
        System.out.println();
        System.out.println("Total Bill (3 products): " + (a + b + c));
        sc.close();
    }
}
