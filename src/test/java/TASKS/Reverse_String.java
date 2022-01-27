package TASKS;

public class Reverse_String {

	public static void main(String[] args) {
		//Reverse a String Code
		
		String name = "zakirhussainshaik";		
		int len = name.length();
		System.out.println(len);
		
		String rev = "";
		for(int i=len-1;i>=0;i--)
		{
			rev = rev+ name.charAt(i);
		}
		
		System.out.println(rev);
	}
	
	

}
