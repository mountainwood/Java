package hw61Employee;

public class Overtime extends Permanent{
	private double hourPay;
	private int workHour;
	
	Overtime(int empno, String sex, String name, String day, String phone, String address, double salary,
			int workHour){
		super(empno, sex, name, day, phone, address, salary);
		//this.hourPay = hourPay;			//�[�Z���~
		this.workHour = workHour;		//�[�Z�ɼ�
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
		hourPay = (super.paySalary() / 240)*1.5;		//�[�Z�O�����~���H240���H1.5���A�A���H�[�Z�ɼ�		
		return super.paySalary() + hourPay * workHour;						//�����A�[�W�[�Z�z�K
	}
	
	public void display() {
		super.display();
		//System.out.println("hourPay = " + hourPay);
		System.out.println("| �[�Z�ɼ�  = " + workHour);
	}
	
}