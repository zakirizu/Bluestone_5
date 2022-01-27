package java_Questions;

public class Strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	
		//Defining the string as an object 
		String s = new String("zakir");
		
		System.out.println(s.charAt(1));
		
		System.out.println(s.indexOf("k"));
		
		System.out.println(s.indexOf("x"));
		
		
		
		//Defining the String in  literal 
		
		String s1 = "Shaik Zakir Hussain";
		String s2 = "Zoya";
		String s3 = "Amyrah";
		String substring = s1.substring(6,11);
		System.out.println(substring);
		
		
		
		String concact = s2.concat(s3);
		System.out.println(concact);
		

	}

}
