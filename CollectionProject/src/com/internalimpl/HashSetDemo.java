package com.internalimpl;

import java.util.HashMap;
import java.util.HashSet;

public class HashSetDemo {
	
	public static void main(String[] args) {
		HashSet set = new HashSet<>();
		//return map.put("abcd" ,  PRESENT) == null;
		set.add("abcd");
		   // return true;
		set.add("suraj");
		  // return map.put("suraj", "PRESENT") == null
		   //return null == null;
		   //return true;
		set.add("abcd");
		    //return map.put("abcd", "PRESENT") == null;
		    //return "PRESENT" == null ;
		    // false
		set.add(null);
		     //return map.put(null, "PRESENT" ) == null;
		     //return null == null;
		     // return true;
		set.add(null);
		      //return map.put(null, "PRESENT" ) == null
		      // return "PRESENT"  == null;
		      //return false;
		
		
		System.out.println(set);
		
		   /*1) null . if key is unique.
		   2) old value of key , if key is duplicate*/
		HashMap map = new HashMap<>();
		map.put("abcd", "PRESENT"); //null
		map.put("suraj", "PRESENT"); //null
		map.put("abcd", "PRESENT");//"PRESENT"
		
		System.out.println(map);
	}

}
