package com.assignments;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class MapValueCollection {
	public static void main(String[] args) {
        Map map = new HashMap();
        map.put(1, "Value 1");
        map.put(2, "Value 2");
        map.put(3, "Value 3");
        map.put(4, "Value 4");
        map.put(5, "Value 5");
        
        Collection<String> values = map.values();
        System.out.println("Collection view of values in the map:");
        for (String value : values) {
            System.out.println(value);
        }
	}

}
