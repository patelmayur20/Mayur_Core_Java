package com.assignments;

import java.util.Arrays;

public class UpdateArray {
	 public static void main(String[] args) {
	        int[] array = { 1, 2, 3, 4, 5 };
	        System.out.println("Original Array: " + Arrays.toString(array));
	        int indexToUpdate = 2; 
	        int newValue = 10; 
	        if (indexToUpdate >= 0 && indexToUpdate < array.length) {
	            array[indexToUpdate] = newValue;
	            System.out.println("Array after updating element at index " + indexToUpdate + ": " + Arrays.toString(array));
	        } else {
	            System.out.println("Invalid index. Please provide a valid index within the array range.");
	        }
	    }
	}
