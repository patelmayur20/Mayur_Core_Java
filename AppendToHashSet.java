package com.assignments;

import java.util.HashSet;

public class AppendToHashSet {
	public static void main(String[] args) {
		HashSet hs = new HashSet();
        hs.add("Apple");
        hs.add("Banana");
        hs.add("Orange");

      
        System.out.println("Original HashSet: " + hs);
        String elementToAppend = "Grapes";
        hs.add(elementToAppend);
        System.out.println("HashSet after appending '" + elementToAppend + "': " + hs);
	}

}
