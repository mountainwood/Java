
public class EmployeeMain {

//將Employee的main獨立出來	
	
	public static void main(String[] args) {
		//System.out.println("beginning...");
/*不同的測試方法，為了測試程式
 * 		Employee e1 = new Employee();			//公司來了一個員工，e1建檔	<---step.3 此地方java不再幫忙建立建構子，需自己增加
		//自我筆記
		//建立了一個 e1 的地址，並且蓋(new)了一個 Employee() 的 memory 空間指定地址給 e1
		//接下來使用 Employee 這個方法一個一個輸入各項 (int empno String name) 資料
		
		//e1.empno = 111;		<-chapt7.封裝		
			//chapt7.封裝  加入了封裝的private 和 access Modifier後，出現The field Employee.empno is not visible
			//所以要修改寫法，這裡也加入封裝的概念
		//e1.name = "Tom";	 	<-chapt7.封裝
//		e1.setEmpno(111);
//		e1.setName("Tom");
//		e1.display();
		
	//	//Employee e2 = new Employee(222, "Mary");			//公司來了一個員工，e1建檔	step.1
	//	//e2.display();
*
*/		
		Permanent p = new Permanent();
		
		//e1.empno = 111;		<-chapt7.封裝		
		//chapt7.封裝  加入了封裝的private 和 access Modifier後，出現The field Employee.empno is not visible
		//所以要修改寫法，這裡也加入封裝的概念
		//p.empno = 333;
		//p.name = "Stephen";
		
		p.setEmpno(333);
		p.setName("Stephen");
		
		//p.salary = 45000;		<--- 封裝的概念
		p.setSalary(45000);
		p.display();
		
		Permanent p1 = new Permanent(444, "Jean", 38000);	//使用了需要建構子的方法
		p1.display();
		System.out.println("ending...");
		
		Sales s = new Sales(666, "Tina", 20000, 29000);
		s.display();
		

		//多型章節新增
		Employee[] e = new Employee[3];
		e[0] = new Permanent(444, "Jean", 38000);
		e[1] = new Temporary(555, "John", 150, 80);
		e[2] = new Sales(666, "Tina", 20000, 29000);
		for(int i = 0; i < e.length; i++) {
			System.out.println(e[i].paySalary());	
			//甲-error:The method paySalary() is undefined for the type Employee
			//解法，去Employee新增
		}
		System.out.println("=============加薪程式加薪成果=================");
		//對應利用多型所寫的加薪程式(對應Employee)
		for (int i = 0; i < e.length; i++) {
			e[0].raiseSalary(e[i]);
		}
		for(int i = 0; i < e.length; i++) {
			System.out.println(e[i].paySalary());	
		}
	
		//System.out.println("employee count = " + p.empCount);		
							//pp.130 - The static field Employee.empCount should be accessed in a static way
		//System.out.println("employee count = " + Employee.empCount);
							//因為EmpCount 不可被跨類別使用，所以需宣告為 private，所以必須使用set get的封裝概念
		System.out.println("employee count = " + Employee.getEmpCount());
	}

}
