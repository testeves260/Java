import java.util.Locale;
import java.util.Scanner;

public class Lesson4 {

	public static void main(String[] args) {
		//Class about repititive sctructures
		
		exercise4();
	}
	
	static void exercise1() {
		
		Scanner sc = new Scanner(System.in);
		
		int correctPass = 2002;
		System.out.printf("User: Anonymous%nSenha: ");
		int x = sc.nextInt();
		
		while ( x != correctPass) {
			System.out.printf("Senha incorreta.%nSenha:");
			x = sc.nextInt();
		}
		
		System.out.printf("%nBem vindo Anonymous%n");
		System.out.println("Setting up workspace.");
		sc.close();
	}
	static void exercise2() {
		//For loops

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insira um numero inteiro");
		int x = sc.nextInt();
		
		for(int i = 0; i <= x; i++) {
			
			if (i % 2 == 1) {
				System.out.printf("Os numeros in range impares são:%n");
				System.out.println(i);
			}
			
		}
		
		sc.close();
	}
	static void exercise3() {
		//Verificar se os numeros introduzidos estão dentro de um range especifico de 10 - 20.
		Scanner sc = new Scanner(System.in);

		int in = 0;
		int out = 0;
		
		int validTries = 5; //Alterar quantidade de tentativas
		
		for (int i = 1; i <= validTries; i++) {
			System.out.println("Digite um numero inteiro:");
			int value = sc.nextInt();
			if(value <= 20 && value >= 10) {
				in = in +1;
			} else {
				out = out +1;
			}
		}
		
		System.out.println(in + " in");
		System.out.println(out + " out");
		
		sc.close();
	}
	static void exercise4() {
		//Programa para converter uma temperatura de Celsius para Frhn.
		
		Scanner sc = new Scanner(System.in);
		
		char userChoise;
		do {
			System.out.println("Insira a temperatura em Cº para converter para Fº");
			double userTemp = sc.nextDouble();
			
			//Calculate:
			double f = ((9 * userTemp) / 5 )+ 32;
			System.out.printf("Conversão %.2f%n", f);
			
			System.out.println("Deseja converter novamente? (S/N)");
			userChoise = sc.next().charAt(0);
			
		} while(userChoise == 'S' || userChoise == 's');
		
		
		sc.close();
	}
	static void exercise5() {
		
	}
}
