package datastructure;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import databases.ConnectToSqlDB;
import org.bson.Document;
//import parser.Fruit;

import java.util.*;

import static databases.ConnectToMongoDB.connectToMongoDB;

public class UseMap {
	/*
	 * Demonstrate how to use Map that includes storing and retrieving elements.
	 * Add List<String> into a Map. Like, Map<String, List<string>> list = new HashMap<String, List<String>>();
	 * Use For Each loop and while loop with Iterator to retrieve data.
	 *
	 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
	 */

	public static void main(String[] args) throws Exception {
		Map<String, List<String>> list = new HashMap<String, List<String>>();
		List<String> nameOfFruit = new ArrayList<String>();
		nameOfFruit.add("Apple");
		nameOfFruit.add("Orange");
		List<String> nameOfFlower = new ArrayList<String>();
		nameOfFlower.add("Rose");
		nameOfFlower.add("Tulip");
		list.put("FruitName", nameOfFruit);
		list.put("FlowerName", nameOfFlower);
		for (Map.Entry<String, List<String>> entry : list.entrySet()) {
			System.out.println(entry.getKey() + " " + entry.getValue());
		}

		ConnectToSqlDB connectToSqlDB = new ConnectToSqlDB();

		connectToSqlDB.insertDataFromArrayToSqlTable(nameOfFruit, "fruit_table");

		connectToSqlDB.insertDataFromArrayToSqlTable(nameOfFlower, "flower_table");


		List<String> retrievedFruit = ConnectToSqlDB.readUserProfileFromSqlTable("fruit_table");

		System.out.println("Retrieving Fruits....");
		for(String fruit: retrievedFruit) {
			System.out.println(fruit);
		}

		List<String> retrievedFlower = ConnectToSqlDB.readUserProfileFromSqlTable("flower_table");

		System.out.println("Retrieving Flower....");
		for(String flower: retrievedFlower) {
			System.out.println(flower);
		}

	}
}