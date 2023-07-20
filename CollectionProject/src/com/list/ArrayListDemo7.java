package com.list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo7 {
	public static void main(String[] args) {
		ArrayListDemo7 demo = new ArrayListDemo7();
		List<Employee> list=demo.getEmployeeList();
		
		System.out.println(list);
	}
	
	public List<Employee> getEmployeeList(){
		List<Employee> list = new ArrayList<Employee>();
		list.add(new Employee(101,"Ram", 10000));
		list.add(new Employee(102, "Shyam", 20000));
		
		return list;
		
		
	}

}
