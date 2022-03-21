package JAVA_Bluestone;

public class Try_Catch {

	    public static void main(String args[])
	    {
	        try
	        {
	            System.out.println("First statement of try block");
	            int num=45/3;
	            System.out.println(num);
	        }
	        catch(Exception e)
	        {
	            System.out.println("Test caught Exception");
	        }
	        finally
	        {
	            System.out.println("finally block");
	        }
	        System.out.println("Main method");
	    }
}
 