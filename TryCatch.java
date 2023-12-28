package com.assignments;

public class TryCatch {
	public static void main(String[] args) {
        try {
            int result = divideNumbers(10, 0); 
            System.out.println("Result: " + result); 
        } catch (ArithmeticException e) {
            System.out.println("Exception caught: " + e.getMessage());
        } finally {
            System.out.println("This block always executes");
        }
    }
    public static int divideNumbers(int dividend, int divisor) {
        return dividend / divisor;
    }
}
