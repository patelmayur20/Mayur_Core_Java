package com.assignments;

import java.util.Scanner;

public class SumAndAverage {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalNumbers = 5;
        double sum = 0;

        System.out.println("Enter 5 numbers:");

        for (int i = 0; i < totalNumbers; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            double number = scanner.nextDouble();
            sum += number;
        }

        double average1 = sum;  
        double average2=totalNumbers;

        System.out.println("Sum of the numbers is: " + sum);
        System.out.println("Average of the numbers is: " + average1);

    }

}
