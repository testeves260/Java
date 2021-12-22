package application;

import entities.Order;
import entities.OrderItem;
import entities.enums.OrderStatus;

public class Program {

	public static void main(String[] args) {
		
		System.out.println("Insira quantidade de produtos:");
		int quanitity = sc.nextInt();
		System.out.println("Insira o custo do produto:");
		Double price = sc.nextDouble();
		
		OrderItem o = new OrderItem(quantity, price);
		
		Order x = new Order("Date", OrderStatus.PENDING_PAYMENT);
		
		x.addItem(o);
		
		
		
		

	}

}
