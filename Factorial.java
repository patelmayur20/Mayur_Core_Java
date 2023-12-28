package com.assignments;

public class Factorial {
	public static int factolrial(int n) {
		if(n==0 || n==1) {
			return 1;
		}else {
			int fact =1;
			for(int i =2;i<=n;i++) {
				fact*=i;
			}
			return fact;
		}
	}
	public static void main(String[] args) {
		int num=6;
		int result=factolrial(num);
		System.out.println(num +"! = "+ result);
	}
}
