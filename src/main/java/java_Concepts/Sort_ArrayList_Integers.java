package java_Concepts;

import java.util.ArrayList;
import java.util.Collections;

public class Sort_ArrayList_Integers {

	public static void main(String[] args) {
		AcendingOrder();
		//DescendingOrder();

	}
public static void AcendingOrder() {
	int[] a = {29658874,296588740,2965887,29658894};
	ArrayList<Integer> AL = new ArrayList<Integer>();
	for(int i=0;i<a.length;i++)	
	{AL.add(a[i]);}
	System.out.println("Array");
	System.out.println(AL);
	Collections.sort(AL);
	System.out.println("Sorted in Ascending");
	System.out.println(AL);
}

public static void DescendingOrder() {
	int[] a = {3,9,7,5,6,8,9};
	ArrayList<Integer> AL = new ArrayList<Integer>();
	for(int i=0;i<a.length;i++)	
	{AL.add(a[i]);}
	System.out.println("Array");
	System.out.println(AL);
	//Collections.sort(AL);
	Collections.sort(AL, Collections.reverseOrder());
	System.out.println("Sorted in Ascending");
	System.out.println(AL);
	
	
}
	
}
