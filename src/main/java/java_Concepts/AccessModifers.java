package java_Concepts;

class ABC
{
private int data = 40;
private void msg() {
System.out.println("This is a Private Message");}
}

class XYZ{
static void main(String args[]) {
ABC pri = new ABC();
//Un Comment Error cannot access the method in the private
//pri.msg(); 
}	
}

/*
#DEFAULT
If you don't use any modifier, it is treated as default by default. The default modifier is accessible only within package. 
It cannot be accessed from outside the package. It provides more accessibility than private. 
But, it is more restrictive than protected, and public.

#PROTECTED
The protected access modifier is accessible within package and outside the package but through inheritance only.

#PRIVATE
This can be accessed within the class. In order to update the data in the private class we can make use of getter and setter methods
encapsulation can be achieved by this access modifier 

public----The code is accessible for all classes	
private----	The code is only accessible within the declared class	
default----	The code is only accessible in the same package. This is used when you don't specify a modifier. 
protected---	The code is accessible in the same package and subclasses.

			==========================ACCESS LEVEL================================

			InClass 			InPackage			OutsidePackageBy(Inherit)SubClass		OutsidePackage
public--------YES----------------YES----------------------YES---------------------------------YES-----		

private-------YES----------------No-----------------------No-----------------------------------NO------  	Within Class 

protected-----YES----------------YES----------------------YES----------------------------------NO------ 	Within and Outside Package & Class 

default-------YES----------------YES----------------------NO-----------------------------------NO------		Within Pacakage & Class
*/