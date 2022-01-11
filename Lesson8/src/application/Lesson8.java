package application;

import java.util.Scanner;

public class Lesson8 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Numero de Linhas: ");
		int rows = sc.nextInt();
		
		System.out.println("Numero de Colunas: ");
		int columns = sc.nextInt();
		
		//Create a matriz bidimensional:
		int [][] matriz = new int [rows][columns];
		
		for (int i = 0; i < rows; i++) {
			for ( int j = 0; j < columns; j++) {
				System.out.println("Coloque os valores da matriz para a linha " + i);
				matriz[i][j] = sc.nextInt();
	
			}
		}
		
	}
}
