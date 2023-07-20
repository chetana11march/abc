package com.vector;

import java.util.Vector;

public class VectorDemo {
	public static void main(String[] args) {
		Vector v = new Vector<>();
		
		v.add(30);
		v.add(40);
		v.add("abc");
		
		System.out.println(v);
		System.out.println(v.capacity());//10
		System.out.println(v.size());//3
		
		v.add(30);
		v.add(40);
		v.add("abc");
		v.add(30);
		v.add(40);
		v.add("abc");
		v.add(30);
		System.out.println(v.capacity());//10
		System.out.println(v.size());//10
		System.out.println("11 th elements>>");
		v.add(40);
		System.out.println(v.capacity());//20
		System.out.println(v.size());//11
		
		//v.addElement(obj);
	}

}
