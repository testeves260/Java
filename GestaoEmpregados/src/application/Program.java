package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Empregados;

public class Program {

    public static void main(String[] args) {

        //Set scanner and locale
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        //Create main list to receive objects
        ArrayList <Empregados> myList = new ArrayList<Empregados>();

        System.out.println("Register how many employees?");
        int answer = sc.nextInt();

        for(int i = 0; i < answer; i++){
            System.out.println("Set Employee ID:");
            int id = sc.nextInt();
            System.out.println("Set Employee Name:");
            String name = sc.next();
            System.out.println("Set Employee Salary:");
            double salary = sc.nextDouble();

            myList.add(new Empregados(name, id, salary));
        }

        for(int i = 0; i < myList.size(); i++){
            System.out.println("Employee #" + (i+1));
            System.out.println("ID: " + myList.get(i).getID());
            System.out.println("Name: " + myList.get(i).getName());
            System.out.println("Salary: " + myList.get(i).getSalary());
        }

        System.out.println("Enter the employee id that will have salary increase: ");
        int idToIncrease = sc.nextInt();
        Integer pos = doesIdExists(myList, idToIncrease);

        if(pos == null){
            System.out.println("ID does not exist");
        } else {
            System.out.println("Enter the percentage: ");
            double percentage = sc.nextDouble();
            myList.get(pos).setSalaryRaise(percentage);
        }
        System.out.println("List of Employees: ");
        for(int i = 0; i < myList.size(); i++){
            System.out.println(myList.get(i).getID() + ": " + myList.get(i).getName() + ", " + myList.get(i).getSalary());
        }

    }
    //Check if ID exists with a external function.
    public static Integer doesIdExists(List<Empregados> list, int id){
        for(int i = 0; i < list.size(); i++){
            if(list.get(i).getID() == id){
                return i;
            }
        }
        return null;
    }
}