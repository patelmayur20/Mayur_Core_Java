package com.assignments;

import java.util.Scanner;

public class ExceptionHandling {
	 public static void main(String[] args) {
	     System.out.println("start code");   
	     int[] a = new int[5];
	     Scanner sc=new Scanner(System.in);
	     try {
	           System.out.println("Enter num1 : ");
	           int num1 = sc.nextInt();
	           System.out.println("Enter num2 : ");
	           int num2 = sc.nextInt();
	           System.out.println("Enter num3 : ");
	           int num3 = sc.nextInt();
	           System.out.println("Enter num4 : ");
	           int num4 = sc.nextInt();
	           System.out.println("Enter num5 : ");
	           int num5 = sc.nextInt();
	        } catch (ArrayIndexOutOfBoundsException e) {
	            System.out.println("ArrayIndexOutOfBoundsException caught: " + e.getMessage());
	        } catch (ArithmeticException e) {
	            System.out.println("Exception caught: " + e.getMessage());
	        }
	    }
}
