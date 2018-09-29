package hw61Employee;

public class Overtime extends Permanent{
	private double hourPay;
	private int workHour;
	
	Overtime(int empno, String sex, String name, String day, String phone, String address, double salary,
			int workHour){
		super(empno, sex, name, day, phone, address, salary);
		//this.hourPay = hourPay;			//加班時薪
		this.workHour = workHour;		//加班時數
	}
	
	public double getHourPay() {
		return hourPay;
	}

	public void setHourPay(double hourPay) {
		this.hourPay = hourPay;
	}

	public int getWorkHour() {
		return workHour;
	}

	public void setWorkHour(int workHour) {
		this.workHour = workHour;
	}


	
	public double paySalary() {
		hourPay = (super.paySalary() / 240)*1.5;		//加班費為本薪除以240乘以1.5倍，再乘以加班時數		
		return super.paySalary() + hourPay * workHour;						//本金再加上加班津貼
	}
	
	public void display() {
		super.display();
		//System.out.println("hourPay = " + hourPay);
		System.out.println("| 加班時數  = " + workHour);
	}
	
}