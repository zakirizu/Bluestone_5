package java_Concepts;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Iterator_ {

	public static void main(String[] args) {
		 IterarorDemo();
		 IteraroriNTEGER();
	}

public static void IterarorDemo() {
	 // Make a collection
    ArrayList<String> cars = new ArrayList<String>();
   
    cars.add("Volvo");
    cars.add("BMW");
    cars.add("Ford");
    cars.add("Mazda");
    Collections.sort(cars);
    System.out.println(cars);
   
		Iterator<String> it = cars.iterator();
		while(it.hasNext())
		System.out.println(it.next());
	
}


public static void IteraroriNTEGER() {
	

    // Make a collection
    ArrayList<Integer> et = new ArrayList<Integer>();
   
    et.add(1);
    et.add(9);
    et.add(4);
    et.add(3);
    Collections.sort(et);
    System.out.println(et);
   
		Iterator<Integer> it =  et.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
								   
	
}}


