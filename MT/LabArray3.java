package com.iii.cb101.mt;

public class LabArray3 {

	public static void main(String[] args) {
		int sum = 0;
		int[][][] threeDim = {{{1,1,1},{2,2,2}},
								{{4,4,4},{5,5,5}},
									{{7,7,7},{8,8,8}}};
		for(int i = 0; i< threeDim.length; i++) {					//���h�ּh
			for(int j = 0; j< threeDim[i].length; j++) {			//�ĴX�h���h�֦C
				for (int k = 0; k< threeDim[i][j].length; k++) {	//�ĴX�h�ĴX�C���h�֦� 
					sum = sum + threeDim[i][j][k];
				}
			}
		}
		System.out.printf("%d", sum);
		
		/*�쥻�����~�g�k
		for(int i = 0; i< threeDim.length; i++) {					//���h�ּh
			for(int j = 0; j< threeDim[i].length; j++) {			//�ĴX�h���h�֦C
				for (int k = 0; k< threeDim[i][j].length; k++) {	//�ĴX�h�ĴX�C���h�֦� 
					sum = sum + threeDim[i][j][k];
				}
			}
		}
		System.out.printf("%d", sum);*/
		

	}

}
