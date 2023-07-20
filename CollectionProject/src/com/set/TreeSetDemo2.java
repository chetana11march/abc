package com.set;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo2 {
	
	public static void main(String[] args) {
		TreeSet set = new TreeSet<>();
		set.add(10);
		set.add(5);
		set.add(25);
		
		System.out.println(set.first());//
		System.out.println(set.last());
		Iterator itr=set.descendingIterator();
		  while(itr.hasNext()) {
			  System.out.println(itr.next());
		  }
		
		  System.out.println(set);
	}

}
