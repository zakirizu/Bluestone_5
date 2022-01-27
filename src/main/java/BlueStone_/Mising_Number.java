package BlueStone_;

import java.util.Arrays;

public class Mising_Number {

	public static void main(String[] args) {
		int[] a = {8,6,5,1,2,3,7,10,9};
		Arrays.sort(a);
		//1 2 3 5 6 7 8 9 10
		//0 1 2 3 4 5 6 7 8
		//1 3 5 7 
		int j=1;
		
	for(int i=0;i<a.length-1;i++)
		{
			int k = a[j];
				
			if(a[i]+1!=k)
				//1+1==2
				//2+1==3
				//3+1==5
				
			{
				System.out.println("Number is missing = ");
			}
				
			j++;
		}
		
		
		
		
		
		
		
		
		
		

	}

}
