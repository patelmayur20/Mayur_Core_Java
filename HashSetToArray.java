package com.assignments;

import java.util.HashSet;

public class HashSetToArray {
	public static void main(String[] args) {
		  HashSet  hs = new HashSet();
	        hs.add("Apple");
	        hs.add("Banana");
	        hs.add("Orange");
	        hs.add("Grapes");
	        hs.add("Mango");

	        String[] array = new String[hs.size()];
	        hs.toArray(array);
	        System.out.println("Elements in the Array:");
	        for (String element : array) {
	        System.out.println(element);
	        }
	}

}
