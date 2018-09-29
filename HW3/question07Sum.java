package hw3;

import java.util.Scanner;

/*7.遞迴函數的練習-Sum
	寫一遞迴函數int sum (int n)用來計算2+4+6…+2n的值。
	ANSWER:
		S(1) → 1*2=2
		S(2) → 2*2 + S(1)
		  			  →1*2
		S(3) → 3*2 + S(2)
					  → 2*2 + S(1)
*/
public class question07Sum {
	
	static int sum(int n) {
		if( n == 1) {
			return 2 * n;
		}else {
			return 2*n + sum( n -1);
		}
		
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("請輸入一個正整數");
		int n = scanner.nextInt();
		
		System.out.printf("sum = %d", sum(n));
		scanner.close();
	}

}
