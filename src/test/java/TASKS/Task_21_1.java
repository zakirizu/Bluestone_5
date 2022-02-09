package TASKS;

public class Task_21_1 {

	public static void main(String[] args) {

		
		int a[] = {10,-10,3,-3,4,6,7};
		int len = a.length;
		int TotalCharge =0;
		int ElectroMgnticFld ;
		
		for(int i=0;i<len;i++)
		{
			TotalCharge = TotalCharge +a[i];				
		}
		
		
		ElectroMgnticFld = TotalCharge*100;		
		System.out.println(ElectroMgnticFld);
		
		
	}

}
