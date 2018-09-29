package hw2;

public class question02Factor {

	public static void main(String[] args) {
		/*2.	迴圏的練習-Factor
		輸入一正整數，求其所有的因數。
		說明：36的因數為1, 2, 3, 4, 6, 9, 12, 18, 36。
		*/
		int targetNumber = 36;		//目標數值
		System.out.printf("%d的因數為", targetNumber);
		for (int i = 1; i <= targetNumber; i++) {
			if (targetNumber % i == 0) {
				System.out.printf("%d  ", i);
			}
		}

	}

}
