package review_2_practice;

public class Method_Overriding_Class2 extends Method_Overriding_Class1 {
	public void fun(int a, int b)
	{
		System.out.println("2nd method in 2nd class"+a+""+b);
	}

	public static void main(String[] args) {
		
		Method_Overriding_Class2 obj =new Method_Overriding_Class2();
		obj.fun(30, 40);
	}

}
