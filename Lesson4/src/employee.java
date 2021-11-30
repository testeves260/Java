public class employee {
	
	String name;
	double grossSalary;
	double tax;
	
	double NetSalary() {
		double result = grossSalary - tax;
		return result;
	}
	
	double IncreaseSalary(double percentage) {
		double convertedPercentage = percentage / 100;
		grossSalary = (grossSalary * convertedPercentage) + grossSalary;
		return grossSalary;
	}
}
