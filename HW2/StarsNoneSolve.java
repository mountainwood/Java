package hw2;
/*
 * 9.	迴圈敘述的練習-Stars
   畫出下列三種排列的星星圖形。

 		(1)	*         (2)   * * * * *    (3)    *
          	* *              * * * *          * * *
          	* * *              * * *         * * * * *  
          	* * * *              * *       * * * * * * *
          	* * * * *              *      * * * * * * * * *

 * */


public class StarsNoneSolve {
	static void methodspace(int spacenum, int floorstar){
		String space = " ";
		for(int n = 1; n <= floorstar-spacenum; n++) {
			System.out.printf("%s", space);
		}
	}
	static void methodstar(int starnum) {
		String starplus = "*";
			//for(int p = 1; p <= starnum+1 ;p++) {
				for(int pp = 1; pp <= 1 + 2*starnum; pp ++) {
					System.out.printf("%s", starplus);
				}
		//}
	}
	
	public static void main(String[] args) {

		int floor = 20;		//層數
		for(int m = 0; m <= floor ; m++) {
			methodspace(m, floor);		//呼叫左半空白
			methodstar(m);				//呼叫星星部分
			methodspace(m, floor);		//呼叫右半空白
			System.out.printf("%n");	//換行
		}
		/* 未解決
		String label = "*";	//欲印之圖形
		int count = 1;

		
		for(int i = 1; i <= 5; i++) {			//判定滿足換行條件
			System.out.println(label);
			System.out.printf("--%d--%n", i);
			
			if (count == i) {
				System.out.printf("%n");
				System.out.printf("==count%d==%n", count);
				count++;
				i = 1;
				if(count == 6){
					break;
				}

			}
		}
		*/
		
		
		
	}

}
