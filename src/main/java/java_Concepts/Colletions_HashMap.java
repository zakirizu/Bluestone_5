package java_Concepts;

import java.util.HashMap;

public class Colletions_HashMap {

	public static void main(String[] args) {
		HashMapAddRead();

	}
//This will take two Wrapper (wrapper classes provide a way to use primitive data types (int, boolean, etc..) as objects.)
	public static void HashMapAddRead() {
	HashMap<String,Float> hm = new HashMap<String,Float>();
	hm.put("Zakir", 30.23f);
	hm.put("Rizzu", 34.21f);
	hm.put("Zoya", 4f);
	hm.put("Amyrah", 0.8f);
	
	System.out.println(hm.get("Zakir"));
	//Copying from one Hashmap to the Other
	HashMap<String,Float> hmCopy = new HashMap<String,Float>();	
	hmCopy.putAll(hm);	
	System.out.println(hmCopy.get("Zoya"));
	//printing all keys together 
	System.out.println("Printing Using for loop. All keys at once");
	for(String i:hm.keySet()) {
		System.out.println(i);
	}
	System.out.println("Printing Using for loop. All values at once");
	for(Float i:hm.values()) {
		System.out.println(i);
	}
	
	}

	
	
	
	
}
