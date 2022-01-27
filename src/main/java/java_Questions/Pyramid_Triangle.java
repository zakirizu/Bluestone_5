package java_Questions;


public class Pyramid_Triangle {

	public static void main(String[] args) {
		topBottom();
		BottomUp();
		Numbers();
	}

public static void topBottom() {
	System.out.println("-------------------Top Bottom Start---------------------");		
	int rows = 5;
	int columns = 5;
	
	for(int i=0;i<rows;i++)
	{
		for(int j=0;j<columns;j++)
		{
			System.out.print("8"+ " ");
		}
		columns--;
		System.out.println("");
}	}


public static void BottomUp() {
System.out.println("-------------------Bottom Up Start---------------------");	
	int rows = 5;
	int columns = 5;
	
	for(int i=0;i<rows;i++)
	{
		for(int j=0;j<=i;j++)
		{
			System.out.print("8"+ " ");
		}
		columns++;
		System.out.println("");
		
	}}

public static void Numbers() {
	System.out.println("-------------------Numbers Start---------------------");		
	int rows = 5;
	int columns = 5;
	int k = 1;
	
	for(int i=1;i<rows;i++)
		
		
	{
		for(int j=1;j<=i;j++)
		{
			System.out.print(k+ " ");
			k++;
		}
		
		columns++;
		System.out.println("");
		
		
	}}




}	