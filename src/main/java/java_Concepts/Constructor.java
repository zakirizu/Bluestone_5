package java_Concepts;

public class Constructor {

	int age,phoneNum;//Creating class attributes(Variables with the class)
	String Name;
	char Sex;
	
	
	public static void main(String[] args) {
		//creating a object for the class
		Constructor cst = new Constructor();
		System.out.println("age = "+cst.age);
		System.out.println("Name = "+cst.Name);
		System.out.println("Sex = "+cst.Sex);
		System.out.println("phoneNum = "+cst.phoneNum);

	}

public Constructor() {
	//setting the initial values for the attributes 
	age = 31;
	 Name = "Zakir";
	 Sex = 'M';
	 phoneNum= 964869539;	
}}


/*Note that the constructor name must match the class name, and it cannot have a return type (like void).

Also note that the constructor is called when the object is created.

All classes have constructors by default: if you do not create a class constructor yourself,
java creates one for you. However, then you are not able to set initial values for object attributes.
 */