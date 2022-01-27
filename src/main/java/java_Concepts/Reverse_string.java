package java_Concepts;

public class Reverse_string {

	public static void main(String[] args) {
		String S = "Zakir";
		int len = S.length();
		System.out.println("leng of the string is "+len);
		//UsingStringAPI(S);
		UsingManually(S, len);}

	private static void UsingManually(String S,int len) {
	String rev = "";
	
	for(int i=len-1;i>=0;i--)
	{
		rev = rev + S.charAt(i);	
	}
	System.out.println(rev);	
	}


	private static String UsingStringAPI(String S) {
		return S;
	

		//return new StringBuilder(S);
		//.reverse()
		//.toString();
		
	
		
	}

	
}
