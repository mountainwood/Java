
public abstract class Employee {
	private int empno;			//���u�m�W
	private String name;		//���u�m�W
	
	//�[�J���u�p�ƥ\��Ap.65, pp.130
	//���u�p�ƪ��ܼ�
	private static int empCount;
	
	Employee(){			////step.4  �W�[step.3 �һݪ��غc�l
		System.out.println("constructor with no args...");		//�аO
		
		//�[�J���u�p�ƥ\��Ap.65, pp.130
		empCount++;
	}
	
	Employee(int empno, String name){			//step.2�A�w��step.1 �إߦۤv���غc�l
		System.out.println("constructor with two args...");		//�аO
		this.empno = empno;			//this Reference
		this.name = name;			//(int empno, String name) -->  empno = empno; name = name
		
		//�[�J���u�p�ƥ\��Ap.65, pp.130
		empCount++;
	}
	
	//chapt7.�ʸ� �[�J�ʸ˪�����
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
	
	public static int getEmpCount() {		//���ƻ�static getEmpCount�ݭn�ϥΫʸ˪������H�]��default�H
											//static getEmpCount �֥[�Fprivate
		return empCount;
	}
	
	public static void setEmpCount(int empCount) {
		Employee.empCount = empCount;
	}

	public void display() {
		System.out.println("empno = " + empno);
		System.out.println("Name = "+ name);
	}
	/* �W�ߦ�EmployeeMain
	public static void main(String[] args) {
		System.out.println("beginning...");
		Employee e1 = new Employee();			//���q�ӤF�@�ӭ��u�Ae1����	<---step.3 ���a��java���A�����إ߫غc�l�A�ݦۤv�W�[
		e1.empno = 111;
		e1.name = "Tom";                                                                                                                                             
		e1.display();
		Employee e2 = new Employee(222, "Mary");			//���q�ӤF�@�ӭ��u�Ae1����	step.1
		e2.display();
		System.out.println("ending...");

	}
	 */
	
	//�h�����`�s�W
	public abstract double paySalary(); //{	//����Main����
	//	return 0;
	//}
	
	//��H�׹��l
	//Multiple markers at this line
	//- Abstract methods do not specify a body
	//- The abstract method paySalary in type Employee can only be defined by an 
	// abstract class
	
	//���Φh�����[�~�{��
	void raiseSalary(Employee e) {
		if(e instanceof Permanent) {
			Permanent p = (Permanent)e;
			
			//chapt7.�ʸ�  �[�J�F�ʸ˪�private �M access Modifier��A�X�{The field Employee.empno is not visible
			//�ҥH�n�ק�g�k�A�o�̤]�[�J�ʸ˪�����
			//p.salary *= 1.1;		<--�ʸ˪�����
			p.setSalary(p.getSalary() * 1.1);
		}else if (e instanceof Temporary) {
			Temporary t = (Temporary)e;
			
			//chapt7.�ʸ�  �[�J�F�ʸ˪�private �M access Modifier��A�X�{The field Employee.empno is not visible
			//�ҥH�n�ק�g�k�A�o�̤]�[�J�ʸ˪�����
			//t.hourPay += 20;		<--�ʸ˪�����
			t.setHourPay(t.getHourPay()+20);
		}
	}
	
}