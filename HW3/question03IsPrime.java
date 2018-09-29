package hw3;
/*3.函數的練習-IsPrime
寫一函數boolean isPrime (int n)用來判斷n是否為質數。

 * */
import java.util.Scanner;
public class question03IsPrime {
	static boolean IsPrime (int n){
		int Pcount = 0;
		boolean boo = false;
		for(int i = 1; i <= n; i++) {
			if (n % i == 0 && n != 1) {		//循環迴圈，除數從 1 檢查至 n-1，該數值若只能被 1 整除(已排除自己)，且該數不等於 1，計數器就加 1 
				Pcount++;
			}
		}
		if ( Pcount == 2) {					//若只能被 1 整除，計數器就為 1 ，則可判斷為質數
			boo = true;
			
		}
		return boo ;
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("請輸入一個正整數");
		int n = scanner.nextInt();
		if ( n <= 0) {
			System.out.println("請輸入正整數");
		}else {
			if (IsPrime(n) == true) {
				System.out.printf("%d 是質數", n);
			}else {
				System.out.printf("%d 非質數", n);
			}
		}
		scanner.close();
		

	}

}
