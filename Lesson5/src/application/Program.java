package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Product;

public class Program {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double balance = 0;
		
		System.out.println("Enter Account number:");
		int accountNumber = sc.nextInt();
		System.out.println("Enter Account holder:");
		String name = sc.next();
		System.out.println("Is there an initial deposit (y/n)?");
		char userChoise = sc.next().charAt(0);
		if(userChoise == 'y') {
			System.out.println("Enter initial deposit value:");
			balance = sc.nextDouble();
		} else {
			balance = 0;
		}

		Product product = new Product(name , accountNumber, balance);		


		/*		
		System.out.println("Your account number: " + product.getAccountNumber());
		System.out.println("Your account name: " + product.getName());
		System.out.println("Your account balance: " + product.getBalance());
		
		System.out.println("Make a deposit: value: ");
		double depositValue = sc.nextDouble();
		product.depositMoney(depositValue);
		
		System.out.println("Make a withdraw: value: ");
		double withdrawValue = sc.nextDouble();
		product.withdraw(withdrawValue);
		
		System.out.println("Your account balance: " + product.getBalance());
		
		*/
		
		
		sc.close();
		
	}
}