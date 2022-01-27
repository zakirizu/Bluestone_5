package java_Concepts;

public class Constrtuctor_With_Parameters {
	int NewAge;
	String FullName;
	
	public static void main(String[] args) {
		Constrtuctor_With_Parameters cwp = new Constrtuctor_With_Parameters(26, "Hussain");	
		System.out.println("New Age after 5 years = "+cwp.NewAge);
		System.out.println("New Age after 5 years = "+cwp.FullName);

	}

	public Constrtuctor_With_Parameters(int age,String Name) {
		
		NewAge = age+5;
		FullName = "Zakir " + Name;
		
	}
}
