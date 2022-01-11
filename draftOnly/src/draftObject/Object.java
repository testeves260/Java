package draftObject;

import java.util.Scanner;
import java.util.Locale;

public class Object {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = 3;
		int x = 3;
		
		
		int [][] m = new int [a][x];
		
		if(m[3][2]) {
			System.out.println("true");	
		} else {
			System.out.println("false");
		}
	}
}
