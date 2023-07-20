package com.list;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListDemo5 {
	
	public static void main(String[] args) {
		ArrayList<String> strList = new ArrayList<>();
		strList.add("shubham");
		strList.add("rahul");
		strList.add("snehal");
		strList.add("ajay");
		
		System.out.println("Before Sorting>>"+strList);
		Collections.sort(strList);
		
		System.out.println("After Sorting>>"+strList);
		
		Collections.synchronizedList(strList);
		
		//Collections.emptyList();
		
		
		
		
	}

}
