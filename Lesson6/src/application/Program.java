package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		//Size of Vector:
		System.out.println("Size of Vector: ");
		int n = sc.nextInt();
		
		//Create Vector:
		Product[] vec = new Product[n];
		
		//Create Variables for Object:
		String name;
		double price;
		
		//Create a for Loop To inert object into vector:
		
		for(int i = 0; i < vec.length; i++) {
			
			System.out.println("Name: ");
			name = sc.next();
			
			System.out.println("Price: ");
			price = sc.nextDouble();
			
			//Create a Object of Class Type:
			Product product = new Product(name, price);
			
			//Put the object inside of vector index
			vec[i] = product;
		}
		
		double x = 0;
		
		for(int i = 0; i < vec.length; i++) {
			x += vec[i].getPrice();
		}
		
		double avgPrice = x / vec.length;
		
		
		System.out.printf("Average Price: %.2f €" ,avgPrice);
		
		
	}

}
