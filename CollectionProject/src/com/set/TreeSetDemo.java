package com.set;

import java.util.TreeSet;

public class TreeSetDemo {
	public static void main(String[] args) {
		TreeSet ts = new TreeSet<>();
		ts.add("jay");
		ts.add("rahul");
		ts.add("akshay");
		//ts.add(10);
		//ts.add(null);
		ts.add("null");
		ts.add("jay");
		
		TreeSet ts2 = new TreeSet<>();
		ts2.add("ashwini");
		ts2.add("siya");
		ts.addAll(ts2);
		
		System.out.println(ts);
	}

}
