
public class Permanent extends Employee {
	private double salary;
	
	Permanent(){	//�ݭn�غc�l
		
	}
	
	Permanent(int empno, String name, double salary){
		//this.empno = empno;
		//this.name = name;		//�I�s�������\��
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
		super.display();	//�Hsuper �I�s�������\��
		System.out.println("salary = " + salary);
	}
	
	//�h�����`
	public double paySalary() {
		return salary;
	}
}
