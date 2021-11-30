package entities;

public class Student {
	String nome;
	int nota1;
	int nota2;
	int nota3;
	
	void finalGrade() {
		int sumGrades = nota1 + nota2 + nota3;
		
		int dif = 60 - sumGrades;
		
		if (sumGrades < 60){
			System.out.printf("FINAL GRADE = %d%n", sumGrades);
			System.out.println("FAILED");
			System.out.printf("MISSING %d POINTS %n", dif);
		}
		else {
			System.out.printf("FINAL GRADE = %d%n", sumGrades);
			System.out.println("PASS");
		}
	}
}
