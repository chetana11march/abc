package com.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetDemo2 {
	
	public static void main(String[] args) {
		Set<Integer> set = new HashSet<>();
		set.add(10);
		set.add(20);
		set.add(30);
		set.add(40);
		set.add(null);
		set.add(10);
		
		System.out.println("Set>>"+set);
		
		for(Integer i : set) {
			System.out.println(i);
		}
		
		Iterator<Integer> itr=set.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		/*for(int i=0; i<set.size();i++) {
			System.out.println(set.get[i]);
		}*/
		
		
		
		
		
	}

}
