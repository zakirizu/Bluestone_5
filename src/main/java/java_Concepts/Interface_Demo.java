package java_Concepts;


//Creating a Interface class --Note that this does not have any code. it has only Methods which are implemented by other class
interface  Interface_Demo {
public void SendMessage();
public void DeliveryStatus();

}	

class Implentation_Demo implements Interface_Demo{
	
public void SendMessage() {
	System.out.println("Good Morning is the Message");
}
	
public void DeliveryStatus() {
	System.out.println("Message is Delivered");
	
}

 public static void main(String[] args) {
		Implentation_Demo ID = new Implentation_Demo();
		ID.SendMessage();
		ID.DeliveryStatus();

	}

}

/*
 * Notes on Interfaces:
Like abstract classes, interfaces cannot be used to create objects 
Interface methods do not have a body - the body is provided by the "implement" class
On implementation of an interface, you must override all of its methods
Interface methods are by default abstract and public
Interface attributes are by default public, static and final
An interface cannot contain a constructor (as it cannot be used to create objects)
############################################################IMPORTANT#################################
Why And When To Use Interfaces?
1) To achieve security - hide certain details and only show the important details of an object (interface).
############################################################IMPORTANT#################################
2) Java does not support "multiple inheritance" (a class can only inherit from one superclass).
 However, it can be achieved with interfaces, because the class can implement multiple interfaces.
 Note: To implement multiple interfaces, separate them with a comma (see example below).
 * 
 * 
 * 
 * 
 */