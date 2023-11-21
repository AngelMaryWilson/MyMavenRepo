package mavenProjectPackages;

public class SubClass extends SuperKey_Sample {

	int a=6;
	public void numbers()
	{
		System.out.println(super.a);
		System.out.println(a);
	}
	public static void main(String[] args) {
		SubClass obj = new SubClass();
		obj.numbers();
		//System.out.println("main method"+super.a);
	}

}
