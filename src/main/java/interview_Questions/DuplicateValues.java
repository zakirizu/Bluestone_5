package interview_Questions;

import java.util.HashSet;

public class DuplicateValues {

	public static void main(String[] args) {
		String a = "ZAKIRRR";
		int count=0;

		HashSet<Character> hset = new HashSet<Character>();
		for(int i=0;i<a.length();i++)
		{
		hset.add(a.charAt(i));	
		}
		Object[] hsetArr = hset.toArray();
	
System.out.println("Distinc values are "+hset);
 for (int i=0;i<hsetArr.length;i++)
 {
	 System.out.println(hsetArr[i]);
 }
System.out.println();

for(int i=0;i<hsetArr.length;i++)

{	
	char p = (char) hsetArr[i];
	
	for (int j=0;j<a.length();j++)
	{
		//if() 
		{
		count = count+1;
		}
		
	}








	}


	}}
