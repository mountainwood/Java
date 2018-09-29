package hw61Employee;

public abstract class Employee {
	private int empno;
	private String sex;
	private String name;
	private String day;
	private String phone;
	private String address;
	
	//Employee(){}
	Employee(int empno, String sex, String name, String day, String phone, String address){
		this.empno = empno;
		this.sex = sex;
		this.name = name;
		this.day = day;
		this.phone = phone;
		this.address = address;
	}
	
	/*
	Employee(int empno, String sex, String name){		//���FPermanent�Ҷ}���غc�l
		this.empno = empno;
		this.sex = sex;
		this.name = name;

	}
	*/
	
	public int getEmpno() {
		return empno;
	}


	public void setEmpno(int empno) {
		this.empno = empno;
	}


	public String getSex() {
		return sex;
	}


	public void setSex(String sex) {
		this.sex = sex;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getDay() {
		return day;
	}

	public void setDay(String day) {
		this.day = day;
	}

	public String getPhone() {
		return phone;
	}


	public void setPhone(String phone) {
		this.phone = phone;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public void display() {
		System.out.printf("���u�s��  = %d | ", empno);
		System.out.printf("���u�m�O = %s | ", sex);
		System.out.printf("���u�m�W = %s | ", name);
		System.out.printf("���u��¾�� = %s | ", day);
		System.out.printf("���u�q�� = %s | ", phone);
		System.out.printf("���u�a�} = %s |%n ", address);
	}
	
	public abstract double paySalary();
	
	void raiseSalary(Employee e) {
		if(e instanceof Permanent) {				//�p�G���@��¾��
			Permanent p = (Permanent)e;
			p.setSalary(p.getSalary());				//�p�G���@��¾���A�~�ꬰ���~
		}else if (e instanceof Compensation) {		//�p�G���@�B�G�ťD��
			Compensation c = (Compensation)e;		//���ƻ�n��e�H
			c.setNormalSalary(c.getNormalSalary());							//�~�ꬰ���~ + ¾�ȥ[�� + ��q�z�K + ���\�z�K 
		}else if (e instanceof Overtime) {			//���[�Z����
			Overtime o = (Overtime)e;
			o.setHourPay(o.getHourPay() * o.getWorkHour());		//���~���H240���H1.5���A���H�[�Z�ɼ�
		}
	}
}

