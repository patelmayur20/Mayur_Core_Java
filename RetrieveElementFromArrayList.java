package com.assignments;

import java.util.ArrayList;
import java.util.List;

public class RetrieveElementFromArrayList {
	public static void main(String[] args) {
		 List<String> arrayList = new ArrayList<>();
	        arrayList.add("Apple");
	        arrayList.add("Banana");
	        arrayList.add("Orange");
	        arrayList.add("Mango");
	        
	        int indexToRetrieve = 3;
	        if (indexToRetrieve >= 0 && indexToRetrieve < arrayList.size()) {
	            String element = arrayList.get(indexToRetrieve);
	            System.out.println("Element at index " + indexToRetrieve + " is: " + element);
	        } else {
	            System.out.println("Index is out of bounds.");
	        }
	}
}
