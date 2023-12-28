package com.assignments;

import java.util.Scanner;

public class greatestnumber {
	public static void main(String[] args) {
		int a,b,c;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter A : ");
		a=sc.nextInt();
		System.out.println("Enter B : ");
		b=sc.nextInt();
		System.out.println("Enter c : ");
		c=sc.nextInt();
		int greatest = 0;
		if(b > greatest) {
			greatest =b;
		}
		if(c > greatest) {
			greatest =c;
		}
		System.out.println("The greatest is: "+greatest);
		}

}
