
public abstract class Employee {
	private int empno;			//員工姓名
	private String name;		//員工姓名
	
	//加入員工計數功能，p.65, pp.130
	//員工計數的變數
	private static int empCount;
	
	Employee(){			////step.4  增加step.3 所需的建構子
		System.out.println("constructor with no args...");		//標記
		
		//加入員工計數功能，p.65, pp.130
		empCount++;
	}
	
	Employee(int empno, String name){			//step.2，針對step.1 建立自己的建構子
		System.out.println("constructor with two args...");		//標記
		this.empno = empno;			//this Reference
		this.name = name;			//(int empno, String name) -->  empno = empno; name = name
		
		//加入員工計數功能，p.65, pp.130
		empCount++;
	}
	
	//chapt7.封裝 加入封裝的概念
	public void setEmpno(int empno) {
		this.empno =  empno;
	}
	
	public int getEmpno() {
		return empno;
	}
	
	public void setName(String name ) {
		this.name =  name;
	}
	
	public String getName() {
		return name;
	}
	
	public static int getEmpCount() {		//為甚麼static getEmpCount需要使用封裝的概念？因為default？
											//static getEmpCount 少加了private
		return empCount;
	}
	
	public static void setEmpCount(int empCount) {
		Employee.empCount = empCount;
	}

	public void display() {
		System.out.println("empno = " + empno);
		System.out.println("Name = "+ name);
	}
	/* 獨立至EmployeeMain
	public static void main(String[] args) {
		System.out.println("beginning...");
		Employee e1 = new Employee();			//公司來了一個員工，e1建檔	<---step.3 此地方java不再幫忙建立建構子，需自己增加
		e1.empno = 111;
		e1.name = "Tom";                                                                                                                                             
		e1.display();
		Employee e2 = new Employee(222, "Mary");			//公司來了一個員工，e1建檔	step.1
		e2.display();
		System.out.println("ending...");

	}
	 */
	
	//多型章節新增
	public abstract double paySalary(); //{	//應對Main之甲
	//	return 0;
	//}
	
	//抽象修飾子
	//Multiple markers at this line
	//- Abstract methods do not specify a body
	//- The abstract method paySalary in type Employee can only be defined by an 
	// abstract class
	
	//應用多型的加薪程式
	void raiseSalary(Employee e) {
		if(e instanceof Permanent) {
			Permanent p = (Permanent)e;
			
			//chapt7.封裝  加入了封裝的private 和 access Modifier後，出現The field Employee.empno is not visible
			//所以要修改寫法，這裡也加入封裝的概念
			//p.salary *= 1.1;		<--封裝的概念
			p.setSalary(p.getSalary() * 1.1);
		}else if (e instanceof Temporary) {
			Temporary t = (Temporary)e;
			
			//chapt7.封裝  加入了封裝的private 和 access Modifier後，出現The field Employee.empno is not visible
			//所以要修改寫法，這裡也加入封裝的概念
			//t.hourPay += 20;		<--封裝的概念
			t.setHourPay(t.getHourPay()+20);
		}
	}
	
}