package exceptionhandling;

public class Null_Pointer_Exception {

	public void nullPointer()
	{
		try
		{
			String h=null;
			System.out.println(h.length());
		}
		catch(NullPointerException e)
		{
			System.out.println("exception handled");
			System.out.println(e);
		}
	}
	
	public static void main(String[] args) {
		Null_Pointer_Exception obj= new Null_Pointer_Exception();
		obj.nullPointer();

	}

}
