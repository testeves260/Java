import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//OOP exercises
		
		exercise3();
	}
	
	static void exercise1() {
		Scanner sc = new Scanner(System.in);
		
		employee e = new employee();
		
		e.name = "Jo�o Silva";
		e.grossSalary = 6000.00;
		e.tax = 1000.00;
		
		
		System.out.printf("Name: %s%n", e.name);
		System.out.printf("Gross salary: $%.2f%n", e.grossSalary);
		System.out.printf("Tax: $%.2f%n%n", e.tax);
		
		System.out.printf("Employee: %s, $ %.2f%n%n", e.name, e.NetSalary());
		System.out.printf("Which percentage to increase salary?");
		double percentage = sc.nextDouble();
		
		e.IncreaseSalary(percentage);
		
		System.out.printf("%nUpdated data: %s, $ %.2f%n", e.name, e.NetSalary());
		
		sc.close();
	}
	static void exercise2() {
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		rectangle r = new rectangle();
		
		System.out.println("Insira o valor da largura:");
		r.width = sc.nextDouble();
		System.out.println("Insira o valor da altura:");
		r.height = sc.nextDouble();
		
		System.out.printf("AREA = %.2f%n", r.area());
		System.out.printf("PERIMETER = %.2f%n", r.perimeter());
		System.out.printf("DIAGONAL = %.2f%n", r.diagonal());
		
		
		sc.close();
	}
	static void exercise3() {
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		Student s = new Student(); //Criar um novo objecto chamado "s"
		
		System.out.println("Insira o nome do estudante:");
		s.nome = sc.nextLine();
		System.out.println("Insira a nota do primeiro trimestre:");
		s.nota1 = sc.nextInt();
		System.out.println("Insira a nota do segundo trimestre:");
		s.nota2 = sc.nextInt();
		System.out.println("Insira a nota do terceiro trimestre:");
		s.nota3 = sc.nextInt();
		
		
		if (s.missingPoints() != 0){
			System.out.printf("FINAL GRADE = %d%n", s.finalGrade());
			System.out.println("FAILED");
			System.out.printf("MISSING %d POINTS %n", s.missingPoints());
		}
		else {
			System.out.printf("FINAL GRADE = %d%n", s.finalGrade());
			System.out.println("PASS");
		}
		
		sc.close();
	}
	
}

