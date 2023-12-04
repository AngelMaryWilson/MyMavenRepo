package mavenProjectPackages;

public class Encapsulation_Sample {
	
private String name="Angel";
private int age=30;
private int salary=1000;
private int employeeID=1234;
public String getName() {
	return name;
}
public int getAge() {
	return age;
}
public int getSalary() {
	return salary;
}
public int getEmployeeID() {
	return employeeID;
}
public void setEmployeeID(int employeeID) {
	this.employeeID = employeeID;
}


}