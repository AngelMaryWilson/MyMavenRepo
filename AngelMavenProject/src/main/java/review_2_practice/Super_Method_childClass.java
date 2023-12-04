package review_2_practice;

public class Super_Method_childClass extends Super_method{

	
	public void add()
	{
		super.addition();
		System.out.println("method in child class");
	}
	public static void main(String[] args) {
		
		Super_Method_childClass obj =new Super_Method_childClass();
		obj.add();
		
	}

}
