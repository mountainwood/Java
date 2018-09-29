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
	Employee(int empno, String sex, String name){		//為了Permanent所開的建構子
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
		System.out.printf("員工編號  = %d | ", empno);
		System.out.printf("員工姓別 = %s | ", sex);
		System.out.printf("員工姓名 = %s | ", name);
		System.out.printf("員工到職日 = %s | ", day);
		System.out.printf("員工電話 = %s | ", phone);
		System.out.printf("員工地址 = %s |%n ", address);
	}
	
	public abstract double paySalary();
	
	void raiseSalary(Employee e) {
		if(e instanceof Permanent) {				//如果為一般職員
			Permanent p = (Permanent)e;
			p.setSalary(p.getSalary());				//如果為一般職員，薪資為本薪
		}else if (e instanceof Compensation) {		//如果為一、二級主管
			Compensation c = (Compensation)e;		//為甚麼要用e？
			c.setNormalSalary(c.getNormalSalary());							//薪資為本薪 + 職務加給 + 交通津貼 + 午餐津貼 
		}else if (e instanceof Overtime) {			//有加班的話
			Overtime o = (Overtime)e;
			o.setHourPay(o.getHourPay() * o.getWorkHour());		//本薪除以240乘以1.5倍再乘以加班時數
		}
	}
}

