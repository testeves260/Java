package entities;

public class OutsorceEmployee extends Employee {
	
	private Double additionalCharge;

	public OutsorceEmployee(String name, Integer hours, Double valuePerHour, Double additionalCharge) {
		super(name, hours, valuePerHour);
		this.additionalCharge = additionalCharge;
	}

	public Double getAdditionalCharge() {
		return additionalCharge;
	}

	public void setAdditionalCharge(Double additionalCharge) {
		this.additionalCharge = additionalCharge;
	}
	
	@Override
	public Double payment() {
		
		return super.payment() + additionalCharge;
	}
	
	public String toString(OutsorceEmployee employee) {
		return employee.name + " - $" + employee.payment();
	}
}
