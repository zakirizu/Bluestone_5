package java_Concepts;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class Colleactions_HashSet {

	public static void main(String[] args) {
		HashSet_Demo();
	}

	public static void HashSet_Demo(){
		
		HashSet<Integer> hs = new HashSet<Integer>();
		ArrayList<Integer> ar = new ArrayList<Integer>();
		
		int[] a = {2,10,7,7,3,4,5,5,9};
		for(int i=0;i<a.length;i++) {
		hs.add(a[i]);
		}
		System.out.println(hs);
		System.out.println(hs.contains(2));
		String new1 = hs.toString();
		System.out.println(new1);
		
		ar.add(1);
		//ar.remove(0);
		ar.get(0);//--thers is no get at index method in HashSet

		System.out.println("1**************");
		
		for(int i : hs)
		{
			System.out.println(i);
		}
		System.out.println("2**************");
		for(int i : a)
		{
			System.out.println(i);
		}
		
		
	}

	
	
}
