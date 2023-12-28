package com.assignments;

import java.util.ArrayList;
import java.util.List;

public class ExtractArrayListPortion {
	public static void main(String[] args) {
		 ArrayList ol = new ArrayList();
	        ol.add("Apple");
	        ol.add("Banana");
	        ol.add("Orange");
	        ol.add("Grapes");
	        ol.add("Mango");
	        ol.add("Pineapple");

	        System.out.println("Original ArrayList: " + ol);
	        int startIndex = 0; 
	        int endIndex = 5;   
            List extractedPortion = ol.subList(startIndex, endIndex);
	        System.out.println("Extracted Portion: " + extractedPortion);
	}

}
