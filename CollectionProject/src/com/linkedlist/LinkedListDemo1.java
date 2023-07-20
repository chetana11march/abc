package com.linkedlist;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListDemo1 {
	
	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<>();
		list.add(10);
		//list.add(true);
		//list.add("abc");
		//list.add(null);
		list.add(20);
		list.add(30);
		list.addLast(80);
		list.add(2,25);
		list.addFirst(60);
		
		System.out.println("Before sorting");
		System.out.println(list);
		
		//System.out.println(list.capacity()); = not present
		/*System.out.println("Using iterator");
		Iterator< Integer> itr=list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("Using for loop");
		for(Integer i : list) {
			System.out.println(i);
		}
		
		System.out.println("Using listiterator");
		ListIterator<Integer> listItr=list.listIterator(list.size());
		while(listItr.hasPrevious()) {
			System.out.println(listItr.previous());
		}
		*/
		Collections.sort(list);
		System.out.println("after sorting>>");
		System.out.println(list);
		
		
	}

}
