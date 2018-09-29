
public class Sales extends Permanent {
	private double commission;		//佣金
	
	Sales(int empno, String name, double salary, double commission){
		super(empno, name, salary);
		this.commission = commission;
	}
	
	public double getCommission() {
		return commission;
	}

	public void setCommission(double commission) {
		this.commission = commission;
	}



	public void display() {
		super.display();
		System.out.println("commission = " + commission);
	}
	
	//多型章節新增
	public double paySalary() {
		//return salary;		<---封裝的章節修改成以下
		return super.paySalary() + commission;
		}
}

