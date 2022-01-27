package java_Concepts;

class MethodOverRiding_Child extends MethodOverRiding  {

public static void Vehicle() {
	System.out.println("Child Class- Bike ");}

/*Add this code and see the difference
 * public static void Vehicle1() {
	System.out.println("Child Class- Bike ");}
 */

public static void Car() {
	System.out.println("Child Class- Car ");}


public static void main(String[] args) {
	MethodOverRiding_Child ch = new MethodOverRiding_Child();
	ch.Vehicle();
	ch.Car();
}

}

/*Can we override static method?
No, a static method cannot be overridden. It can be proved by runtime polymorphism, so we will learn it later.

##Method Over ride overides the parent method. the same can be seen while updaing the int/string values. 
In Order to not allow overide in the attribues(variables within class) we use final key word in java

Why can we not override static method?
It is because the static method is bound with class whereas instance method is bound with an object. Static belongs to the class area, and an instance belongs to the heap area.

Can we override java main method?
No, because the main is a static method.

 * 
 */





