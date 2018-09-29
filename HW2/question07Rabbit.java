package hw2;
/*7.迴圏的練習-Rabbit
	老王養了一群兔子，若三隻三隻一數，剩餘一隻；若五隻五隻一數，剩餘三隻；若七隻七隻一數，剩餘二隻。試問兔子最少有幾隻。

 * 
 * */
public class question07Rabbit {

	public static void main(String[] args) {
		int count = 0;		//兔子計數器
		
		
		/*
		int j = 1;
		A:
		while(j > 0) {
			if (count % 7 == 2 && count % 5 ==2 && count % 3 == 1) {
				System.out.printf("%d", count);
				break A;
			}
			count++;
			j++;
		}
		*/
			
		
		A:
		for (int i =1; i> 0; i++) {
			count++;
			if (count % 7 == 2 && count % 5 ==2 && count % 3 == 1) {	//滿足若三隻三隻一數，剩餘一隻；若五隻五隻一數，剩餘三隻；若七隻七隻一數，剩餘二隻
																		//印出
				System.out.printf("%d", count);
				break A;
			}
			
		}
		
		
	}

}
