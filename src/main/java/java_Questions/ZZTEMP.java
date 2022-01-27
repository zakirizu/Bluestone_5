package java_Questions;

import java.util.HashSet;

public class ZZTEMP {

	public static void main(String[] args) {
		String EnterStr = "AABddBkkDD";
		CheckPalendrome(EnterStr);

	}

	private static void CheckPalendrome(String enterStr) {
		int count = 0;
		HashSet<Character> Hs = new HashSet<Character>();
		for(int i =0;i<enterStr.length();i++)
		{
			Hs.add(enterStr.charAt(i));	
		}
		System.out.println(Hs);
		
		for(int j =0;j<enterStr.length();j++)
		{
			if(Hs.contains(enterStr.charAt(j)));
			{
				count = count+1;
			}
			
			if(count>1)
			{
			System.out.println(count);
			}
		}

		
		}
		
	}


