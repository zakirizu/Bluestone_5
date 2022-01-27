/**
 * Udemy-Section_27_Video_
 * Date: 2019-Sep-
 */
package interview_Questions;

import java.util.ArrayList;
import java.util.HashSet;



/**
 * @author Administrator
 *
 */
public class Split_String {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	String Full_Name = "Zakir Hussain Shaik";
	String TrackingID = "TrackingID# 11223# 344";

	
	String[] M = Full_Name.split(" ");
	System.out.println(M.length);
	
	System.out.println(M[0].trim());
	System.out.println(M[1].trim());
	System.out.println(M[2].trim());
	
	
	String[] M2 = TrackingID.split(" ");
	System.out.println(M2.length);
	
	System.out.println(M2[0].trim());
	System.out.println(M2[1].trim());
	System.out.println(M2[2].trim());
	

}
}
