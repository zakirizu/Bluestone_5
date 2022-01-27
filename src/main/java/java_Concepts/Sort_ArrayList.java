package java_Concepts;

import java.util.ArrayList;
import java.util.Collections;

public class Sort_ArrayList {
public static void main(String[] args) {
		ArrayList_Int();
		ArrayList_String();
		ArrayList_Charecter();
	}

public static void ArrayList_Int() {
	ArrayList<Integer> ArrInt = new ArrayList<Integer>();
	ArrInt.add(7);
	ArrInt.add(9);
	ArrInt.add(1);
	System.out.println("Array of Integer type = "+ArrInt);
	Collections.sort(ArrInt);
	System.out.println("Sorted Array Asc = "+ArrInt);
	Collections.sort(ArrInt,Collections.reverseOrder());
	System.out.println("Sorted Array Desc = "+ArrInt);
	System.out.println("Value at Index 0 = "+ArrInt.get(0));
}
	
public static void ArrayList_String() {
	ArrayList<String> ArrInt = new ArrayList<String>();
	ArrInt.add("Boy");
	ArrInt.add("Cat");
	ArrInt.add("Apple");
	System.out.println("Array of Integer type = "+ArrInt);
	Collections.sort(ArrInt);
	System.out.println("Sorted Array Asc = "+ArrInt);
	Collections.sort(ArrInt,Collections.reverseOrder());
	System.out.println("Sorted Array Desc = "+ArrInt);
}	

public static void ArrayList_Charecter() {
	ArrayList<Character> ArrInt = new ArrayList<Character>();
	ArrInt.add('B');
	ArrInt.add('C');
	ArrInt.add('A');
	System.out.println("Array of Integer type = "+ArrInt);
	Collections.sort(ArrInt);
	System.out.println("Sorted Array Asc = "+ArrInt);
	Collections.sort(ArrInt,Collections.reverseOrder());
	System.out.println("Sorted Array Desc = "+ArrInt);
}}
/*
 * The ArrayList class is a resizable array, which can be found in the java.util package.
The difference between a built-in array and an ArrayList in Java, is that the size of an array cannot be modified 
(if you want to add or remove elements to/from an array, you have to create a new one). While elements 
can be added and removed from an ArrayList whenever you want. The syntax is also slightly different:
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * */
