package BlueStone_;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class ArrayLists {

	public static void main(String[] args) {
		ArrayList<String> names = new ArrayList<String>();
		names.add("Zakir");
		names.add("hussain");
		names.add("Shaik");
		names.add("Shaik");
		System.out.println(names);
		Collections.sort(names);
		
			
		
		HashSet<String> name = new HashSet<String>();
		name.add("Zakir");
		name.add("hussain");
		name.add("Shaik");
		names.add("Shaik");
		System.out.println(name);
		
		
		HashSet<Integer> test = new HashSet<Integer>();
		test.add(1);
		test.add(33);
		test.add(23);
		test.add(12);
		System.out.println(test);
		

	}

}
/*
ArrayList
The ArrayList class implements the List interface. 
It uses a dynamic array to store the duplicate element of different data types. The ArrayList class maintains the insertion order and is non-synchronized. 
The elements stored in the ArrayList 
class can be randomly accessed. 
*/
