package com.iii.cb101.mt;

public class LabArray3 {

	public static void main(String[] args) {
		int sum = 0;
		int[][][] threeDim = {{{1,1,1},{2,2,2}},
								{{4,4,4},{5,5,5}},
									{{7,7,7},{8,8,8}}};
		for(int i = 0; i< threeDim.length; i++) {					//有多少層
			for(int j = 0; j< threeDim[i].length; j++) {			//第幾層有多少列
				for (int k = 0; k< threeDim[i][j].length; k++) {	//第幾層第幾列有多少行 
					sum = sum + threeDim[i][j][k];
				}
			}
		}
		System.out.printf("%d", sum);
		
		/*原本的錯誤寫法
		for(int i = 0; i< threeDim.length; i++) {					//有多少層
			for(int j = 0; j< threeDim[i].length; j++) {			//第幾層有多少列
				for (int k = 0; k< threeDim[i][j].length; k++) {	//第幾層第幾列有多少行 
					sum = sum + threeDim[i][j][k];
				}
			}
		}
		System.out.printf("%d", sum);*/
		

	}

}
