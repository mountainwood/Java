
public class EmployeeMain {

//�NEmployee��main�W�ߥX��	
	
	public static void main(String[] args) {
		//System.out.println("beginning...");
/*���P�����դ�k�A���F���յ{��
 * 		Employee e1 = new Employee();			//���q�ӤF�@�ӭ��u�Ae1����	<---step.3 ���a��java���A�����إ߫غc�l�A�ݦۤv�W�[
		//�ۧڵ��O
		//�إߤF�@�� e1 ���a�}�A�åB�\(new)�F�@�� Employee() �� memory �Ŷ����w�a�}�� e1
		//���U�Өϥ� Employee �o�Ӥ�k�@�Ӥ@�ӿ�J�U�� (int empno String name) ���
		
		//e1.empno = 111;		<-chapt7.�ʸ�		
			//chapt7.�ʸ�  �[�J�F�ʸ˪�private �M access Modifier��A�X�{The field Employee.empno is not visible
			//�ҥH�n�ק�g�k�A�o�̤]�[�J�ʸ˪�����
		//e1.name = "Tom";	 	<-chapt7.�ʸ�
//		e1.setEmpno(111);
//		e1.setName("Tom");
//		e1.display();
		
	//	//Employee e2 = new Employee(222, "Mary");			//���q�ӤF�@�ӭ��u�Ae1����	step.1
	//	//e2.display();
*
*/		
		Permanent p = new Permanent();
		
		//e1.empno = 111;		<-chapt7.�ʸ�		
		//chapt7.�ʸ�  �[�J�F�ʸ˪�private �M access Modifier��A�X�{The field Employee.empno is not visible
		//�ҥH�n�ק�g�k�A�o�̤]�[�J�ʸ˪�����
		//p.empno = 333;
		//p.name = "Stephen";
		
		p.setEmpno(333);
		p.setName("Stephen");
		
		//p.salary = 45000;		<--- �ʸ˪�����
		p.setSalary(45000);
		p.display();
		
		Permanent p1 = new Permanent(444, "Jean", 38000);	//�ϥΤF�ݭn�غc�l����k
		p1.display();
		System.out.println("ending...");
		
		Sales s = new Sales(666, "Tina", 20000, 29000);
		s.display();
		

		//�h�����`�s�W
		Employee[] e = new Employee[3];
		e[0] = new Permanent(444, "Jean", 38000);
		e[1] = new Temporary(555, "John", 150, 80);
		e[2] = new Sales(666, "Tina", 20000, 29000);
		for(int i = 0; i < e.length; i++) {
			System.out.println(e[i].paySalary());	
			//��-error:The method paySalary() is undefined for the type Employee
			//�Ѫk�A�hEmployee�s�W
		}
		System.out.println("=============�[�~�{���[�~���G=================");
		//�����Q�Φh���Ҽg���[�~�{��(����Employee)
		for (int i = 0; i < e.length; i++) {
			e[0].raiseSalary(e[i]);
		}
		for(int i = 0; i < e.length; i++) {
			System.out.println(e[i].paySalary());	
		}
	
		//System.out.println("employee count = " + p.empCount);		
							//pp.130 - The static field Employee.empCount should be accessed in a static way
		//System.out.println("employee count = " + Employee.empCount);
							//�]��EmpCount ���i�Q�����O�ϥΡA�ҥH�ݫŧi�� private�A�ҥH�����ϥ�set get���ʸ˷���
		System.out.println("employee count = " + Employee.getEmpCount());
	}

}
