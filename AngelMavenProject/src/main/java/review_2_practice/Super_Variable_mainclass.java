package review_2_practice;

public class Super_Variable_mainclass extends Super_Variable {
	
	public void show()
	
	
	{
		int b=55;
		System.out.println("super variable in previous class"+(super.b));
		System.out.println("varible in current class"+b);
		
	}

	public static void main(String[] args) {
		Super_Variable_mainclass obj =new Super_Variable_mainclass();
		obj.show();

	}

}
