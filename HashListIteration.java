package com.assignments;

import java.util.ArrayList;
import java.util.Iterator;

public class HashListIteration {
	public static void main(String[] args) {
		 ArrayList<String> hashList = new ArrayList<>();
	        hashList.add("Apple");
	        hashList.add("Banana");
	        hashList.add("Orange");
	        hashList.add("Grapes");

	      
	        System.out.println("Iterating through the hash list:");
	        Iterator<String> iterator = hashList.iterator();
	        while (iterator.hasNext()) {
	            String element = iterator.next();
	            System.out.println(element);
	        }
	}

}
