package java_Concepts;

class Encapsulation {
String Name = "Zakir";
	
public String getName(){
	return getName();
	}

public void  setName(String newName){
	this.Name = newName;	
}


	public  void main(String[] args) {
		Encapsulation ec = new Encapsulation();
		
		//getting the data from private class
		String test = ec.getName();
		System.out.println(test);
		
		//setting the new data to the name
		ec.setName("Zakir Shaik");
		
		//getting the data from the private
		String test2 = ec.getName();
		System.out.println(test);
		

	}

}
/*
Encapsulation is process of hiding the data. We can achieve encapsulation by follwoing
-Declare Class Variables/attributes as private
-provide public set and get method tp access and updated the data in private class 





*/