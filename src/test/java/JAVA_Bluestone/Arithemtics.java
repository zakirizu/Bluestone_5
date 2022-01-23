package JAVA_Bluestone;

public class Arithemtics {

	public static void main(String[] args) {
		
		Arithemtics obj = new Arithemtics();
		obj.addition();
		obj.multiplication();
		
	}
	
	
	public  void addition() {
		int a = 10;
		int b = 20;
		int sum = a+b;		
		System.out.println("Addition is ");
		System.out.println(sum);
	}
	
	public  void multiplication() {		
		int x = 3;
		int y = 4;
		int mul = x*y;		
		System.out.println("Multiplicaiton");
		System.out.println(mul);		
	}
	
		
	

}
