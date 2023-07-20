package com.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class ArrayListDemo8 {
	
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		
		System.out.println("Enter 5 mobile nos>>");
		Scanner sc = new Scanner(System.in);
		
		for(int i=1; i<=5 ; i++) {
			
			String mobileNo=sc.next();
			list.add(mobileNo);
			
		}
		System.out.println("Mobile No>>");
		Iterator<String> itr=list.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		
	}

}
