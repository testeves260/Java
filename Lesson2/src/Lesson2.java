import java.util.Scanner;
import java.util.Locale;

public class Lesson2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Hi, this is Lesson 2");
		exercise6();

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
		//calcula o valor do salario do trabalhador e imprime o numero funcionario e o salario com base no valor à hora.
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Numero Fncionário:");
		int numeroFuncionario = sc.nextInt();
		System.out.println("Numero Horas Trabalhadas:");
		int numeroHoras = sc.nextInt();
		System.out.println("Valor recebe à hora:");
		double valorHora = sc.nextDouble();
		
		double calculoSalarial = (numeroHoras * valorHora);
		
		System.out.println("Number:" + numeroFuncionario);
		System.out.printf("Salary: U$ %.2f", calculoSalarial);
		
		sc.close();
	}
	static void exercise5() {
		//Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o
		//código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago.
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Coloque o Codigo da Peça a registar:");
		int codigoPeca1 = sc.nextInt();
		System.out.println("Coloque a quantidade:");
		int quantidade1 = sc.nextInt();
		System.out.println("Coloque o valor unitário:");
		double valor1 = sc.nextDouble();
		double total1 = quantidade1 * valor1;
		
		System.out.println("Coloque o Codigo da Peça a registar:");
		int codigoPeca2 = sc.nextInt();
		System.out.println("Coloque a quantidade:");
		int quantidade2 = sc.nextInt();
		System.out.println("Coloque o valor unitário:");
		double valor2 = sc.nextDouble();
		double total2 = quantidade2 * valor2;
		
		double subtotal = total1 + total2;
		
		System.out.printf("VALOR A PAGAR: %.2f%n", subtotal);
		sc.close();
	}
	static void exercise6() {
		/*
		 * Fazer um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C. Em seguida, calcule e
		 * mostre:
		 * a) a área do triângulo retângulo que tem A por base e C por altura.
		 * b) a área do círculo de raio C. (pi = 3.14159)
		 * c) a área do trapézio que tem A e B por bases e C por altura.
		 * d) a área do quadrado que tem lado B.
		 * e) a área do retângulo que tem lados A e B
		 */
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
	
		System.out.println("Ponto 1 fultuante:");
		double valueA = sc.nextDouble();
		System.out.println("Ponto 2 fultuante:");
		double valueB = sc.nextDouble();
		System.out.println("Ponto 3 fultuante:");
		double valueC = sc.nextDouble();
		
		double areaTriangle =  ((valueA * valueC)/2);
		double areaCicle = (3.14159 * (valueC * valueC));
		double areaTrapezio = (((valueA + valueB)*valueC)/2);
		double areaQuadrado = (valueB * valueB);
		double areaRetangulo = (valueA * valueB);
		
		System.out.printf("TRIANGULO: %.4f%n", areaTriangle);
		System.out.printf("CIRCULO: %.4f%n", areaCicle);
		System.out.printf("TRAPEZIO: %.4f%n", areaTrapezio);
		System.out.printf("QUADRADO: %.4f%n", areaQuadrado);
		System.out.printf("RETANGULO: %.4f%n", areaRetangulo);
		
		sc.close();
	}
}
