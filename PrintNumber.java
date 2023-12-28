package com.assignments;

public class PrintNumber {
	
	 public void println(int number) {
	        System.out.println("Printing integer number: " + number);
	    }
	 public void println(double number) {
	        System.out.println("Printing double number: " + number);
	    }
	 public void println(float number) {
	        System.out.println("Printing float number: " + number);
	    }
	 public void println(long number) {
	        System.out.println("Printing long number: " + number);
	    }
	 public void println(String text) {
	        System.out.println("Printing text: " + text);
	    }
	 public void println(boolean value) {
	        System.out.println("Printing boolean value: " + value);
	    }
         public static void main(String[] args) {
        	 PrintNumber printer = new PrintNumber();
        	 printer.println(10);
             printer.println(3.14);
             printer.println(5.67f);
             printer.println(10000000000L);
             printer.println("Hello, world!");
             printer.println(true);
		}
}
