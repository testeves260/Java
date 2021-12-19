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
		
		int employerID = 0;
		String employerName = "";
		double employerSalary = 0.0;
		
		System.out.println("Registar quantos empregados?");
		int employeesQty = sc.nextInt();
		
		for ( int i = 1; i < employeesQty+1; i++) {
			System.out.println("Empregado #" + i);
			
			System.out.println("ID: ");
			employerID = sc.nextInt();
			System.out.println("Nome: ");
			employerName = sc.next();
			System.out.println("Salário: ");
			employerSalary = sc.nextDouble();

			
			myList.add(new Empregados(employerID, employerName, employerSalary));
		}

		
		System.out.println("Insira o ID de funcionário: ");
		int IncreaseSalaryToId = sc.nextInt();
		System.out.println("Qual a %% de aumento: ");
		double percentage = sc.nextDouble();
		
		
		for(Empregados empregado : myList) {
			if (empregado.getId() == IncreaseSalaryToId) {
				empregado.increaseSalary(percentage);
				System.out.println("O salário do/a colaborador/a " + empregado.getName() + " foi aumentado para " + empregado.getSalary() + "€");
			} else {
				System.out.println("O ID que mencionou não existe.");
			}
		}
		
		System.out.println("Lista de empregados:");
		for(Empregados empregado: myList) {
			System.out.println(empregado.getId() + ", " + empregado.getName() + ", " + empregado.getSalary());	
		}
	}
}