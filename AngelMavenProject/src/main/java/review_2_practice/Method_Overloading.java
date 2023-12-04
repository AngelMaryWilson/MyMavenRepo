package review_2_practice;

public class Method_Overloading {
	
	public void fun(int a)
	{
		System.out.println("1st method"+a);
		
	}
	public void fun(int a, int b)
	{
		System.out.println("2nd method"+a+" "+b);
	}
	public void fun(String g)
	{
		System.out.println("String angel"+g);
	}

	public static void main(String[] args) {
		Method_Overloading obj = new Method_Overloading();
		obj.fun(20);
		obj.fun(2, 3);
		obj.fun("Angel");// TODO Auto-generated method stub

	}

}
