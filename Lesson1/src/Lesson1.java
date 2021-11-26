import java.util.Locale;

public class Lesson1 {

	public static void main(String[] args) {
		
		//Estrutura sequencial
		//Exercise 1
		
		String product1 = "Computer";
		String product2 = "Office desk";
		
		int age = 30;
		int code = 5290;
		char gender = 'F';
		
		double price1 = 2100.0;
		double price2 = 650.50;
		double measure = 53.234567;
		
		/*Output:
		 * Products:
		   Computer, which price is $ 2100,00
		   Office desk, which price is $ 650,50
		   Record: 30 years old, code 5290 and gender: F
		   Measue with eight decimal places: 53,23456700
		   Rouded (three decimal places): 53,235
		   US decimal point: 53.235
		 * 
		 */
		
		System.out.println("Products:");
		System.out.printf("Computer, which price is %f%n", price1);
		System.out.printf("Office desk, which price is $ %f%n", price2);
		System.out.printf("Record %d years old, code %d and gender %s%n", age, code, gender);
		System.out.printf("Measure with eight decimal places: %.8f%n", measure);
		System.out.printf("Rouded (three decimal places): %.3f%n", measure);
		Locale.setDefault(Locale.US);
		System.out.printf("US decimal point: %.3f%n", measure);
		
	}

}
