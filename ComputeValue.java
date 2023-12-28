package com.assignments;

import java.util.*;

public class ComputeValue {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter an Number (n): ");
	        int n = scanner.nextInt();

	        int nn = n * 10 + n;        
	        int nnn = nn * 10 + n;      
	        int result = n + nn + nnn;
	        
	        System.out.println("Result: " + result);
	        
	    }

}
