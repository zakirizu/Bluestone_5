package JAVA_Bluestone;

public class Operators {

	public static void main(String[] args) {
		//ArithemticOperatros();
		//LogicalOperators();
		Increment_Operator();
		
		
		
	}
	
	public static void Increment_Operator() {
		
		int x = 7;
		
		System.out.println(x);//7
		
		System.out.println(++x);//8 --- //8
		
		System.out.println(x++);//8 --- //9
		
		System.out.println(x);//9
//Type in chat the answers 	
		System.out.println(++x);//10 -- //10
		
		System.out.println(--x);//9 -- //9
		
		System.out.println(x--);//9 -- //8
		
		System.out.println(++x);//9  
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static void LogicalOperators() {
		
		int a = 5;
		int b = 9;
		int c = 3;
		
		
		if(a>b || c<a || b<c)
		//F       T       F
			{
				System.out.println("PASS");
			}
			else
			{
				System.out.println("FAIL");
			}
		
		
		
		
		
		if(a>b && c<a && b>c)
		//T       T       T
		{
			System.out.println("PASS");
		}
		else
		{
			System.out.println("FAIL");
		}
		
		
	}
	
		
	
	public static void ArithemticOperatros() {
		
		int a = 2;
		int b = 7;
		
		//addition
		int sum = a + b;
		
		//subraction 
		int sub = b - a;
		
		//Multiplication 
		int mul = a * b;
		
		//Division---Quotient  
		int div = b/2;
		
		//Modulus --- Reminder
		int rem = b%2;
		
		System.out.println(sum);
		System.out.println();
		System.out.println(sub);
		System.out.println();
		System.out.println(mul);
		System.out.println();
		System.out.println(div);
		System.out.println();
		System.out.println(rem);
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	

}
