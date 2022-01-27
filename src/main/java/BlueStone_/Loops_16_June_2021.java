package BlueStone_;

public class Loops_16_June_2021 {

	public static void main(String[] args) {
		for_Loop();
		While_Loop();
		Do_While_loop();
	}

	private static void Do_While_loop() {
	System.out.println("Do While Loop");
		int i=1;
		do {
		System.out.println(i);		
		i++;
	}
	while(i<10);
		
	}

	private static void While_Loop() {
		System.out.println("While Loop");
		int i=1;
		while(i<10)
		{
		System.out.println(i);
		i++;			
		}
		
	}

	private static void for_Loop() {
		
		System.out.println("For Loop");
		for(int i =1;i<10;i++)
		{
			System.out.println(i);
			
			
		}
		
	}

}
