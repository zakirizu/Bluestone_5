package JAVA_Bluestone;

public class LOOPS {
	
//dowhile-- false condition
	private static void do_while_loop() {
		System.out.println("I am inside Do While Loop");
		int i= 1;
		do {			
			System.out.println(i);
			i++;			
		}while(i>=10);//false		
	}

//whileloop - False condition
	private static void while_loop() {
		
		System.out.println("I am inside While Loop");
		int i=1;		
		while(i>=10)//False
		{
			System.out.println(i);
			i++;					
		}}

//forloop - Iam giving a false condition	
	private static void for_Loop() {
		
		System.out.println("I am inside for Loop");
		
		for(int i=1; i>=10 ; i++)////condition - false
		{
			System.out.println(i);
		}
			
		
	}


	public static void main(String[] args) {	
		//for_Loop();
		//while_loop();
		do_while_loop();
		}
	
	

}
