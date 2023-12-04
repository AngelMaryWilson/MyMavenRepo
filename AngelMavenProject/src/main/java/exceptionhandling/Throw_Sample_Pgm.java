package exceptionhandling;

public class Throw_Sample_Pgm {
	
	public void test(int age)
	
	{
		if(age<18)
		{
		throw new ArithmeticException("not eligible for vote");
		}
		
		else 
		{
			System.out.println("eligible for voting");
		}
		
	}

	public static void main(String[] args) {
		Throw_Sample_Pgm obj= new Throw_Sample_Pgm();
		obj.test(12);

	}

}
