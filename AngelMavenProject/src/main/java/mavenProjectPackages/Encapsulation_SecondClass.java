package mavenProjectPackages;

public class Encapsulation_SecondClass {
	
	/*public void details()
	{
		System.out.println("We are calling private variables form another calss");
	}*/

	public static void main(String[] args) {
		Encapsulation_Sample obj=new Encapsulation_Sample();
		//obj.details();
		System.out.println("view:  "+obj.getName());
		System.out.println(obj.getAge());
		System.out.println(obj.getSalary());
		System.out.println("viewing new value"+obj.getSalary());
        obj.setEmployeeID(2345);
        System.out.println(obj.getEmployeeID());
	}

}
