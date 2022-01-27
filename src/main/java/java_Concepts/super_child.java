package java_Concepts;

public class super_child extends Super{
static int age = 30;
	public static void main(String[] args) {
		
		super_child sc = new super_child();
		sc.test();
		
		System.out.println(age);
	}

	public void test() {
		
		System.out.println("child");
	}
	
	
}
