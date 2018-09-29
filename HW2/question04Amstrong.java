package hw2;
/*
 * 4.迴圏的練習-Amstrong
		Amstrong數是指一個三位數的整數，其各位數之立方和等於該數本身。
		找出所有的Amstrong數。
		說明：153=13+53+33，故153為Amstrong數。
*/
public class question04Amstrong {

	public static void main(String[] args) {
		int AmstrongNumber = 100;	//尋找Amstrong數的初始條件
		int trippleSum = 0;			//該數值的三位數和
		System.out.print("Amstrong數為： ");
		while ( AmstrongNumber < 1000 ) {		//一個一個數值尋找
			trippleSum  = (AmstrongNumber/100) * (AmstrongNumber/100) * (AmstrongNumber/100) + 		//百位數的立方和
					((AmstrongNumber % 100) / 10) * ((AmstrongNumber % 100)/10) * ((AmstrongNumber % 100)/10) + 		//十位數的立方和
					(((AmstrongNumber % 100) % 10 ) /1) * (((AmstrongNumber % 100) % 10 ) /1) * (((AmstrongNumber % 100) % 10 ) /1);	//個位數的立方和
			if (trippleSum == AmstrongNumber) {					//判斷該數的立方和是否等於該數值，是的話，就是Amstrong數
				System.out.printf("%d  ", AmstrongNumber);
			}
			AmstrongNumber++;
		}

	}

}
