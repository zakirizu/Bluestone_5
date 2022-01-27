package java_Concepts;

import java.util.Arrays;

public class Sort_Array_Alphabets {
  public static void main(String[] args) {
	  SortAlphabets("zakir");
	}

 public static void SortAlphabets(String Name) {
	 System.out.println("Word = "+Name);
	 //Converting this into Array of Charecters
	 char[] CharArray = Name.toCharArray();
	 Arrays.sort(CharArray);
	 System.out.println("Sorted Word");
	 String temp = "";
	 for(int i=0;i<Name.length();i++)
	 {temp =  temp+CharArray[i];}
	 System.out.println(temp);
	 
	 for(int i=0;i<Name.length();i++)
	 {System.out.println(CharArray[i]);}

	 
	 
 }
}
