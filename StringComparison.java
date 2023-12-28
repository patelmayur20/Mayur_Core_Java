package com.assignments;

public class StringComparison {
	 public static void main(String[] args) {
	        String str1 = "topsint.com";
	        String str2 = "topsint.com";
	        String str3 = "Topsint.com";

	        System.out.println("Comparing " + str1 + " and " + str2 + ": " + compareStrings(str1, str2)); // Outputs: true
	        System.out.println("Comparing " + str3 + " and " + str1 + ": " + compareStrings(str3, str1)); // Outputs: false
	    }

	    public static boolean compareStrings(String str1, String str2) {
	        return str1.equalsIgnoreCase(str2);
	    }

}
