package com.assignments;

import java.util.ArrayList;

public class ReplaceSecondElement {
	public static void main(String[] args) {
		 ArrayList arrayList = new ArrayList();
	        arrayList.add("First");
	        arrayList.add("Second");
	        arrayList.add("Third");
	        arrayList.add("Fourth");

	        System.out.println("Original ArrayList: " + arrayList);
	        String specifiedElement = "NewSecond";
	        if (arrayList.size() >= 2) {
	            arrayList.set(1, specifiedElement);
	            System.out.println("ArrayList after replacing second element: " + arrayList);
	        } else {
	            System.out.println("ArrayList doesn't have a second element to replace.");
	        }
	}

}
