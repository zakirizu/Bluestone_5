package java_Concepts;

public class Recursion_SumUptoNnumbers {

	public static void main(String[] args) {
		adder(10);
		System.out.println(Recursion(10));
		
	}
	
	public static void adder(int num) {
		int sum = 0 ;
		for(int i=1;i<=num;i++)
		{	
			sum = sum +i;
		}
		System.out.println(sum);
		
	}
	public static int Recursion(int num) {
		if(num>0) {
			return num+Recursion(num-1);
		}
		else {
		return 0;
		}
		
	}

	
	
}
