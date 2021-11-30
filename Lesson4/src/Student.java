public class Student {
	public String nome;
	public int nota1;
	public int nota2;
	public int nota3;
	
	public int finalGrade() {
		int sumGrades = nota1 + nota2 + nota3;
		return sumGrades;	
	}
	
	public int missingPoints() {
		int dif = 60 - finalGrade();
		
		if(dif <= 59 && dif >= 1) {
			return dif;
		}
		else {
			return 0;
		} 		
	}
}
