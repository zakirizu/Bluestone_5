package java_Questions;

import java.util.Arrays;

public class Sort_Arrays {

	public static void main(String[] args) {
		Palindrome_List();
		}

public static void Palindrome_List() {
	
	String name = "MADAM";
	char[] arr = name.toCharArray();
	
	System.out.println(arr);
	Arrays.sort(arr);
	System.out.println(arr);
}
} 