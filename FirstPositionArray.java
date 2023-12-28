package com.assignments;

import java.util.ArrayList;

public class FirstPositionArray {
	  public static void main(String[] args) {
	        ArrayList<Integer> numbers = new ArrayList<>();
	        numbers.add(10);
	        numbers.add(20);
	        numbers.add(30);
            System.out.println("Original ArrayList: " + numbers);
	        int elementToInsert = 345678;
	        numbers.add(0, elementToInsert);
	        System.out.println("ArrayList after inserting at the first position: " + numbers);
	    }
}
