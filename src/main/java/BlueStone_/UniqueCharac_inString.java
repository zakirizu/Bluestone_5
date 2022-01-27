package BlueStone_;

import java.util.HashSet;

public class UniqueCharac_inString {

	public static void main(String[] args) {
		
		String str = "aaapplllee";
		String name ="shaikzakirhussain";
		// a p p l e 
		//
		str.charAt(0);
		
		//HashSet --- it will take only uniques
		//boy boy cat -- boy cat
		
		
		//Apple - aple
		//aple
		
		//a p p l e
		//a p l e
	
		HashSet<Character> UniqChr = new HashSet<Character>();
		
		for(int i=0;i<str.length();i++)
		{
			UniqChr.add(str.charAt(i));
					
		}
		System.out.println(UniqChr);
		
		
		
		
		/*
		UniqChr.add(str.charAt(0));
		UniqChr.add(str.charAt(1));
		UniqChr.add(str.charAt(2));
		UniqChr.add(str.charAt(3));
		UniqChr.add(str.charAt(4));
		
		System.out.println(UniqChr);
		*/
		
		
		

	}

}
