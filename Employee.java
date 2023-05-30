package tnsJava;


public class Employee {
	
	String name;
	int year;
	int salary;
	String Address;
	
	public Employee(String n, int y, int s, String a) {
		name = n;
		year = y;
		salary = s;
		Address = a;
	}
	
	public void Display() {
		System.out.println(name +"  "+ year+"  "+salary+"  "+Address);
	}
	
	
}
