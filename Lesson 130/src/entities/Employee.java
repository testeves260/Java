package entities;

import java.util.ArrayList;
import java.util.List;
import java.lang.StringBuilder;


public class Employee {
	
	protected String name;
	protected Integer hours;
	protected Double valuePerHour;
	
	public Employee() {}
	
	public Employee(String name, Integer hours, Double valuePerHour) {
		this.name = name;
		this.hours = hours;
		this.valuePerHour = valuePerHour;
	}

	//Get && Setters:
	public Integer getHours() {
		return hours;
	}

	public void setHours(Integer hours) {
		this.hours = hours;
	}

	public Double getValuePerHour() {
		return valuePerHour;
	}

	public void setValuePerHour(Double valuePerHour) {
		this.valuePerHour = valuePerHour;
	}
	
	//Other Methods:	
	public Double payment() {
		//payment is equal to hours multiplied by valueperHour\		
		return hours*valuePerHour;
	}

	public String toString(Employee employee) {
		return employee.name + " - $" + employee.payment();
	}
}
