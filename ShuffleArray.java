package com.assignments;

import java.util.ArrayList;
import java.util.Collections;

public class ShuffleArray {
	public static void main(String[] args) {
		 ArrayList numbers = new ArrayList();
	        numbers.add(1);
	        numbers.add(2);
	        numbers.add(3);
	        numbers.add(4);
	        numbers.add(5);
	
	        System.out.println("Original ArrayList: " + numbers);
	        Collections.shuffle(numbers);
	        System.out.println("Shuffled ArrayList: " + numbers);
	}

}
