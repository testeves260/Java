import java.util.Scanner;
import java.util.Locale;


public class Lesson3 {

	public static void main(String[] args) {
		
		System.out.println("Hey, this is Lesson 3");
		exercise1();
	}
	static void exercise1() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduza um n�mero inteiro:");
		int numero = sc.nextInt();
		
		if (numero > 0 ) {
			System.out.printf("N�mero %d � positivo", numero);
		} else {
			System.out.printf("N�mero %d � negativo", numero);
		}
		
		
	}
	static void exercise2() {
		
	}
}
