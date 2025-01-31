package Exercice_4;

public class Employee {
	private int id;
	private String firstname;
	private String lastname;
	private int salary;
	
	public Employee(int id, String firstname, String lastname, int salary) {
		this.id = id;
		this.firstname = firstname;
		this.lastname = lastname;
		this.salary = salary;
	}
	
	public int getId() {
		return this.id;
	}
	
	public String getFirstName() {
		return this.firstname;
	}
	
	public String getLastName() {
		return this.lastname;
	}
	
	public int getSalary() {
		return this.salary;
	}
	
	public void setSalary(int newSalary) {
		this.salary = newSalary;
	}
	
	public int getAnnualSalary() {
		return this.salary * 12;
	}
	
	public void raiseSalary(int percent) {
		this.salary = salary * percent;
	}
	
	public String toString() {
		   return "Employee[id=" + this.id + " firstname=" + this.firstname + " lastname=" + this.lastname + " salary=" + this.salary + "]";
		}

}
