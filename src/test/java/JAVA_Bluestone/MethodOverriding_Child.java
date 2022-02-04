package JAVA_Bluestone;

public class MethodOverriding_Child extends MethodOverriding_parent {

	public static void main(String[] args) {
		
		MethodOverriding_Child obj = new MethodOverriding_Child();
		obj.addition(4, 8);	

	}
	
	
	public static void addition(int a, int b) {
		System.out.println("I am in Child Class");
		int sum = a+b;
		System.out.println(sum);
	}

}
