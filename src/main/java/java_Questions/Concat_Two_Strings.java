package java_Questions;

public class Concat_Two_Strings {

	public static void main(String[] args) {
		String one = "My Name is ";
		String two = "Shaik Zakir Hussain";
		String three = "Zakir";
		Method_Concatinate(one,two);
		Method_Contains(two,three);
	}
	
	public static void Method_Concatinate(String one,String two) {
		String joined = one.concat(two);
		String joined2 = one+two;
		System.out.println(joined);
		System.out.println(joined2);
		/*
		concat() method takes only one argument of string and concat it with other string.
		+ operator takes any number of arguments and concatenates all the strings.
		concat() method takes only string arguments, if there is any other type is given in arguments then it will raise an error.
		+ operator takes any type and converts to string type and then concatenates the strings.
		*/		
	}
	public static void Method_Contains(String two,String three) {
		if(two.contains(three)) {
			System.out.println("Contains");
			}
		else
		{
			System.err.println("Dose Not Contain");
		}
	}	
	
	public static void Method_CharSequence(String two,String three) {
	/*
	 A CharSequence is an Interface. String is an immutable(Unchangeable over time) sequence of characters and implements the CharSequence interface.
	 CharSequence[] and String[] are just arrays of CharSequence and String respectively.
	 */
		CharSequence cs = "example.com";
	}
}
