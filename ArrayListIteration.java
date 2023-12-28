package com.assignments;

import java.util.ArrayList;

public class ArrayListIteration {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();

        arrayList.add("Apple");
        arrayList.add("Banana");
        arrayList.add("Orange");
        arrayList.add("Grapes");
        System.out.println("Iterating through the ArrayList using for-each loop:");
        for (String fruit : arrayList) {
            System.out.println(fruit);
        }
        System.out.println("Iterating through the ArrayList using traditional for loop:");
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }
    }
}
