package hw4;
/*
 * 2.二維陣列的練習-Sales
	某一公司有五種產品A、B、C、D與E，其單價分別為12、16、10、14與15元；而該公司共有三位銷售員，他們在某月份的銷售數量如下所示
	a.	每一個銷售員的銷售總金額
	b.	每一項產品的銷售總金額
	c.	有最好業績（銷售總金額最多者）的銷售員
	d.	銷售總金額最多的產品

*/
public class Sales {

	public static void main(String[] args) {
		int[][] memberAndSpecies = new int[][]{{33, 32, 56, 45, 33},{77, 33, 68, 45, 23},{43, 55, 43, 67, 65}};
		//產品對銷售員的矩陣
		//row為每個銷售員對於各產品的銷售數量
		//col為各產品對於銷售員的銷售數量
		int[] price = new int[] {12, 16, 10, 14, 15};		//產品單價之矩陣
		int[][] sumSP = new int[3][5]; 		//產品矩陣 * 產品單價之新矩陣

		
		
		 
		for (int i = 0; i < memberAndSpecies.length; i++) {				//memberAndSpecies.length為列數
			for(int j = 0; j < memberAndSpecies[i].length; j++) {
				sumSP[i][j] = memberAndSpecies[i][j] * price[j];		//產品矩陣 * 產品單價之新矩陣
				System.out.printf("%d * %d = %d, ", memberAndSpecies[i][j], price[j], sumSP[i][j]);
			}
			System.out.printf("%n");
		}
		
		///////a.題目每一個銷售員的銷售總金額
		//以下為計算各銷售員的銷售總額
		for (int m = 0; m < sumSP.length; m++) {				//列數
			int memberSum = 0;
			for(int n = 0; n < sumSP[m].length; n++) {		
				memberSum = memberSum + sumSP[m][n];
				if(n == sumSP[m].length-1) {
					System.out.printf("%d之銷售總額為：%d%n", m+1, memberSum);	//各銷售員的銷售總金額
				}
			}
		}
		
		//////b.每一項產品的銷售總金額
		//應用sumSP矩陣，其為各項產品對應銷售員的銷售金額矩陣 3 x 5
		System.out.printf("%n");
		System.out.printf("b.每一項產品的銷售總金額%n");
		int[] totalSpecies15 = new int[15]; 
			for (int i = 0; i < sumSP.length; i++) {			//矩陣的row索引
				for(int j = 0; j < sumSP[i].length; j++) {		//矩陣的col索引
					switch (i) {
						case 0: totalSpecies15[j] = sumSP[i][j];				
								//第  1 row的元素放入totalSpecies15的 0~4 位置
							System.out.printf("%d %d%n", i, totalSpecies15[j]);
								break;
						case 1: totalSpecies15[j+5] = sumSP[i][j];
								//第  2 row的元素放入totalSpecies15的 5~9 位置
							System.out.printf("%d %d%n", i, totalSpecies15[j+5]);
							break;
						case 2: totalSpecies15[j+10] = sumSP[i][j];
								//第 3 row的元素放入totalSpecies15的 10~14 位置
							System.out.printf("%d %d%n", i, totalSpecies15[j+10]);
							break;
						default: System.out.println("error%n");
					}
				}
			}
		System.out.println("totalSpecies15的矩陣");			//列印totalSpecies15的矩陣 1x15
		for(int i = 0; i < totalSpecies15.length; i++) {
			System.out.printf("%d, ", totalSpecies15[i]);
		}
		System.out.printf("%n=========================================================================================%n");
		int[] totalSpecies5 = new int[5];					//建立各產品各自的銷售總金額的一維矩陣 1x5
		for(int i = 0; i < totalSpecies15.length; i++) {	//逐一循環矩陣	
				switch(i % 5) {				//銷售總金額的一維矩陣(1x15) 的索引值除以 5 的餘數來判別該把各自的金額加總至矩陣(1x5)
					case 0:
						totalSpecies5[i%5] = totalSpecies5[i%5] + totalSpecies15[i];	//餘數為 0，加至矩陣(1x5) [0]之位置
						break;
					case 1:
						totalSpecies5[i%5] = totalSpecies5[i%5] + totalSpecies15[i];	//餘數為 1 ，加至矩陣(1x5) [0]之位置
						break;
					case 2:
						totalSpecies5[i%5] = totalSpecies5[i%5] + totalSpecies15[i];	//餘數為 2 ，加至矩陣(1x5) [0]之位置
						break;
					case 3:
						totalSpecies5[i%5] = totalSpecies5[i%5] + totalSpecies15[i];	//餘數為 3 ，加至矩陣(1x5) [0]之位置
						break;
					case 4:
						totalSpecies5[i%5] = totalSpecies5[i%5] + totalSpecies15[i];	//餘數為 4 ，加至矩陣(1x5) [0]之位置
						break;
					default:
						System.out.printf("error%n");
				}
			}
		for(int i = 0; i < totalSpecies5.length; i++) {				//列印各個產品的銷售金額矩陣(1x5)
			System.out.printf("產品%d之金額%d, ",i+1 , totalSpecies5[i]);
		}
	System.out.println("");
	System.out.println("");
	System.out.println("c.有最好業績（銷售總金額最多者）的銷售員");
		//////////c.有最好業績（銷售總金額最多者）的銷售員
		int[] memberSumArray = new int[3];
		for (int m = 0; m < sumSP.length; m++) {				//列數
			for(int n = 0; n < sumSP[m].length; n++) {		
				switch(m) {
					case 0 :
						memberSumArray[0] = memberSumArray[0] + sumSP[m][n];
						break;
					case 1 :
						memberSumArray[1] = memberSumArray[1] + sumSP[m][n];
						break;
					case 2 :
						memberSumArray[2] = memberSumArray[2] + sumSP[m][n];
						break;
					default:System.out.printf("error%n");
				}
			}
		}
		for(int i = 0; i < memberSumArray.length; i++) {				//列印各個產品的銷售金額矩陣(1x5)
			System.out.printf("銷售員%d之銷售金額為%d%n",i+1 , memberSumArray[i]);
		}
		for(int i = 0;  i < memberSumArray.length; i++) {			//從陣列第一個元素開始，逐一和第二到最後一個元素比大小
			for(int j = 0 ; j < memberSumArray.length; j++) {		//和第二個元素比大小，代號 j
				if(memberSumArray[i] < memberSumArray[j]) {					//若第 i 個元素比第 j 個元素小，兩者互換
					int m = memberSumArray[i];						//令第 i 個元素為 m
					//System.out.println(memberSumArray[i]);		
					int n = memberSumArray[j];						//令第 j 個元素為 n
					//System.out.println(memberSumArray[j]);
					memberSumArray[i] = n;							//兩者位置互調
					memberSumArray[j] = m;
				}											//此迴圈可重新依小至大，排序陣列裡的元素
			}
			
		}
		for(int i = 0; i < memberSumArray.length; i++) {			//逐一輸出矩陣的元素
			System.out.println(memberSumArray[i]);
		}
		System.out.printf("最小是：%d，最大是：%d",memberSumArray[0], memberSumArray[memberSumArray.length-1]);		//輸出最小和最大的元素
		
		///////////d.	銷售總金額最多的產品
		System.out.println("");
		System.out.println("");
		System.out.println("d.銷售總金額最多的產品");
		
		for(int i = 0; i < totalSpecies5.length; i++) {				//列印各個產品的銷售金額矩陣(1x5)
			System.out.printf("產%d之銷售金額為%d%n",i+1 , totalSpecies5[i]);
		}
		for(int i = 0;  i < totalSpecies5.length; i++) {			//從陣列第一個元素開始，逐一和第二到最後一個元素比大小
			for(int j = 0 ; j < totalSpecies5.length; j++) {		//和第二個元素比大小，代號 j
				if(totalSpecies5[i] < totalSpecies5[j]) {					//若第 i 個元素比第 j 個元素小，兩者互換
					int m = totalSpecies5[i];						//令第 i 個元素為 m
					//System.out.println(memberSumArray[i]);		
					int n = totalSpecies5[j];						//令第 j 個元素為 n
					//System.out.println(memberSumArray[j]);
					totalSpecies5[i] = n;							//兩者位置互調
					totalSpecies5[j] = m;
				}											//此迴圈可重新依小至大，排序陣列裡的元素
			}
			
		}
		for(int i = 0; i < totalSpecies5.length; i++) {			//逐一輸出矩陣的元素
			System.out.println(totalSpecies5[i]);
		}
		System.out.printf("最小是：%d，最大是：%d",totalSpecies5[0], totalSpecies5[totalSpecies5.length-1]);	
	}
}
