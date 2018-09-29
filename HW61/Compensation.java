package hw61Employee;

public class Compensation extends Permanent{
	//¾�ȥ[��
	private int allowence;		//¾�ȥ[��
	private int eating;			//���\�[��
	private int traffic;		//��q�[��
	private double normalSalary;	//���~�[¾�ȡB���\�B��q�[��
	
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
		System.out.printf("| ¾�ȥ[�� = %s | ���\�[�� = %s | ��q�[�� = %s", allowence, eating, traffic);
	}
	
	public double paySalary() {
		normalSalary = super.paySalary() + this.allowence + this.eating + this.traffic;
		return normalSalary;
	}
	
}