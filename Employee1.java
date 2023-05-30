package tnsJava;

public class Employee1 {

	public static void main(String[] args) {
		
		Employee e1 = new Employee("Robert", 1994, 50000, "64C- WallsStreet");
		Employee e2 = new Employee("Sam", 2000, 60000, "68D- WallsStreet");
		Employee e3 = new Employee("John", 1999, 55000, "26B- WallsStreet");
		
		System.out.println(" name " +" "+ " year "+" "+" salary "+" "+" Address");
		
		e1.Display();
		e2.Display();
		e3.Display();
	}

}
