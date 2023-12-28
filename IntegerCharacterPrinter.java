package com.assignments;

public class IntegerCharacterPrinter {
	
	public void print(int n, char c) {
        System.out.println("Integer: " + n + ", Character: " + c);
    }
	 public void print(char c, int n) {
	        System.out.println("Character: " + c + ", Integer: " + n);
	    }
	 
	 public static void main(String[] args) {
	        IntegerCharacterPrinter printer = new IntegerCharacterPrinter();

	        printer.print(19, 'A'); 
	        printer.print('B', 6); 
	    }
}