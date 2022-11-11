package com.oop.collection;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {
	
	public static void main(String[] args) {
		HashSet<String> mem=new HashSet<String>();
		mem.add("siva");
		mem.add("sankar");
		mem.add("nag");
		mem.add("hari");
		mem.add("siva");
		
		mem.remove(2);
		
		Iterator<String> itr=mem.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		

	}

}
