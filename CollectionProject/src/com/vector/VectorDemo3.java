package com.vector;

import java.util.Vector;

public class VectorDemo3 {
	public static void main(String[] args) {
		Vector v = new Vector<>(12,2);
		
		v.add(30);
		v.add(40);
		v.add("abc");
		v.add(30);
		v.add(40);
		v.add("abc");
		v.add(30);
		v.add(40);
		v.add("abc");
		v.add(30);
		v.add(40);
		v.add("abc");
		
		System.out.println(v.capacity());//12
		System.out.println(v.size());//12
		
		v.add("abc");
		System.out.println(v.capacity());//14
		System.out.println(v.size());//13

		
		v.add("abc");
		v.add("abc");
		System.out.println("15 elts added>>");
		System.out.println(v.capacity());//16
		System.out.println(v.size());//15
		
	
	}

}
