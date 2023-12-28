package com.assignments;

import java.util.HashSet;
import java.util.Set;

public class SetComparison {
	public static void main(String[] args) {
		 Set set1 = new HashSet();
	        set1.add(1);
	        set1.add(2);
	        set1.add(3);
	        set1.add(4);

	        Set set2 = new HashSet();
	        set2.add(3);
	        set2.add(4);
	        set2.add(5);
	        set2.add(6);
	        
	        Set commonElements = new HashSet(set1);
	        commonElements.retainAll(set2);
	        System.out.println("Set 1: " + set1);
	        System.out.println("Set 2: " + set2);
	        System.out.println("Common Elements: " + commonElements);
	}

}
