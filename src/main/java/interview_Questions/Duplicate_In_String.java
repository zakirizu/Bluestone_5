/**
 * Udemy-Section_27_Video_
 * Date: 2019-Sep-
 */
package interview_Questions;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class Duplicate_In_String {

	/**
	 * There is an array with duplicate values
	 * 
	 * Question : print distinct values 
	 * Question: print how many times the distinct values are there in the array
	 * 
	 */
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int a[] = {2,2,2,2,5,5,5,7,7,7,7,8,7};
		HashSet<Integer> hset = new HashSet<Integer>();
		for(int i=0;i<a.length;i++)
		{
		hset.add(a[i]);	
		}
		Object[] dis = hset.toArray();
	
System.out.println("Distinc values are "+hset);
 for (int i=0;i<dis.length;i++)
 {
	 System.out.println(dis[i]);
 }
System.out.println();

for(int i=0;i<dis.length;i++)

{	
	int p = (int) dis[i];
	int count=0;
	for (int j=0;j<a.length;j++)
	{
		if(p==a[j]) 
		{
		count = count+1;
		}
		
	}

System.out.println("Distinct Value "+dis[i] +" is available " +count +" times.");







}
	
 
 
 
 
	
}}
