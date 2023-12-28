package com.assignments;

import java.util.Scanner;

public class GetCharacterAtIndex {
	 public static void main(String[] args) {
	        String originalString = "Hives Groups!";
	        int index1 = 0;
	        int index2 = 10;

	        char charAtIndex1 = originalString.charAt(index1);
	        char charAtIndex2 = originalString.charAt(index2);

	        System.out.println("Original String = " + originalString);
	        System.out.println("The character at position " + index1 + " is " + charAtIndex1);
	        System.out.println("The character at position " + index2 + " is " + charAtIndex2);
	    }

}
