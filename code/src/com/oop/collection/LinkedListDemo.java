package com.oop.collection;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		LinkedList<String> fru=new LinkedList<String>();
		fru.add("mango");
		fru.add("apple");
		fru.add("Kiwi");
		
		fru.add(1, "lemon");
		fru.add(2, "sapota");
		
		fru.remove(2);
		//fru.removeAll(fru);
		
		Iterator<String> itr=fru.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		

	}

}
