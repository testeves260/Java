import java.util.Scanner;
import java.util.Locale;


public class Lesson3 {

	public static void main(String[] args) {
		
		System.out.println("Hey, this is Lesson 3");
		exercise1();
	}
	static void exercise1() {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insira o numero do dia da semana 1 - 7");
		int weekDay = sc.nextInt();
		
		switch(weekDay) {
		
		case 1:
			System.out.println("Segunda-Feira");
			break;
		case 2:
			System.out.println("Terça-Feira");
			break;
		case 3:
			System.out.println("Quarta-Feira");
			break;
		case 4:
			System.out.println("Quinta-Feira");
			break;
		case 5:
			System.out.println("Sexta-Feira");
			break;
		case 6:
			System.out.println("Sábado!");
			break;
		case 7:
			System.out.println("Domingo!");
			break;
		}
		
		if(weekDay <= 3) {
			System.out.println("Não desanimes, distrai-te que o tempo corre!");
		} else if(weekDay == 4) {
			System.out.println("Anima-te é quase Fim de semana!!");
		} else if(weekDay == 5) {
			System.out.println("Hoje é dia de borga!!");
		}
	}
}
