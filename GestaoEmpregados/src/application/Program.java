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
		
		List <Object> myList = new ArrayList<Object>();
		
		int employerID = 0;
		String employerName = "";
		double employerSalary = 0.0;
		
		Empregados employee = new Empregados(employerID, employerName, employerSalary);
		
		
		System.out.println("How many employees will be registered?");
		int employeesQty = sc.nextInt();
		
		for ( int i = 1; i < employeesQty+1; i++) {
			System.out.println("Employee #" + i);
			
			System.out.println("ID: ");
			employerID = sc.nextInt();
			System.out.println("Name: ");
			employerName = sc.next();
			System.out.println("Salary: ");
			employerSalary = sc.nextDouble();
			
			myList.add(employee);
		}	
		
		System.out.println("Enter the employee id that will have salary increase: ");
		int idToIncrease = sc.nextInt();
		
		System.out.println("Enter the percentage: ");
		double percentage = sc.nextDouble();	
		
		for(int i = 0; i < myList.size(); i++) {

			if(myList)
			}		
		}
		System.out.println("List of employees:");
		for(int i = 0; i < myList.size(); i++) {
			System.out.println(employee.getId() + ", " + employee.getName() + ", " + employee.getSalary());
		}
	}
}