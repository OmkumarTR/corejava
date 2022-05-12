package com.chainsys.collections;
import java.util.*;

import java.util.stream.Collectors;

public class MapConvertArrayList {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("Om", 1);
		map.put("kumaar", 2);
		map.put("jfsa", 3);
		map.put("knj", 4);
		map.put("ds", 5);
		
		List<String> listKeys = map.keySet().stream().collect(Collectors.toList());         
	    for (String i : listKeys)
	    {
	    	System.out.println(i);
	    }
		
	}

}
