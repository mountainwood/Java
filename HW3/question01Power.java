package hw3;
/*1.��ƪ��m��-Power
�g�@���int power(int x, int n)�Ψӭp��x��n����C
�����Gpower(5,3)�Y�p��53�C
*/
import java.util.Scanner;
public class question01Power {
	static int power(int num, int n ) {
		int z = 0;
		if (n < 0) {	//0 ����
			System.out.println("����п�J�����");
		}else {
			if ( n == 0) {	//0����
				z = 1;
			}else {
				if ( n == 1) {		// 1 ����
					z = num;
				}else {
					z = num;
					for (int i = 1; i <= n-1; i++) {	//2 ����H�W
						z = z*num;
					}
					
				}				
			}
		}
		
		return z;
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("�п�J X �� Y ���誺 X");
		int x = scanner.nextInt();
		System.out.println("�п�J X �� Y ���誺 Y");
		int y = scanner.nextInt();
		scanner.close();
		//int x = 3, y = 4, 
		int result;
		result = power(x, y);
		System.out.printf("%d �� %d ����O %d", x, y, result);
		
	}

}
