package java_Questions;

public class pymarid_triangle {

	public static void main(String[] args) {
		pymarid_triangle pt = new pymarid_triangle();
		TriangleOne();
		topBottom();
	  BottomUp();
		 
		}

public static void TriangleOne() {
System.out.println("Triangle 1_____________________________________________");	
	int rows = 5;
	int columns = 5;
	
	for(int i=0;i<rows;i++)
	{
		for(int j=0;j<columns;j++)
		{ }
		columns--;
		System.out.println("*");
}	}

//DAy-2

public static void topBottom() {
	//System.out.println("Triangle 2_____________________________________________");	
	int rows = 5;
	int columns = 5;
	
	for(int i=0;i<rows;i++)
	{
		for(int j=0;j<=i;j++)
		{
			System.out.print("*"+ " ");
		}
		columns++;
		System.out.println("");
		
	}}

public static void BottomUp() {
	System.out.println("Triangle 3_____________________________________________");		
	int rows = 5;
	int columns = 5;
	int k = 1;
	
	for(int i=1;i<=rows;i++)
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