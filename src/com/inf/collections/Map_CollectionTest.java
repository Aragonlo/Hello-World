package com.inf.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Map_CollectionTest{
	public static void main(String [] args){
		//Ordered and sorted map
		Map<String, Integer> myTreeMap = new TreeMap<String, Integer>();
	    int maxCount = 0;
	    String element = "";
	    
		//Unsorted list
		List<String> myList = new ArrayList<String>();
	    myList.add("Air");
	    myList.add("Earth");
	    myList.add("Fire");
	    myList.add("Water");
	    myList.add("Fire");
	    System.out.println(myList);
	    
	    //iterate the elements.
	    Iterator<String> iterator = myList.iterator();
	    while( iterator.hasNext()){
	    	String value = iterator.next();
	    	if(myTreeMap.get(value) == null){
	    		myTreeMap.put(value, 1);
	    	} else{
	    		int count = myTreeMap.get(value);
	    		count = count + 1;
	    		myTreeMap.put(value, count);
	    	}
	    }
	    System.out.println(myTreeMap);
	    
	    //Easiest way to iterate a map.
	    for (Map.Entry<String, Integer> keyValuePair : myTreeMap.entrySet()) {
	    	if(keyValuePair.getValue() >= maxCount){
	    		maxCount = keyValuePair.getValue();
	    		element = keyValuePair.getKey();
	    	} 
	    	
	    }
	    System.out.println("The most duplicated element is : " +  element);	    
	}    
}