package com.inf.sample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Orders {

	private char[] getArrayOfChars(String input){
		char[] ch = new char[input.length()];
		try{
			input.getChars(0, input.length(), ch, 0);
		}catch(Exception exception){
			System.out.println(exception);
		}
		return ch;
	}
	
	private String getFirstRepeatedOrder(char[] char_list){
		Map<Integer,Character> myItemMap = new HashMap<Integer,Character>();
		int key=0;
		String response = null;
		for(char item :char_list){
			if(!(myItemMap.values().contains(item))){
				myItemMap.put(key, item);
			}
			else{
				response = String.valueOf(item);
				break;
			}
			if(myItemMap.values().size() == char_list.length){
				response = null;
			}
			key++;
		}
		return response;
	}
	
	public static void main(String[] args) {
		List<String> inputs = new ArrayList<String>();
		inputs.add("ABCA");
		inputs.add("BCABA");
		inputs.add("ABC");
		inputs.add("BCAZHWQZH");
	
		Orders orderProcessor = new Orders();
		
		for(String orders: inputs){
			System.out.println("** Input: " + orders);
			char [] mychars = orderProcessor.getArrayOfChars(orders);
			System.out.println("Value found: " + orderProcessor.getFirstRepeatedOrder(mychars));
			System.out.println("==========");
		}
	}

}
