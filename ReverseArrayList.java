package com.assignments;

import java.util.ArrayList;
import java.util.Collections;

public class ReverseArrayList {
	public static void main(String[] args) {
		 ArrayList num = new ArrayList();
	        num.add(1);
	        num.add(2);
	        num.add(3);
	        num.add(4);
	        num.add(5);
	        
	        System.out.println("Original ArrayList: " + num);
	        Collections.reverse(num);
	        System.out.println("Reversed ArrayList: " + num);
	}

}
