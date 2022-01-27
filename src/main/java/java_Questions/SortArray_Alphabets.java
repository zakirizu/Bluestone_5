package java_Questions;

import java.util.Arrays;
import java.util.Collections;



public class SortArray_Alphabets {

	public static void main(String[] args) {
		int[] st = {9,8,4,5,7};
		char[] ch = {'z','a','k'};
		SortInt(st);
		SortChar(ch);}
	
public static void SortInt(int[] st) {
	Arrays.sort(st);
	for(int i=0;i<st.length;i++)
	{
		System.out.println(st[i]);
	}	
}

public static void SortChar(char[] st) {
	
	Arrays.sort(st);
	for(int i=0;i<st.length;i++)
	{
		System.out.println(st[i]);
	}	
}
}
