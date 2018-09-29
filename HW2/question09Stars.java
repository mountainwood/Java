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
public class question09Stars {
	static void methodspace(int spacenum, int floorstar){		//輸入畫每一層時，需要的空白數目以及總層數
		String space = " ";
		for(int n = 1; n <= floorstar-spacenum; n++) {
			System.out.printf("%s", space);
		}
	}
	static void methodstar(int starnum) {						//輸入星星的數目
		String starplus = "*";

			for(int pp = 1; pp <= 1 + 2*starnum; pp ++) {
				System.out.printf("%s", starplus);
			}

	}
	public static void main(String[] args) {
		String star1 = " * * * * *";							//空白加星星
		for(int i = star1.length(); i >= 0; i = i-2) {			//從位置10開始往回印，每次印一個空白加一個星星
			System.out.printf("%s%n", star1.substring(0,i));
		}
		System.out.println("=========================================");
		
		String star2 = "* * * * * ";
		for(int j =0; j <= star2.length(); j = j+2) {			//星星加空白
			System.out.printf("%s%n", star2.substring(0,j));	//從位置 0 開始往回印，每次印一個星星加一個空白
		}
		
		System.out.println("=========================================");
		
		int floor = 3;		//層數
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
