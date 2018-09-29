package hw61Employee;

public class EmployeeMain {

	public static void main(String[] args) {
		//Employee e = new Employee(111,"女", "Hani", "20180101", "0900000000", "Korea");		//測試用，印出一行員工只有employee的資料
		//e.setEmpno(111);
		//e.setName("Hani");
		//e.display();
		
		System.out.printf("%n=============分隔號==================%n");				//分隔號
		/*
		//Permanent p= new Permanent(112,"女", "Hani", 780000); 
		//p.display();
		*/
		
		//編號 0 開頭為一級主管，編號為 1 開頭為二級主管，編號 2 開頭為 一般員工
		Employee[]e1 = new Employee[5];			//建立員工資料矩陣
		e1[0] = new Permanent(211,"女", "Hani", "20180101","0900000000",  "Korea", 50000);		//第一位員工資料
		e1[1] = new Permanent(212,"女", "Wozniaki", "20180301", "0912000000", "UE", 78000);		//第二位員工資料，加入薪資
		//第三位員工資料，加入薪資、職務、午餐、交通加給
		e1[2] = new Compensation(002,"女", "kerber", "20180201", "0913000000", "UE", 78000, 5000, 1800, 2000);
		e1[3] = new Compensation(111,"女", "Elise", "20180120", "0914000000", "USA", 78000, 3000, 1800, 2000);
		e1[4] = new Overtime(113,"女", "Kerber", "20180125", "0916000000", "USA", 78000, 10);
		for(int i = 0; i < e1.length; i++) {
			e1[i].display();
			e1[0].raiseSalary(e1[i]);
			System.out.printf("| 總計薪資：%s", e1[i].paySalary());	
			System.out.printf("%n");
		}
		System.out.printf("===================================================%n");
		for (int i = 0; i < e1.length; i++) {		//列印本薪加加班津貼
			e1[0].raiseSalary(e1[i]);
			System.out.println(e1[i].paySalary());	
		}

		
	}
	
}