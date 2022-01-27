package java_Questions;

import java.util.ArrayList;
import java.util.Collections;

public class Sort_ArrayList {

	public static void main(String[] args) {
		int[] st = {9,8,4,5,7};
		char[] ch = {'z','a','k'};
		ArrayList<Integer> arInt = new ArrayList<Integer>();
		ArrayList<Character> arChar = new ArrayList<Character>();
		for(int i=0;i<st.length;i++)
		{ arInt.add(st[i]);}
		for(int i=0;i<ch.length;i++)
		{ arChar.add(ch[i]);}
		
		SortArrayList_Alphabet(arInt);
		SortArrayList_Integer(arChar);
		
	}
public static void SortArrayList_Alphabet(ArrayList arInt) {
	System.out.println("Given ="+arInt);
	Collections.sort(arInt);
	System.out.println("Asc  = "+arInt);
	Collections.sort(arInt, Collections.reverseOrder());
	System.out.println("Dec  = "+arInt);
	
		
}
public static void SortArrayList_Integer(ArrayList arChar) {
	System.out.println("Given = "+arChar);	
	Collections.sort(arChar);
	System.out.println("Asc   	= "+arChar);
	
	
}

}
