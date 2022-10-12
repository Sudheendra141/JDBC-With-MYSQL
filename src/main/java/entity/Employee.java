package entity;

public class Employee {

	private String firstName;
	private String lastName;
	private int id;
	private float salary;
	private String department;
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public Employee(String firstName, String lastName, int id, float salary, String department) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.id = id;
		this.salary = salary;
		this.department = department;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	@Override
	public String toString() {
return "Name: "+this.firstName+" "+this.lastName;
	} 
}
