package hw61Employee;

public class EmployeeMain {

	public static void main(String[] args) {
		//Employee e = new Employee(111,"�k", "Hani", "20180101", "0900000000", "Korea");		//���եΡA�L�X�@����u�u��employee�����
		//e.setEmpno(111);
		//e.setName("Hani");
		//e.display();
		
		System.out.printf("%n=============���j��==================%n");				//���j��
		/*
		//Permanent p= new Permanent(112,"�k", "Hani", 780000); 
		//p.display();
		*/
		
		//�s�� 0 �}�Y���@�ťD�ޡA�s���� 1 �}�Y���G�ťD�ޡA�s�� 2 �}�Y�� �@����u
		Employee[]e1 = new Employee[5];			//�إ߭��u��Ưx�}
		e1[0] = new Permanent(211,"�k", "Hani", "20180101","0900000000",  "Korea", 50000);		//�Ĥ@����u���
		e1[1] = new Permanent(212,"�k", "Wozniaki", "20180301", "0912000000", "UE", 78000);		//�ĤG����u��ơA�[�J�~��
		//�ĤT����u��ơA�[�J�~��B¾�ȡB���\�B��q�[��
		e1[2] = new Compensation(002,"�k", "kerber", "20180201", "0913000000", "UE", 78000, 5000, 1800, 2000);
		e1[3] = new Compensation(111,"�k", "Elise", "20180120", "0914000000", "USA", 78000, 3000, 1800, 2000);
		e1[4] = new Overtime(113,"�k", "Kerber", "20180125", "0916000000", "USA", 78000, 10);
		for(int i = 0; i < e1.length; i++) {
			e1[i].display();
			e1[0].raiseSalary(e1[i]);
			System.out.printf("| �`�p�~��G%s", e1[i].paySalary());	
			System.out.printf("%n");
		}
		System.out.printf("===================================================%n");
		for (int i = 0; i < e1.length; i++) {		//�C�L���~�[�[�Z�z�K
			e1[0].raiseSalary(e1[i]);
			System.out.println(e1[i].paySalary());	
		}

		
	}
	
}