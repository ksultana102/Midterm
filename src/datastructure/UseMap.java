package datastructure;
import java.util.*;
public class UseMap {
	/*
	 * Demonstrate how to use Map that includes storing and retrieving elements.
	 * Add List<String> into a Map. Like, Map<String, List<string>> list = new HashMap<String, List<String>>();
	 * Use For Each loop and while loop with Iterator to retrieve data.
	 *
	 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
	 */

	public static void main(String[] args) {
		Map<String, List<String>> list = new HashMap<String, List<String>>();
		List<String> nameOfFruit = new ArrayList<String>();
		nameOfFruit.add("Apple");
		nameOfFruit.add("Orange");
		List<String> nameOfFlower = new ArrayList<String>();
		nameOfFlower.add("Rose");
		nameOfFlower.add("Tulip");
		list.put("A", nameOfFruit);
		list.put("T", nameOfFlower);
		for (Map.Entry<String, List<String>> entry : list.entrySet()) {
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
	}
}