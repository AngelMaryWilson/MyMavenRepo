package second_package;
import mavenProjectPackages.*;

public class Second_Class_ProtectedModifier extends Protect_AccessModifier_sample {

	public static void main(String[] args) {
		
	Second_Class_ProtectedModifier obj= new Second_Class_ProtectedModifier();
	obj.view();/* we required to extends and by using child class we can access the 
	protected modifier*/
	
	/*Protect_AccessModifier_sample obj3=new Protect_AccessModifier_sample();
	obj3.view();
	
	we can not access protect modifier in another package*/
				
	}

}
