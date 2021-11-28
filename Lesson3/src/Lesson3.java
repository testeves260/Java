import java.util.Scanner;
import java.util.Locale;


public class Lesson3 {

	public static void main(String[] args) {
		
		//condições IF/ELSE/SWITCH/Condições ternárias:
		int value1 = 50;
		//Condição ternária
		double check = (value1 == 40) ? "OLA" : "MARIA";
		
		/*
		 * Switch
		 
		switch(value1) {
		case(10):
			System.out.println("false");
			break;
		case(20):
			System.out.println("false");
			break;
		case(50):
			System.out.println("true");
			break;
		}*/
		
		
		
		//exercise5();
	}
	static void exercise1() {
		//Insere um numero e verifique se é positivo ou negativo.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduza um número inteiro:");
		int numero = sc.nextInt();
		
		if (numero > 0 ) {
			System.out.printf("Número %d é positivo", numero);
		} else {
			System.out.printf("Número %d é negativo", numero);
		}
		sc.close();
	}
	static void exercise2() {
		//Fazer um programa para ler um número inteiro e dizer se este número é par ou ímpar.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insira um numero inteiro:");
		int numero = sc.nextInt();
		
		if (numero % 2 == 0) {
			System.out.println("PAR");
		} else {
			System.out.println("IMPAR");
		}
		sc.close();
	}
	static void exercise3() {
		/*Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem "Sao Multiplos" ou "Nao sao
		 * Multiplos", indicando se os valores lidos são múltiplos entre si. Atenção: os números devem poder ser digitados em
		 * ordem crescente ou decrescente.
		 */
		
		System.out.println("Programa para verificar se 2 numeros sao multiplos entre si.%n");
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insira o primeiro valor inteiro: ");
		int valueA = sc.nextInt();
		System.out.println("Insira o segundo valor inteiro: ");
		int valueB = sc.nextInt();
		
		
		if(valueA % valueB == 0 || valueB%valueA == 0) {
			System.out.println("São Multiplos");
		} else {
			System.out.println("Não São Multiplos");
		}
		sc.close();
	}
	static void exercise4() {
		/*
		 * Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo, sabendo que o mesmo pode
		 * começar em um dia e terminar em outro, tendo uma duração mínima de 1 hora e máxima de 24 horas.
		 */
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insira a Hora inicial do Jogo:");
		int startingHour = sc.nextInt();
		System.out.println("Insira a Hora fim do Jogo:");
		int endingHour = sc.nextInt();
		
		if(startingHour < endingHour) {
			int result = endingHour - startingHour;
			System.out.printf("A duração do jogo foi de %d", result);
		} else if(startingHour > endingHour) {
			int result = ((24 - startingHour) + endingHour);
			System.out.printf("A duração do jogo foi de %d", result);
		}
		sc.close();
	}
	static void exercise5() {
		/*Você deve fazer um programa que leia um valor qualquer e apresente uma mensagem dizendo em qual dos
		 * seguintes intervalos ([0,25], (25,50], (50,75], (75,100]) este valor se encontra. Obviamente se o valor não estiver em
		 * nenhum destes intervalos, deverá ser impressa a mensagem “Fora de intervalo”.
		*/
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		System.out.println("Insira um valor:");
		double value = sc.nextDouble();
		
		if(value >= 0 && value <= 25) {
			System.out.println("Intervalo [0, 25]");
		} else if(value > 25 && value <= 50) {
			System.out.println("Intervalo [25, 50]");
		} else if(value > 50 && value <= 75) {
			System.out.println("Intervalo [50, 75]");
		} else if(value > 75 && value <= 100) {
			System.out.println("Intervalo [75, 100]");
		} else if(value < 0 || value > 100) {
			System.out.println("Fora de intervalo");
		}
		sc.close();
	}
}
