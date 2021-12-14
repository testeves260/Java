package entities;

public class Product {
	
	private String name;
	private int accountNumber;
	private double balance;
	
	public Product(String name, int accountNumber, double balance) {
		super();
		this.name = name;
		this.accountNumber = accountNumber;
		depositMoney(balance);
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAccountNumber() {
		return this.accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public double getBalance() {
		return this.balance;
	}

	public void depositMoney(double amount) {
		this.balance += amount;
	}
	
	public void withdraw(double amount) {
		this.balance -= (amount + 5);
		System.out.println("You paid 5$ of taxes.");
	}
	
	
}