package hw61Employee;

public class Compensation extends Permanent{
	//職務加給
	private int allowence;		//職務加給
	private int eating;			//午餐加給
	private int traffic;		//交通加給
	private double normalSalary;	//本薪加職務、午餐、交通加給
	
	Compensation(int empno, String sex, String name, String day, String phone, String address, double salary, 
			int allowence, int eating, int traffic){
		super(empno, sex, name, day, phone, address, salary);
		this.allowence = allowence;
		this.eating = eating;
		this.traffic = traffic;
	}
	
	public int getAllowence() {
		return allowence;
	}
	public void setAllowence(int allowence) {
		this.allowence = allowence;
	}
	public int getEating() {
		return eating;
	}
	public void setEating(int eating) {
		this.eating = eating;
	}
	public int getTraffic() {
		return traffic;
	}
	public void setTraffic(int traffic) {
		this.traffic = traffic;
	}
	
	public double getNormalSalary() {
		return normalSalary;
	}

	public void setNormalSalary(double normalSalary) {
		this.normalSalary = normalSalary;
	}

	public void display() {
		super.display();
		System.out.printf("| 職務加給 = %s | 午餐加給 = %s | 交通加給 = %s", allowence, eating, traffic);
	}
	
	public double paySalary() {
		normalSalary = super.paySalary() + this.allowence + this.eating + this.traffic;
		return normalSalary;
	}
	
}