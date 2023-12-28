package com.assignments;

import java.time.LocalTime;
import java.util.*;

public class SystemTimeDisplay {
	
	public static void main(String[] args) {
		LocalTime currenttime=LocalTime.now();
		System.out.println("The current system time is: " + currenttime);
	}

}
