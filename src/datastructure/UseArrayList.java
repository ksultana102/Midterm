package datastructure;

import java.util.ArrayList;
import java.util.Iterator;

public class UseArrayList {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("Steve");
		list.add("Tim");
		list.add("Lucy");
		//displaying elements
		System.out.println(list);
		list.remove("Steve");
		Iterator it = list.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());

			/*
			 * Demonstrate how to use ArrayList that includes add,peek,remove,retrieve elements.
			 * Use For Each loop and while loop with Iterator to retrieve data.
			 * Store all the sorted data into one of the databases.
			 *
			 */


		}
	}
}