package JAVA_Bluestone;

public class MethodOverloading {

	public static void main(String[] args) {
		MethodOverloading obj = new MethodOverloading();
		//obj.addition(8,"zakir",'m');//--Dilip
		//obj.addition(8,"swetha",'f');--Swetha
		obj.addition(7, "SWAmy",'m');//--Swamy		
		
	}
	

	public static void addition(int a,int b) {
		System.out.println("First Method");
		int sum = a+b;
		System.out.println(sum);	
	}
	
	public static void addition(String FirstName,String LastName) {	
		System.out.println("Second Method");
		System.out.println(FirstName);	
		System.out.println(LastName);
	}
		
	public static void addition(int age,String Name) {		
		System.out.println("Third Method");
		System.out.println(Name);	
		System.out.println(age);
	}
	
	public static void addition(int a) {
		System.out.println("Fourth Method");
		int sum = a;
		System.out.println(sum);	
	}
	
	public static void addition(int age, String Name, char gender) {
		System.out.println("fifith Method");
	}

}
