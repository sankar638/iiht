package com.oop.collection;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetDemo {

	public static void main(String[] args) {
		
		LinkedHashSet<String> laptop=new LinkedHashSet<String>();
		laptop.add("hp");
		laptop.add("dell");
		laptop.add("asus");
		laptop.add("hp");
		laptop.add("hp");
		
	
		
		Iterator<String> itr=laptop.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		

	}

}
