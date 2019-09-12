package datastructure;

import databases.ConnectToSqlDB;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.ResultSet;
import java.util.*;

public class DataReader {
	public static ResultSet resultSet = null;

	public static void main(String[] args) throws IOException {
		BufferedReader br = null;
		FileReader fr = null;
		String filename = "D:/git study/Midterm September/MidtermJuly2019/src/data/self-driving-car";
		String currentline;

		Stack<String> st = new Stack<>();
		Queue<String> mq = new LinkedList<>();
		try {
			fr = new FileReader(filename);
			br = new BufferedReader(fr);


			while ((currentline = br.readLine()) != null
			) {
				String[] currentLineArr = currentline.split(" ");
				for (String line : currentLineArr) {
					st.push(line);
					mq.add(line);
				}

			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally {
			fr.close();
			br.close();
		}

		System.out.println("Traversing Stack...");

		while (!st.isEmpty()) {
			System.out.println(st.pop());
		}

		System.out.println("Traversing Linked List...");

		while (!mq.isEmpty()) {
			System.out.println(mq.remove());
		}

	}
}
/*
 * User API to read the below textFile and print to console.
 * Use BufferedReader class.
 * Use try....catch block to handle Exception.
 *
 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
 *
 * After reading from file using BufferedReader API, store each word into Stack and LinkedList. So each word
 * should construct a node in LinkedList.Then iterate/traverse through the list to retrieve as FIFO
 * order from LinkedList and retrieve as FILO order from Stack.
 *
 * Demonstrate how to use Stack that includes push,peek,search,pop elements.
 * Use For Each loop/while loop/Iterator to retrieve data.
 */

//String textFile = System.getProperty("user.dir") + "/src/data/self-driving-car.txt";


