
public class Permanent extends Employee {
	private double salary;
	
	Permanent(){	//需要建構子
		
	}
	
	Permanent(int empno, String name, double salary){
		//this.empno = empno;
		//this.name = name;		//呼叫父輩之功能
		super(empno, name);
		this.salary = salary;
	}
	
	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public void display() {
		//System.out.println("empno = " + empno);
		//System.out.println("Name = "+ name);
		super.display();	//以super 呼叫父輩的功能
		System.out.println("salary = " + salary);
	}
	
	//多型章節
	public double paySalary() {
		return salary;
	}
}
