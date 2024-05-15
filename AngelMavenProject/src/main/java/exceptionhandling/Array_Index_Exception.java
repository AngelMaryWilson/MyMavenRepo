package exceptionhandling;

public class Array_Index_Exception {

	public void exceptionMethod()
	{
		try
		{
		
		int arr[]= {1,2,3,4};
		System.out.println(arr[10]);
		}
		
		catch (ArrayIndexOutOfBoundsException e)
		{
			System.out.println("exception handled");
			System.out.println(e);
		}
	}
	
	
	public static void main(String[] args) {
		
		Array_Index_Exception obj = new Array_Index_Exception();
		obj.exceptionMethod();

	}

}
