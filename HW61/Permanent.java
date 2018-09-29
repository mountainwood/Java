package hw61Employee;

public class Permanent extends Employee {
	private double salary;
	
	Permanent(int empno, String sex, String name, String day, String phone, String address, double salary){
		super(empno, sex, name, day, phone, address);
		this.salary = salary;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public void display() {
		super.display();
		System.out.printf("¥»Á~ = %s ", salary);
	}
	
	public double paySalary() {
		return salary;
	}
	
}

