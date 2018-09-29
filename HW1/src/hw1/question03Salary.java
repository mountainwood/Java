package hw1;

public class question03Salary {

	public static void main(String[] args) {
		/*3.	選擇性敘述的練習-Salary
				輸入便利商店工讀生的工作時數，並計算其薪資。
				60小時以內，時薪120元。
				61~80小時，以時薪1.25倍計算。
				81小時以上，以時薪1.5倍計算。
				說明：薪資以累計方式計算。若工時為90小時，則薪資為60*120 + 20*120*1.25 + 10*120*1.5元。
		 */
		
		double hr = 81;					//小時數
		double salary = 120;			//時薪
		double eSalary60 = 1;			//60小時內的系數
		double eSalary6180 = 1.25;		//61至80小時的系數
		double eSalary81 = 1.5;			//81以上的系數
		double sumSalary = 0;			//薪資
		
		if (hr <= 60) {		//60小時內
			sumSalary = hr * eSalary60 * salary;
		}else {		//時數為 61以上
			if(hr > 80) {		////時數為81以上
				sumSalary = ((hr - 80) * eSalary81 + 20 * eSalary6180 + 60 * eSalary60) * salary;
			}else {
				sumSalary = ((hr - 60) * eSalary6180 + 60 * eSalary60) * salary;
			}
		}

			System.out.printf("工作%.2f小時，薪水總計：%.2f元", hr, sumSalary);
		

	}

}
