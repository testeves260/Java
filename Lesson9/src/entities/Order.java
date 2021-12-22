package entities;

import java.util.Date;

import entities.enums.OrderStatus;

public class Order {
	
	private Date moment;
	private OrderStatus status;
	
	public Order() {
		
	}
	
	public Order(Date moment, OrderStatus status) {
		super();
		this.moment = moment;
		this.status = status;
	}
	
	
	public void addItem(OrderItem item) {
		//(Verificar como implementar... implementar em arrayList ??
	}
	
	public void removeItem(OrderItem item) {
		
	}
	
	public Double total() {
		
	}

}
