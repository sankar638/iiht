package com.oop.collection;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {

	public static void main(String[] args) {
		
		ArrayList<String> list=new ArrayList<>();
		
		list.add("siva");
		list.add("Nishanth");
		list.add("yogi");
		list.add("hari");
		list.add("raju");
		list.add("jagga");
		list.add("sai");
		
		list.add(2, "surya");
		list.add(5, "raghu");
		list.remove(2);
		//list.removeAll(list);
		
		
		//System.out.println(list);
		
		Iterator itr= list.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
				

	}

}
