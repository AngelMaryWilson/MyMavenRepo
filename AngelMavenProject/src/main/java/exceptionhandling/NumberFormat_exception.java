package exceptionhandling;

public class NumberFormat_exception {

	public static void main(String[] args) {

    try 
    {
    	String z="Angel";
    	int i=Integer.parseInt(z)	;	
    }
    catch(NumberFormatException e)
    {
    	System.out.println("Exception Handled");
    	System.out.println(e);
    }

	}

}
