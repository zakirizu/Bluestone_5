/**
 * 
 */
package java_Concepts;
public class MethodOverLoading {
	
//See the method name here add
public static int add(int a,int b) {
		System.out.println("Inside - 2  Integer Type Add");
		return a+b;	}

//See the method name -- Type of the parameters that are being given to the mehtod has changed
public static float add(float a, float b) {
	System.out.println("Inside- 2 Float Type Add");
	return a+b;}

//See the method name here add
public static int add(int a,int b,int c) {
		System.out.println("Inside- 3 Integer Type Add");
		return a+b+c;	}
	
public static void main(String[] args) {
	System.out.println(add(2.1f,1.1f));
	System.out.println(add(2,1));
	System.out.println(add(2,1,3));
	}
}
/**
 * If a Class has Methods with same name. Then it is called Method Overloading 
 * This is the one of the way we can achieve Polymorphism(Doing same action in different ways)
 * We can achieve Overloading by Changing the Arguments and data types to the Method 
 * 
 * 
 * 
 */