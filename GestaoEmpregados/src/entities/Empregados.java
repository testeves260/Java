package entities;

public class Empregados {
	
	private int id;
	private String name;
	private double salary;
	
	public Empregados(int id, String name, double salary) {
	
		this.id = id;
		this.name = name;
		this.salary = salary;
	
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public double increaseSalary(double percentage) {
		this.salary = this.salary + (this.salary * (percentage/100));
		
		return this.salary;
	}
	

}
