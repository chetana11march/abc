package com.list;

import java.util.ArrayList;
import java.util.ListIterator;

public class ArrayListDemo6 {
	
	public static void main(String[] args) {
		ArrayList<Employee> listOfEmp = new ArrayList<>();
		Employee emp1 = new Employee(101,"Rahul", 10000);
		listOfEmp.add(emp1);
		listOfEmp.add(new Employee(102, "snehal", 20000));
		listOfEmp.add(new Employee(103, "Geeta", 30000));//2
		
		//System.out.println(listOfEmp);
		
		ListIterator<Employee> listItr=listOfEmp.listIterator(listOfEmp.size());
		
		while(listItr.hasPrevious()) {
			System.out.println(listItr.previous());
		}
		
		
		
	}

}
