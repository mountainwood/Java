package hw3;
/*
 * 4.函數的練習-Prime
	寫一函數int prime (int n)用來找出第n個質數。
*/
import java.util.Scanner;

public class question04Prime {
	static boolean IsPrime (int n){
		int Pcount = 0;
		boolean boo = false;
		for(int i = 1; i <= n; i++) {
			if (n % i == 0 && n != 1) {
				Pcount++;
			}
		}
		if ( Pcount == 2) {
			boo = true;
			
		}
		return boo ;
	}
	static int Prime(int n) {
		int PrimeCount = 0;					//第幾個質數的計數器
		for (int i = 2; i <= n; i++) {		//從 2 開始循環 i 檢查，找到質數就加 1 
			if (IsPrime(i) == true) {
				PrimeCount++;
			}
		}

		return PrimeCount;					//回傳計數值
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("請輸入一個正整數");
		int n = scanner.nextInt();					//輸入目標值
		if ( n <= 0) {
			System.out.println("請輸入正整數");
		}else {
			if (IsPrime(n) == true) {
				System.out.printf("%d 是質數%n", n);						//是否為質數
				System.out.printf("%d 是第 %d 個質數", n, Prime(n));		//第幾個質數
			}else {
				System.out.printf("%d 非質數%n", n);						//非質數
			}
		}
		
		scanner.close();
		
		//下為測試式，把IsPrime(xxx)裡應為 i，我設成n，所以從頭都尾都用固定數值測試
		/*錯誤結果
		 *  n:7
			i:2
			PrimeCount:1
			======
			n:7
			i:3
			PrimeCount:2
			======
			n:7
			i:4
			PrimeCount:3
			======
			n:7
			i:5
			PrimeCount:4
			======
			n:7
			i:6
			PrimeCount:5
			======
			n:7
			i:7
			PrimeCount:6
			======
			第6個質數*/
		
		/*正確結果
		 n:7
		i:2
		PrimeCount:1
		======
		n:7
		i:3
		PrimeCount:2
		======
		n:7
		i:5
		PrimeCount:3
		======
		n:7
		i:7
		PrimeCount:4
		======
		第4個質數
		 **/
		/**
		int n = 7;
		int PrimeCount = 0;
		for (int i = 2; i <= n; i++) {
			if (IsPrime(i) == true) {
				PrimeCount++;
				System.out.printf("n:%d%ni:%d%nPrimeCount:%d%n======%n", n, i, PrimeCount);
			}
		}
		System.out.printf("第%d個質數",PrimeCount++);
		**/

	}

}
