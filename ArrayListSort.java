package com.assignments;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListSort {
	public static void main(String[] args) {
		 ArrayList al = new ArrayList();
		 al.add(5);
	     al.add(2);
	     al.add(9);
	     al.add(1);
	     al.add(7);
	     
	     System.out.println("ArrayList before sorting: " + al);
	     Collections.sort(al);
	     System.out.println("ArrayList after sorting: " + al);	     
	}
}
