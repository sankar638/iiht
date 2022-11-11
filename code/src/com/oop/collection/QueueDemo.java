package com.oop.collection;

import java.util.Iterator;
import java.util.Queue;

public class QueueDemo {

	public static void main(String[] args) {

		Queue<String> city = new Queue<String>();

		city.add("siva");
		city.add("Nishanth");
		city.add("yogi");
		city.add("hari");
		city.add("raju");
		city.add("jagga");
		city.add("sai");

		
		// list.removeAll(list);

		// System.out.println(list);

		Iterator itr = city.iterator();

		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
