import java.util.Locale;
import java.util.Scanner;

public class Lesson6 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		double [] vect = new double [n];
		
		
		for(int i = 0; i < vect.length; i++) {
			vect[i] = sc.nextDouble();
		}
		
		
		sc.close();

	}

}
