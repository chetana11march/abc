package com.stack;

import java.util.List;
import java.util.Stack;
import java.util.Vector;

public class StackDemo {
	
	public static void main(String[] args) {
		Stack s = new Stack<>();
		/*Vector s1 = new Stack<>();
		List l = new Stack();*/
		
		s.push(10);
		s.push(20);
		s.push(30);
		s.push(40);
		
		System.out.println(s);
		
		System.out.println(s.peek());//40
		
		s.pop();//remove top elt
		
		System.out.println(s);
		
		System.out.println(s.search(50)); // not present => -1
		System.out.println(s.search(10));//3
		System.out.println(s.search(30));//1
	}

}
