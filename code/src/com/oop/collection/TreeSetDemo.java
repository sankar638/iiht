package com.oop.collection;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		
		TreeSet<String> cars=new TreeSet<String>();
		cars.add("honda");
		cars.add("tata");
		cars.add("bmw");
		cars.add("suziki");
		cars.add("benz");
	
		
		
		Iterator<String> itr=cars.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
