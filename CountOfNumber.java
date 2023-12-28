package com.assignments;

import java.util.Scanner;

public class CountOfNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	    
		System.out.println("Enter a Positive Number : ");
	    int number = sc.nextInt();
	    
	    if (number <= 0) {
            System.out.println("Please enter a positive Number.");
        } else {
            int count = 0;
            int temp = number;
            
            while (temp != 0) {
                temp /= 10;
                count++;
            }
            
            System.out.println("Entered Number of digits: " + count);
        }
        
        sc.close();
	}

}
