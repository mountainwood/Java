package hw1;

public class question03Salary {

	public static void main(String[] args) {
		/*3.	��ܩʱԭz���m��-Salary
				��J�K�Q�ө��uŪ�ͪ��u�@�ɼơA�íp����~��C
				60�p�ɥH���A���~120���C
				61~80�p�ɡA�H���~1.25���p��C
				81�p�ɥH�W�A�H���~1.5���p��C
				�����G�~��H�֭p�覡�p��C�Y�u�ɬ�90�p�ɡA�h�~�ꬰ60*120 + 20*120*1.25 + 10*120*1.5���C
		 */
		
		double hr = 81;					//�p�ɼ�
		double salary = 120;			//���~
		double eSalary60 = 1;			//60�p�ɤ����t��
		double eSalary6180 = 1.25;		//61��80�p�ɪ��t��
		double eSalary81 = 1.5;			//81�H�W���t��
		double sumSalary = 0;			//�~��
		
		if (hr <= 60) {		//60�p�ɤ�
			sumSalary = hr * eSalary60 * salary;
		}else {		//�ɼƬ� 61�H�W
			if(hr > 80) {		////�ɼƬ�81�H�W
				sumSalary = ((hr - 80) * eSalary81 + 20 * eSalary6180 + 60 * eSalary60) * salary;
			}else {
				sumSalary = ((hr - 60) * eSalary6180 + 60 * eSalary60) * salary;
			}
		}

			System.out.printf("�u�@%.2f�p�ɡA�~���`�p�G%.2f��", hr, sumSalary);
		

	}

}
