package com.assignments;

import java.util.HashMap;
import java.util.Map;

public class MapSizeCounter {
	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<>();
        map.put("A", 1);
        map.put("B", 2);
        map.put("C", 3);
        map.put("D", 4);
        map.put("E", 5);

        int mapSize = map.size();
        System.out.println("Number of key-value mappings in the map: " + mapSize);
	}

}
