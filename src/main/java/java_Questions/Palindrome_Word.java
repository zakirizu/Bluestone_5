package java_Questions;

import java.util.Arrays;

public class Palindrome_Word {

	public static void main(String[] args) {
		Palindrome_Type1("MADAM");
		Palindrome_Type2("madam");
		}

public static void Palindrome_Type1(String name) {
	String temp= "";
	
	for(int i=0;i<name.length();i++)
		
	{
		temp = name.charAt(i)+temp;
		
	}
	
	System.out.println(temp);
	
	if(name.equals(temp)) 
		{
			System.out.println("It is Palendrome");
		}
	else 
		{
			System.out.println("It is not Palendrome");
		}
	
}

























public static void Palindrome_Type2(String name) {
	int i = 0;
	int j=name.length()-1;
	while(i<j)
	{
		if(name.charAt(i)!=name.charAt(j))
		{
			System.out.println(" NOT Palendrom");
			break;		
		}
		i++;j--;
	}
	System.out.println("Palendrom");
	
}








}
	