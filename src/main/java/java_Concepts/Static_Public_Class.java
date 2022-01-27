package java_Concepts;

public class Static_Public_Class {
	public static void main(String[] args) {
		StaticMethod();
		//Try uncommenting this for the error--		NonStaticMethod();
		Static_Public_Class Ns = new Static_Public_Class();
		Ns.NonStaticMethod();
		
	}
public static void StaticMethod() {	
	System.out.println("STATIC Method can be accessed without creating any object ");}

public  void NonStaticMethod() {
	System.out.println("PUBLIC Method can only be accessed by creating a Object for that Class");}	
}


/*
 * STATIC Method can be accessed without creating any object for that 
 * PUBLIC Method can only be accessed by creating a Object for that
 * 
 * 
 * 
 * */



