package com.set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetDemo {
	
	public static void main(String[] args) {
		LinkedHashSet set = new LinkedHashSet<>();
		//Set set2 = new LinkedHashSet<>();
		//HashSet set3 = new LinkedHashSet<>();
		
		set.add(10);//true
		set.add("rahul");
		set.add(null);
		set.add("rahul");//false
		set.add(null);//false
		
		
		HashSet set2 = new HashSet<>(set);
		set2.add(10);
		set2.add(30);
		
		//set.addAll(set2);
		
		System.out.println(set2);
		
	}

}
