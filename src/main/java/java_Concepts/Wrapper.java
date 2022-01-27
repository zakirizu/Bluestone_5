package java_Concepts;

public class Wrapper {

public static void CreatingWrappers() {
	
	   Integer myInt = 5;
	    Double myDouble = 5.99;
	    Character myChar = 'A';
	    System.out.println(myInt);
	    System.out.println(myDouble);
	    System.out.println(myChar);
}
	
	
	public static void main(String[] args) {
		Method();
		CreatingWrappers();

	}
/*
 * 
 * Sometimes you must use wrapper classes, for example when working with Collection objects, such as ArrayList, 
   where primitive types cannot be used (the list can only store objects)
 * We require wrapper when we deal with ArrayList
 * Because ArrayList will accept only Objects
 * We cannot use primitive data types in the ArrayList. hence we make use of the wrappers in java
 * 
 * Primitive Data Type 				Equivalent Wrapper 
 * 		int								Integer
 * 		char							Character
 * 		boolean							Boolean
 * 		double							Double
 * 		float							Float 
 * 
 * Another useful method is the toString() method, which is used to convert wrapper objects to strings.
 */
public static  void Method() {
	    Integer myInt = 11200;
	   
	    String myString = myInt.toString();
	    Integer temp = myString.hashCode();
	    System.out.println(temp.intValue());
	  System.out.println(myInt.compareTo(11));
	   System.out.println(myString.length());
	   
	   
		   
	  
	}}


/*

for(int i=0;i<myString.length();i++)
{
	   
	   for(int j=0;j<myString.length();j++)
	   {
	   
	   {
		   if(myString.charAt(j)==myString.charAt(i)) ;
	   }
	   }
	   
}
	   
	*/   