package com.assignments;

import java.util.Scanner;

public class LeapYearAndNaturalNumbers {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        

	        System.out.print("Enter a year to check if it's a leap year: ");
	        int year = scanner.nextInt();
	        boolean isLeapYear = false;

	        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
	            isLeapYear = true;
	        }

	        if (isLeapYear) {
	            System.out.println(year + " is a leap year.");
	        } else {
	            System.out.println(year + " is not a leap year.");
	        }
	        System.out.println("\nFirst 10 natural numbers:");
	        int count = 1;
	        while (count <= 10) {
	            System.out.print(count + " ");
	            count++;
	        }
	            scanner.close();
	    }
	}
