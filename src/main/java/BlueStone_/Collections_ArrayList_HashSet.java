package BlueStone_;

import java.util.ArrayList;
import java.util.HashSet;

public class Collections_ArrayList_HashSet {

	public static void main(String[] args) {
		
		ArrayList<String> Colors = new ArrayList<String>();
		
		Colors.add("Green");//0
		Colors.add("Red");//1
		Colors.add("Yellow");//2
		Colors.add("Yellow");//3
		Colors.add("Red");//4
		
		System.out.println(Colors);
		
		for(int i=0;i<Colors.size();i++)
		{
			System.out.println(Colors.get(i));
		}
		
		System.out.println("---------------------------------");
	
		HashSet<String> Hs_colors  = new HashSet<String>();		
		Hs_colors.add("Yellow");
		Hs_colors.add("Green");
		Hs_colors.add("Red");		
		Hs_colors.add("Yellow");
		Hs_colors.add("Red");
		
		System.out.println(Hs_colors);
	
		
		
		
		//HashSet 
		//Not Printing Duplicate values
		//It is not maintaining the order
		//Array - 10 objects - 10bits mermory
		// 5 objects -- 10 bits memory --- 5bits of memory 
				
		
		//Collections
		//ArrayList - Dynamic
		//1-1
		//2-2
		//3-3
		//4-4 bits mermory

		
		/*
		
		ArrayList<Integer> num = new ArrayList<Integer>();
		num.add(10);
		num.add(21);
		
		ArrayList<Character> ch = new ArrayList<Character>();
		ch.add('a');
		ch.add('z');
		
		*/
		
		
		
		//String
		//Interger
		//Character
		

		
		
		
		
		
		

	}

}
