package com.inf.generics;

//Generic class for any kind of type.
class Store<T>{
	private T item;
	
	public void setStoreItem(T item){
		this.item = item;
	}
	public T getStoreItem(){
		return this.item;
	}
	
	@Override
	public String toString() {
		return "" + this.item.toString();
	}
}

public class Generics_1 {
	public static void main(String [] args){
		//raw type - TRY TO AVOID IT!!!!
		//	Store str = new Store();
		//	str.setStoreItem(45);
		//	System.out.println(str);
		
		//Correct way to use it.
		//String
		Store<String> stringStr = new Store <>(); //Diamond operator.
		stringStr.setStoreItem("Hello World");
		System.out.println(stringStr);
		
		//Double
		Store<Double> doubleStr = new Store <>(); //Diamond operator.
		doubleStr.setStoreItem(6.25148);
		System.out.println(doubleStr);
		
		//Integer
		Store<Integer> intStr = new Store <>(); //Diamond operator.
		intStr.setStoreItem(2);
		System.out.println(intStr);
	}
}
