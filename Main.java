/*
 * Create a class named 'Member' having the following members:
Data members
1 - Name
2 - Age
3 - Phone number
4 - Address
5 - Salary
	It also has a method named 'printSalary' which prints the salary of the members.
Two classes 'Employee' and 'Manager' inherits the 'Member' class. The 'Employee' 
and 'Manager' classes have data members 'specialization' and 'department' respectively.
 Now, assign name, age, phone number, address and salary to an employee and a manager by 
 making an object of both of these.
 */

package tnsJava;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Manager m1 = new Manager();
		m1.printsalary();

	}

}
