package com.list;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListDemo4 {
	
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(5);
		list.add(1);
		//list.add((int) 'a');
		
		System.out.println("Size of list>>"+list.size());
		/*for(int i=0 ; i<list.size(); i++) {
			System.out.println(list.get(i)); //list.get(0)
			
		}*/
		
		//System.out.println(list.contains(10));
		System.out.println("Before Sorting>>");
		for(int i : list) {
			System.out.print(i+" ");
		}
		Collections.sort(list);
		
		System.out.println("After Sorting>>" + list);
		
		
		
	}

}
