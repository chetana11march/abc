package com.set;

import java.util.HashSet;

public class SetDemo {
	
	public static void main(String[] args) {
		HashSet hs = new HashSet<>();
		hs.add("suraj"); //true
		hs.add(10); //true
		hs.add(null); //true
		hs.remove(10);
		hs.add(10); //true
		hs.add(null);//false
		
		System.out.println(hs.contains("Suraj"));
		
	
		
		
		System.out.println("Set>>"+hs);
		
		
		
	}

}
