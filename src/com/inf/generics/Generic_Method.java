package com.inf.generics;

public class Generic_Method {
	
	public <T> T showItem (T item){
		System.out.println( "The item is: " + item.toString());
		return item;
	}

}
