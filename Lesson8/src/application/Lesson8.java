package application;

import java.util.Scanner;

public class Lesson8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insira numero de linhas: ");
		int rows = sc.nextInt();
		
		System.out.println("Insira numero de colunas: ");
		int columns = sc.nextInt();
		
		//Create a matrix
		int [][] m = new int [rows][columns];
		
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				
				//Fill the matrix:
				System.out.println("Valor para a Matriz:");
				m [i][j] = sc.nextInt();
			}
		}
		
		System.out.println("Insira um valor da matriz: ");
		int checkNumber = sc.nextInt();
		
		for (int i = 0; i < rows ; i++) {
			for (int j = 0; j < columns; j++) {
				
				if(checkNumber == m[i][j]) {
					
					System.out.println("Position: " + i + ", " + j);

					if(i == 0) {
						if(j == 0) {
							System.out.println("Right: " + m[i][j+1]);
							System.out.println("Bottom: " + m[i+1][j]);
						} else if(j == (columns-1)) {
							System.out.println("Left: " + m[i][j-1]);
							System.out.println("Bottom: " + m[i+1][j]);
						} else {
							System.out.println("Right: " + m[i][j+1]);
							System.out.println("Left: " + m[i][j-1]);
							System.out.println("Bottom: " + m[i+1][j]);
						}
					}else if (i == (rows-1) ) {
						if(j == 0) {
							System.out.println("Top: " + m[i-1][j]);
							System.out.println("Right: " + m[i][j+1]);
						} else if(j == (columns-1)) {
							System.out.println("Top: " + m[i-1][j]);
							System.out.println("Left: " + m[i][j-1]);
						} else {
							System.out.println("Top: " + m[i-1][j]);
							System.out.println("Right: " + m[i][j+1]);
							System.out.println("Left: " + m[i][j-1]);
						}
					}else {
						if(j == 0) {
							System.out.println("Top: " + m[i-1][j]);
							System.out.println("Right: " + m[i][j+1]);
							System.out.println("Bottom: " + m[i+1][j]);
						} else if(j == (columns-1)) {
							System.out.println("Top: " + m[i-1][j]);
							System.out.println("Left: " + m[i][j-1]);
							System.out.println("Bottom: " + m[i+1][j]);
						} else {
							System.out.println("Top: " + m[i-1][j]);
							System.out.println("Right: " + m[i][j+1]);
							System.out.println("Left: " + m[i][j-1]);
							System.out.println("Bottom: " + m[i+1][j]);
						}
					}
				}	
			}
		}
		sc.close();
	}
}

