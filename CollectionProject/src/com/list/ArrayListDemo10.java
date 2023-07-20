package com.list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo10 {
	
	public static void main(String[] args) {
		List list1 = new ArrayList<>();
		list1.add(10);
		list1.add(20);
		list1.add(30);
		
		Object[] objects=list1.toArray();
		
		for(Object obj : objects) {
			System.out.println(obj);
		}
	}

}
