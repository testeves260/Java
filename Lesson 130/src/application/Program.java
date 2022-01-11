package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Employee;
import entities.OutsorceEmployee;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		List <Employee> employeeList = new ArrayList <> ();
		
		System.out.println("Enter the number of employees:");
		int employeesQty = sc.nextInt();
		
		for(int i = 0; i < employeesQty; i++) {
			System.out.println("Employee #" + (i+1) + " data:");
			System.out.println("Outsourced: (y/n)?");
			String outsourced = sc.next();
			System.out.println("Name: ");
			String name = sc.next();
			System.out.println("Hours: ");
			int hours = sc.nextInt();
			System.out.println("Value per Hour: ");
			Double value = sc.nextDouble();
			
			if(outsourced.charAt(0) == 'y') {
				System.out.println("Additional Charge:");
				Double additionalCharge = sc.nextDouble();
				Double outsourceBonus = (110/100)*additionalCharge+additionalCharge;
				
				Employee employee = new OutsorceEmployee(name, hours, value, outsourceBonus);
				employeeList.add(employee);
				System.out.println("Employee added to OS Employee List.");
				
				
			} else {
				
				Employee employee = new Employee(name, hours, value);
				employeeList.add(employee);
				System.out.println("Employee added to Employee List.\n");
			}
		}
		//print the result as shown in the exercise example.
		System.out.println("Payments:");
		for(int j = 0; j < employeeList.size(); j++) {
			System.out.println(employeeList.get(j).toString(employeeList.get(j)));
		}	
	}
}
