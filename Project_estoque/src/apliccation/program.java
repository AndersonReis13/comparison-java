package apliccation;

import java.util.Locale;
import java.util.Scanner;

import entites.product;

public class program {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		product Product = new product();
		
		Locale.setDefault(Locale.US);
		
		System.out.println("Enter product data: ");
		System.out.print("Name: ");
		Product.name = sc.nextLine();
		System.out.print("Price: ");
		Product.price = sc.nextDouble();
		System.out.print("Quantity: ");
		Product.quantity = sc.nextInt();
		
		System.out.println("Product data: " + Product);
		System.out.println();
		
		System.out.print("Enter the number of products to be added in stock: ");
		int quantity =  sc.nextInt();
		Product.AddProducts(quantity);
		
		System.out.println("Updated data: " + Product.toString());
		
		System.out.print("Enter the number of products to be remove in stock: ");
		int quantityAux =  sc.nextInt();
		Product.RemoveProducts(quantityAux);
		
		System.out.println("Updated data: " + Product.toString());
		
		
		
		
		
		
		
		sc.close();
		
		
	}
	
}
