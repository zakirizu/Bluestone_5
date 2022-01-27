package java_Concepts;
import java.util.Arrays;
import java.util.Collections;

public class Sort_Array_Integers {
	public static void main(String[] args) {
		ArraySort_Ascending();
		ArraySort_Descending();
		AlphabetSort();}

	public static void ArraySort_Ascending() {
		int[] arr = {2,96,58,874 };
		System.out.println("Array");		
		for(int i =0;i<arr.length;i++)
		{System.out.println(arr[i]);}
		Arrays.sort(arr);
		System.out.println("Ascending Order Sorting");
		for(int i =0;i<arr.length;i++)
		{System.out.println(arr[i]);}}
	
	public static void ArraySort_Descending() {
		Integer[] arr = {7,4,5,6,6,9};
		System.out.println("Array");
		for(int i =0;i<arr.length;i++)
		{System.out.println(arr[i]);		}
		//See we have declared Integer as a method, Then only we can use this Collections - Else we will get an error
		Arrays.sort(arr,Collections.reverseOrder());
		System.out.println("Descending Order Sorting");
		for(int i =0;i<arr.length;i++)
		{System.out.println(arr[i]);}}

		public static void  AlphabetSort(){
			char[] CharArray = {'z','a','k','i','r'};
			Arrays.sort(CharArray);
			for(int i=0;i<CharArray.length;i++) 
			{System.out.println(CharArray[i]);}}
		
			//using the for loops 
		/*
		 *      //Sort the array in descending order    
        for (int i = 0; i < arr.length; i++) {     
            for (int j = i+1; j < arr.length; j++) {     
               if(arr[i] < arr[j]) {    
                   temp = arr[i];    
                   arr[i] = arr[j];    
                   arr[j] = temp;    
               }     
            }     
        }  
		 * */
		
	}
