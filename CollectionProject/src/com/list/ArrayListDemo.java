package com.list;

import java.util.ArrayList;

public class ArrayListDemo {
	
	public static void main(String[] args) {
		ArrayList<Object> list = new ArrayList<>();
		list.add(10);//0
		list.add("Rahul");//1
		list.add(true);//2
		list.add(null);//3
		list.add('a');//4
		list.add(null);//5
		list.add("Rahul");//6
		
		//list.add(5, "Abc");
		
		System.out.println(list);
		
		 //retrieval 
		//System.out.println(list.get(1));
		
		//list.remove(10);//
		
		//System.out.println("After removal>>");
		//System.out.println(list);
		
		//list.set(1, "Rohit");
		
		//System.out.println("After Updation>>");
		//System.out.println(list);
		
		
		//System.out.println(list.indexOf("Rahul"));
		
		System.out.println(list.lastIndexOf("Rahul"));
	
		
		
		
		
		
	}

}
