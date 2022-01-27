package java_Questions;
import java.util.HashSet;
public class Count_Of_Chars_In_String {
//To find whether we can make a Palendrome with a given word or not 
	public static void main(String[] args) {
		String EnterStr = "AABddBsCCrrkkDD";
		CheckPalendrome(EnterStr);
		//EnterStr.charAt(0);
	}
	
public static void CheckPalendrome(String GivenString) {
//Creating a Char Array of Charecters 	
char[] GivenArray = GivenString.toCharArray();	

//Creating a HashSet from given word and adding to an array
HashSet<Character> hs = new HashSet<Character>();
for(int i=0;i<GivenArray.length;i++)
{hs.add(GivenArray[i]);}
System.out.println(hs);
Object[] UniqueArray = hs.toArray();

//verifying the duplicate values
int count=0;
int UniqueCharsCount=0;
for(int i=0;i<UniqueArray.length;i++)
{
	for(int j=0;j<GivenArray.length;j++)
	{
		if(UniqueArray[i].equals(GivenArray[j]))
		{
			count++;
		}
	}
	if(count%2!=0)
	{
		UniqueCharsCount++;
	}
	System.out.println("Word "+UniqueArray[i]+" is Repeated "+count +" Times");
	count = 0;
}

if(UniqueCharsCount>1)
{System.out.println("Cannot Create a Palendrome with Given String "+GivenString);}
else
{System.out.println("Can Create a Palendrome with Given String "+GivenString);}
	
}

}
