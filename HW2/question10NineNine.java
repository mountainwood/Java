package hw2;
/*10.	迴圈敘述的練習-NineNine
   印出下列九九乘法表：

   		|	1	2	3	4	5	6	7	8	9
    -----------------------------------------------------------------
     9	|	9	18	27	36	45	54	63	72	81
     8	|	8	16	24	32	40	48	56	64
     7	|	7	14	21	28	35	42	49
     6	|	6	12	18	24	30	36
     5	|	5	10	15	20	25
     4	|	4	8	12	16
     3	|	3	6	9
     2	|	2	4
     1	| 	1

 * */
public class question10NineNine {

	public static void main(String[] args) {
		for(int i = 1; i <= 13; i++) {				//i <= 4 之前是列印「 |  」
			switch (i){
				case 1:System.out.printf(" ");
				break;
				case 2:System.out.printf(" ");
				break;
				
				case 3:System.out.printf("| ");
				break;

				case 4:System.out.printf(" ");
				break;
				default:
				System.out.printf("%s ", i-4);		//i == 5，開始列印 1, 2, 3, 4, ...., 9
					if(i-4 > 1) {
						System.out.printf(" ");		//i-4 > 2 之後，需補一個空格，才會對齊
					}
					if(i == 13) {
						System.out.printf("%n");	//i-4 == 13 ，也就是印出 9 之後，要換行
					}
			}
		}
		
		System.out.println("--------------------------------");
		
		int total = 0;		//每次乘積的值
		for(int i = 9; i > 0; i--) {				//前者
			System.out.printf("%s |  ", i);
			for(int j = 1; j <= i; j++) {			//後者，j 執行的次數視 i 而定
				total = i*j;						//乘積的值
				System.out.printf("%s ", total);	//印出乘積
				if( total < 10 && j > 1) {			//如果 < 10 ，多印一個空格，是為了對齊
					System.out.printf(" ");
				}
				if( j == i) {						//j 滿足換行條件就換行
					System.out.printf("%n");
				}
			}
		}

	}

}
