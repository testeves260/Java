import java.util.Locale;
import java.util.Scanner;

public class Lesson4 {

	public static void main(String[] args) {
		//Class about repititive sctructures
		
		exercise3();
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
	}
	static void exercise2() {
		//For loops

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insira um numero inteiro");
		int x = sc.nextInt();
		
		for(int i = 0; i <= x; i++) {
			
			if (i % 2 == 1) {
				System.out.printf("Os numeros in range impares são:%n")
				System.out.println(i);
			}
			
		}
		
	}
	static void exercise3() {
		
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int validTries = 5; //ChangeMe
		
		int in = 0;
		int out = 0;
		
		for(int i = 0; n < validTries; i++) {
			if (i >= 10 && i <= 20){
				in = in + 1;
			} else {
				out = out + 1;
			}
		}
		
		
		System.out.println(in + " in");
		System.out.println(out + " out");
		
		sc.close();
	}
}
