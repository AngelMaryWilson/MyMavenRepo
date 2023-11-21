package mavenProjectPackages;

public class ChildofSuper_method extends Superkey_method{
	
	public void add()
	{
		super.add();
		System.out.println("this is child class method");
	}

	public static void main(String[] args) {
		ChildofSuper_method obj = new ChildofSuper_method();
		obj.add();
	}

}
