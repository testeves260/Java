package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Empregados;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		List <Empregados> myList = new ArrayList<>();
		
		System.out.println("Registar quantos empregados?");
		int employeesQty = sc.nextInt();
		
		for ( int i = 1; i < employeesQty+1; i++) {
			System.out.println("Empregado #" + i);
			
			System.out.println("ID: ");
			Integer employerID = sc.nextInt();
			System.out.println("Nome: ");
			String employerName = sc.next();
			System.out.println("Salário: ");
			double employerSalary = sc.nextDouble();

			
			myList.add(new Empregados(employerID, employerName, employerSalary));
		}

		
		System.out.println("Insira o ID de funcionário: ");
		int IncreaseSalaryToId = sc.nextInt();
		
		Integer pos = getPos(myList, IncreaseSalaryToId);
		if (pos == null) {
			System.out.println("Este ID não existe");
			
		} else {
			System.out.println("Qual a %% de aumento: ");
			double percentage = sc.nextDouble();

			myList.get(pos).increaseSalary(percentage);
			System.out.println("O salário foi aumentado para " + myList.get(pos).getSalary());
		}

		System.out.println("Lista de empregados:");
		for(Empregados empregado: myList) {
			System.out.println(empregado.getId() + ", " + empregado.getName() + ", " + empregado.getSalary());	
		}
	}
	
	public static Integer getPos(List<Empregados> list, int id) {
		
		for(int i = 0; i < list.size(); i++) {
			
			if(list.get(i).getId() == id) {
				return i;
			}
		}
		return null;
	}
}