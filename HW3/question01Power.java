package hw3;
/*1.函數的練習-Power
寫一函數int power(int x, int n)用來計算x的n次方。
說明：power(5,3)即計算53。
*/
import java.util.Scanner;
public class question01Power {
	static int power(int num, int n ) {
		int z = 0;
		if (n < 0) {	//0 次方
			System.out.println("次方請輸入正整數");
		}else {
			if ( n == 0) {	//0次方
				z = 1;
			}else {
				if ( n == 1) {		// 1 次方
					z = num;
				}else {
					z = num;
					for (int i = 1; i <= n-1; i++) {	//2 次方以上
						z = z*num;
					}
					
				}				
			}
		}
		
		return z;
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("請輸入 X 的 Y 次方的 X");
		int x = scanner.nextInt();
		System.out.println("請輸入 X 的 Y 次方的 Y");
		int y = scanner.nextInt();
		scanner.close();
		//int x = 3, y = 4, 
		int result;
		result = power(x, y);
		System.out.printf("%d 的 %d 次方是 %d", x, y, result);
		
	}

}
