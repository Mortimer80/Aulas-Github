package sectionNine;

import java.util.Locale;
import java.util.Scanner;
import entities.Product;

public class Aula74 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Product produto = new Product();
		System.out.println("Enter product data: ");
		System.out.print("Name: ");
		produto.name = sc.nextLine();
		System.out.print("Price: ");
		produto.price = sc.nextDouble();
		System.out.print("Quantity in stock: ");
		produto.quantity = sc.nextInt();
		
		System.out.println();
		System.out.println("Product Data: " + produto); //produto.toString()
		
		System.out.println();
		System.out.print("Enter the number of products to be added in stock:");
		int quantidade = sc.nextInt();
		produto.addProducts(quantidade);
		
		System.out.println();
		System.out.println("Product Data: " + produto);
		
		System.out.println();
		System.out.print("Enter the number of products to be removed in stock:");
		quantidade = sc.nextInt();
		produto.removeProducts(quantidade);
		
		System.out.println();
		System.out.println("Product Data: " + produto);
		
		

		sc.close();

	}

}
