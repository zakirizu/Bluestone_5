package java_Questions;

public class Fizz_Buzz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n = 20;
Fizz_Buzz_Method(n);
	}

	
	
	public static void Fizz_Buzz_Method(int n) {
		
		for (int i =1;i<=n;i++)
			
		{
			if (i%3==0 && i%5==0)
			{System.out.println("FizzBuzz");}
			
			else if(i%3==0)
			{System.out.println("Fizz");}
			
			else if(i%5==0)
			{System.out.println("Buzz");}
			
			else 
			{System.out.println(i);}
			
		}
		
		
		
		
	}
}
