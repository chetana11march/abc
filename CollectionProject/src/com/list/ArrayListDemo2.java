package com.list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo2 {
	
	public static void main(String[] args) {
	
		List list1 = new ArrayList<>();
		list1.add(10);
		list1.add(20);
		list1.add(30);
		
		List list2 = new ArrayList<>();
		list2.add(40);
		list2.add(50);
		list2.add(60);
		
		System.out.println("List1 before addition of list2>>"+list1);

		
		list1.addAll(list2);
		
		System.out.println("List1 after addition of list2>>"+list1);
	}

}
