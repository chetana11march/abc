package com.list;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo9 {
	public static void main(String[] args) {
		String[] strArray = {"Ram", "Shyam", "Geeta"};
		
		List<String> list=Arrays.asList(strArray);
		
		//System.out.println(list);
		
		//iterator :
		Iterator<String> itr=list.iterator();
		
		/*while(itr.hasNext()) {
			System.out.println(itr.next());
		}*/
		
		for(int i=list.size()-1 ; i >= 0; i--) {
			System.out.println(list.get(i));
		}
		
		for(String str : list) {
			System.out.println(str);
		}
		
	}

}
