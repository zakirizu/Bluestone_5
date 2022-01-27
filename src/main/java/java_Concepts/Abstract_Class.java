package java_Concepts;

//Abstract class--Can have both the abstract and non abstract methods
abstract class Animal {
// Abstract method (does not have a body)
public abstract void animalSound();
// Regular method
public void sleep() {
 System.out.println("Zzz");
}
}

//Subclass (inherit from Animal)
class Dog extends Animal {
public void animalSound() {
 // The body of animalSound() is provided here
 System.out.println("The Dog says: Bow Bow");
}
}

class Main {
public static void main(String[] args) {
 Dog MyDog = new Dog(); // Create a Pig object
 MyDog.animalSound();
 MyDog.sleep();
}
}