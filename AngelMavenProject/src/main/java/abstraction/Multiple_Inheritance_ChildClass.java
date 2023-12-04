package abstraction;

public class Multiple_Inheritance_ChildClass implements Multiple_Inheritance_Interface1,Multiple_Inheritance_Interface2 {
	
	public void show()
	{
		System.out.println("Same method in two parent interface");
	}

	public static void main(String[] args) {
		
		Multiple_Inheritance_ChildClass obj =new Multiple_Inheritance_ChildClass();
		obj.show();
		

	}

}
