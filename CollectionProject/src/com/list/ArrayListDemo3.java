package com.list;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo3 {
	
	public static void main(String[] args) {
		ArrayList<Object> list = new ArrayList<>();
		list.add(10);//0
		list.add("Rahul");//1
		list.add(true);//2
		list.add(null);//3
		list.add('a');//4
		list.add(null);//5
		list.add("Rahul");//6
		
		Iterator<Object> itr =list.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		
		
		
		
		
	}

}
