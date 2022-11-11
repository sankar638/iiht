package com.oop.collection;

import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQueueDemo {

	public static void main(String[] args) {
		
		PriorityQueue<String> cus=new PriorityQueue<String>();
		cus.add("siva");
		cus.add("sankar");
		cus.add("nag");
		cus.add("hari");
		cus.add("Ganga");
		
		System.out.println("Lead is "+ cus.peek());
		
		Iterator<String> itr=cus.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		


	}

}
