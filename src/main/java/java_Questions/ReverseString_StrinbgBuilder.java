package java_Questions;

import java.util.Arrays;
import java.util.HashSet;

public class ReverseString_StrinbgBuilder {

	public static void main(String[] args) {
		String str = "zakir";
		
		str.split("k");
		System.out.println(reverser_Manually(str));
		System.out.println(reverser_StringbUilder(str));
		
	}
public static String reverser_Manually(String str) {
	return new StringBuilder(str).reverse().toString();
		
	
}
public static String reverser_StringbUilder(String str) {
	String revstr = "";
	HashSet<String> hs = new HashSet<>();
	for(int i =str.length()-1;i>=0;i--)
		
	{
		revstr = revstr+str.charAt(i);
	}
	return revstr;
}


}

