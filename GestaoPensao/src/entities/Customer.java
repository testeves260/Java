package entities;

public class Customer {
	
	private String name;
	private String email;
	private int roomNumber;
	
	public Customer(String name, String email, int room) {
		this.name = name;
		this.email = email;
		this.roomNumber = room;
	}
	
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return this.email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getRoomNumber() {
		return roomNumber;
	}
	public void setRoomNumber(int roomNumber) {
		this.roomNumber = roomNumber;
	}
	
}
