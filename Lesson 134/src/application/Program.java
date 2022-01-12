package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Pessoa;
import entities.PessoaFisica;
import entities.PessoaJuridica;

public class Program {
	
	public static void main(String [] args) {
		
		Scanner sc = new Scanner (System.in);
		List <Pessoa> listPessoas = new ArrayList <>();
		
		System.out.println("Enter the number of tax payers: ");
		int pessoas = sc.nextInt();
		
		for(int i = 1; i <= pessoas; i++) {
			System.out.println("Tax payer #" + i + " data");
			
			System.out.print("Individual or company (i/c):");
			char a = sc.next().charAt(0);
			
			System.out.print("Name:");
			String name = sc.next();
			
			System.out.print("Anual Income:");
			Double income = sc.nextDouble();
			
			if(a == 'i') {
				System.out.print("Health expenditures:");
				Double despesas = sc.nextDouble();
				listPessoas.add(new PessoaFisica(name, income, 0.0, despesas));
			} else {
				System.out.print("Number of employees:");
				int em = sc.nextInt();
				listPessoas.add(new PessoaJuridica(name, income, 0.0, em));			
			}
		}
		
		System.out.println("TAXES PAID:");
		for (Pessoa p : listPessoas) {
			System.out.printf(p.getName() + " - " + p.totalTaxes() + "€.");
		}
		
		sc.close();
	}
}
