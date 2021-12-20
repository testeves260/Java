package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Lists {

	public static void main(String[] args) {
		
		List<Integer> intList = new ArrayList<>();
		List<String> strList = new ArrayList<>();
		
		
		intList.add(1);
		strList.add("Bob");
		strList.add("Tarzan");
		strList.add("Brad");
		strList.add("Johanna");
		strList.add("Jessy");
		strList.add("Rihanna");
		strList.add("Tarzan");
		strList.add("Ana");
		strList.add("Charen");
		strList.add("Daniel");
		strList.add(1, "Yopkins");
		
		System.out.println(intList);
		System.out.println(strList);

		//make a for each to read all the elements in strList
		System.out.println("-----------------------------");
		
		for(String name : strList) {
			System.out.println(name);
		}

		//remove a element of the list by checking the first character.
		System.out.println("-----------------------------");
		
		strList.removeIf(x -> x.charAt(0) == 'Y');
		
		for(String name : strList) {
			System.out.println(name);
		}
		
		//check what is the index of a certain element in the list
		System.out.println("-----------------------------");
		
		System.out.println("The index of Charen is: " + strList.indexOf("Charen"));
		
		//Erase every element that does not start with a certain character
			// First, check all the elements that doesn't start with that condition by running
			//a lambda function,  and finally return the result to a created new list.
			// Create the list with name "result" and print it only with the strList elements that start with "J" 
		System.out.println("-----------------------------");
		
		List<String> result = strList.stream().filter(x -> x.charAt(0) == 'J').collect(Collectors.toList());
	
		for(String name : result) {
			System.out.println(name);
		}
		
	}

}
