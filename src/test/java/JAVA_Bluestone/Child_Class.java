package JAVA_Bluestone;

public class Child_Class extends Parent_Class, Parent2{

	public static void main(String[] args) {
		
		Child_Class obj = new Child_Class();
		obj.job();
		obj.home();
		obj.car();
		int sum = obj.amount;
		System.out.println(sum);
		
	}

	public static void job() {
		System.out.println("JOB In City");		
	}
	
	
		
}
