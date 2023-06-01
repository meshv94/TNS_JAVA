package tnsJava;

public class Member {
	String name, address;
	int age,phone,salary;
	
	public void printsalary() {
		System.out.println(this.salary);
	}
	
	public Member() {
		name = "Harsh";
		address = "64D- streert";
		age = 20;
		phone = 34646;
		salary = 1000;
	}
	
}
