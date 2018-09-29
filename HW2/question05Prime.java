package hw2;
/*5.迴圈的練習-Prime
	輸入一正整數，找出所有小於或等於的質數。
	質數的定義為，其因數為本身和 1 
*/
import java.util.Scanner;
public class question05Prime {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("請輸入一正整數");
		int number = scanner.nextInt();
		scanner.close();
		//int number = 7;		//目標範圍
		int number0 = 0;	//標記非質數
		int number1 = 0;	//標記質數
		System.out.printf("%d內的質數有：", number);
		for (int j = 2; j <= number ; j++) {			//循環至目標number的迴圈
			number0 = 0;		//非質數的標記歸0
			number1 = 0;		//非質數的標記歸0
			for (int i = 2; i < j ; i++) {				//判斷和尋找除了1和本身之外的因數

				if (j % i == 0) {						//有因數則為非質數，非質數標記器標記為 1 
					number0 = 1;
					break;								//返回上方重新判斷，不使用時，例：若要
														//.找6的質數，會連4這種不能整除的非質數因數都抓出來
				}else {				//無因數則質數標記器標記為 1
					number1 = 1;
				}

			}
			if (number1 == 1) {
				System.out.printf("%d ", j);			//滿足質數，則印出
			}
		}

	}

}
