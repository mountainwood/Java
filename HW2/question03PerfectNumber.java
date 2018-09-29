package hw2;
	/*3.迴圏的練習-PerfectNumber
	一個數字若等於其所有因數的總和，則此數為perfect number。
	找出100以內所有的完美數。
	說明：6的因數為1, 2, 3，6=1+2+3，故6為完美數。
	
	 */
public class question03PerfectNumber {

	public static void main(String[] args) {
		int targetNumber = 100;		//目標數值
						//因數的加總
		System.out.printf("%d以內的完美數為：", targetNumber);
		for (int i = 1; i <= targetNumber; i++) {
			int sum = 0;						//每次迴圈都要等於0
			for (int j = 1; j <= i; j++) {		//找出該數的因數
				if (i % j == 0) {		//先找到因數，再算出因數的加總
					sum = sum + j;
					//System.out.println(sum);
				}
			}
			if ( i == sum - i) {			//因數的和減掉該數值後，等於原數值，則為完美數
				System.out.printf("#%d  ", i);
			}
			
		}
		



	}

}
