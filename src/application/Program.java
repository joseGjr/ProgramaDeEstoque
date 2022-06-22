package application;

import Entities.Product;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Product product = new Product();
        System.out.print("Enter product data: " );
        System.out.println("Name:  ");
        product.name = sc.nextLine();

        System.out.print("Price: " );
        product.price = sc.nextDouble();
        System.out.println("Quantity in stock: ");
        product.quantity = sc.nextInt();

        System.out.println(product);

        sc.close();



    }
}
