package hw3;
/*5.函數的練習-MersennePrime
	寫一函數boolean mersennePrime (int n)用來判斷n是否為Mersenne質數。撰寫一程式找出前8個Mersenne質數。
	提示：若質數滿足2P-1=n (p為正整數)，則n為Mersenne Prime。
	說明：當p=3時，23-1=7，故7為Mersenne Prime。

 * */
/*
 * 4.函數的練習-Prime
	寫一函數int prime (int n)用來找出第n個質數。
*/
import java.util.Scanner;

public class question05MersennePrime {
	static boolean IsPrime (long n){
		int Pcount = 0;
		boolean boo = false;
		for(long i = 1; i <= n; i++) {		

			if (n % i == 0 && n != 1) {
				Pcount++;
			}
		}
		if ( Pcount == 2) {
			boo = true;
			
		}
		return boo ;
	}
/*	static int Prime(int n) {
		int PrimeCount = 0;					//第幾個質數的計數器
		for (int i = 2; i <= n; i++) {		//從 2 開始循環 i 檢查，找到質數就加 1 
			if (IsPrime(i) == true) {
				PrimeCount++;
			}
		}

		return PrimeCount;					//回傳計數值
	}*/
	static boolean MersennePrime(long n) {	//MersennePrime 檢查器
		long p1 = 1;
		long p;
		for (long i = 1; i <= n ; i++) {		//2的 n 次方之迴圈
			p1 = p1 * 2;		
			}
		p = p1 - 1;							//計算出 2^n - 1
		IsPrime (p);						//判斷是否為質數
		return IsPrime(p);					//回傳是否為MersennePrime
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("請輸入一個正整數");
		int n = scanner.nextInt();					//輸入目標值
/*		if ( n <= 0) {
			System.out.println("請輸入正整數");
		}else {
			if (IsPrime(n) == true) {
				System.out.printf("%d 是質數%n", n);						//是否為質數
				System.out.printf("%d 是第 %d 個質數%n", n, Prime(n));		//第幾個質數
			}else {
				System.out.printf("%d 非質數%n", n);						//非質數
			}
		}
		*/
		System.out.printf("2^%d 是否為mersennePrime：%b%n", n, MersennePrime(n));	//呼叫MersennePrime 檢查器
		
		
		System.out.println("想要找幾個MersennePrime？");
		int targetN = scanner.nextInt();		//輸入欲找的MersennePraime數目
		long MersenneNum = 0;
		for (long i = 1; i > 0; i++) {			//i 從 1 開始找MersennePrime
			if (MersennePrime(i) == true) {		//找到一個，計數器就加 1 
				MersenneNum++;
				System.out.printf("%d ",i);
			}
			if(MersenneNum == targetN) {		//如果梅森計數器 == 目標數目，則跳出迴圈
				
				break;
			}
		}
		scanner.close();				///*************目前只能找到 7 個，還不知道為何找不到第 8 個，修正成long之後
										///原本不能找到，後來突然又能找到了
	}
}
