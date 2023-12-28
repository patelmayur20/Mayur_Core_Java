package com.assignments;

import java.util.*;

public class AgeValidator {
	
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        System.out.print("Enter your age: ");
	        int age = scanner.nextInt();
	        
	        try {
	            validate(age);
	            System.out.println("Welcome to vote!");
	        } catch (ArithmeticException e) {
	            System.out.println("Sorry, you are not eligible to vote.");
	        }
	        scanner.close();
	    }
	    public static void validate(int age) throws ArithmeticException {
	        if (age < 18) {
	            throw new ArithmeticException("Age must be 18 or above to vote.");
	        }
	    }

}
