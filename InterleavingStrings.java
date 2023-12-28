package com.assignments;

public class InterleavingStrings {
	
	 public static String interleaveStrings(String s1, String s2) {
	        int len1 = s1.length();
	        int len2 = s2.length();
	        int i = 0, j = 0;
	        StringBuilder result = new StringBuilder();

	        while (i < len1 || j < len2) {
	            if (i < len1) {
	                result.append(s1.charAt(i));
	                i++;
	            }
	            if (j < len2) {
	                result.append(s2.charAt(j));
	                j++;
	            }
	        }
	        return result.toString();
	    }
	    public static void main(String[] args) {
	        String str1 = "Hello";
	        String str2 = "World";
	        String interleaved = interleaveStrings(str1, str2);
	        System.out.println("Interleaved string: " + interleaved);
	    }
}