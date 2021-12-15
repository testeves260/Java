package application;

import java.util.Scanner;

import entities.Customer;

public class Program {

	public static void main(String[] args) {		
		Scanner sc = new Scanner(System.in);
		
		//make a vector
		Customer[] vec = new Customer[9];
		
		System.out.println("How many rooms will be rented: ");
		int roomsToRent = sc.nextInt();
		
		for(int i = 1; i < roomsToRent+1; i++) {
			int room;
			
			System.out.println("Rent #" + i + ":");
			System.out.println("Name: ");
			String name = sc.next();
			System.out.println("Email: ");
			String email = sc.next();
			System.out.println("Nice! Now Select the Room you want to Staay from 1 to 10.");
			
			do {
				System.out.println("Room: ");
				room = sc.nextInt();
			} while(room <= 0 || room >= 11);
			
			Customer customer = new Customer(name, email, room);
			vec[customer.getRoomNumber()] = customer;
		}
		
		System.out.println("Busy Rooms: ");
		
		for(int i = 0; i < vec.length; i++) {
			if(vec[i] != null) {
				System.out.println(vec[i].getRoomNumber() + ": " + vec[i].getName() + ", " + vec[i].getEmail());
			}
		}
	}
}