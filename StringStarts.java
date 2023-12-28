package com.assignments;

public class StringStarts {
	 public static void main(String[] args) {
	        String mainString1 = "Red is favorite color.";
	        String checkString1 = "Red";

	        String mainString2 = "Orange is also my favorite color.";
	        String checkString2 = "Red";

	        boolean startsWith1 = mainString1.startsWith(checkString1);
	        boolean startsWith2 = mainString2.startsWith(checkString2);

	        System.out.println( startsWith2);
	        System.out.println(startsWith1);
	    }

}
