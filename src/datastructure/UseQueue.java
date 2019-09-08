package datastructure;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class UseQueue {

	public static void main(String[] args) {
		Queue<String> q = new LinkedList<>();
		q.add("plate1");
		q.add("plate2");
		q.add("plate3");
		q.add("plate4");
		System.out.println(q.remove());
		System.out.println(q.peek());
		System.out.println(q.poll());
		for(String item: q ){
			System.out.println(item);
		}
		Iterator it=q.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
		/*
		 * Demonstrate how to use Queue that includes add,peek,remove,pool elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * 
		 */

	}

}
