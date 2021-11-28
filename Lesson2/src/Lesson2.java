import java.util.Scanner;
import java.util.Locale;

public class Lesson2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		exercise3();

	}
	static void exercise1() {	
		//Devolva a soma de 2 valores
		System.out.println("Exercise 2:");
		Scanner sc = new Scanner(System.in);
		
		int y = sc.nextInt();
		int x = sc.nextInt();
		
		System.out.println("SOMA:"+ (y + x));
		
		sc.close();
	}
	static void exercise2() {
		//Devolve o resultado do calcula da área.
		Locale.setDefault(Locale.US); 
		
		System.out.println("Exercise 3:");
		
		Scanner sc = new Scanner(System.in);
		
		double pi = 3.14159;
		System.out.println("Insira o valor do raio:");
		double raio = sc.nextDouble();
		double area = pi * (raio*raio);
		System.out.printf("A = %.4f", area);
		
		sc.close();
	}
	static void exercise3() {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Introduza os 4 valores:");
		int x = sc.nextInt();
		int y = sc.nextInt();
		int z = sc.nextInt();
		int w = sc.nextInt();
		
		int diferenca = ((x * y) - (z * w)); 
		
		System.out.println("DIFERENÇA: " + diferenca);
		sc.close();
	}
	static void exercise4() {
		
		
		
	}

}
