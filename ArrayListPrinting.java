package com.assignments;

import java.util.ArrayList;

public class ArrayListPrinting {
	public static void main(String[] args) {
		 ArrayList al = new ArrayList();
	        al.add("Apple");
	        al.add("Banana");
	        al.add("Orange");
	        al.add("Grapes");
	        al.add("Mango");

	        System.out.println("Elements of the ArrayList with their positions:");
	        for (int i = 0; i < al.size(); i++) {
	            System.out.println("Position " + i + ": " + al.get(i));
	        }
	}

}
