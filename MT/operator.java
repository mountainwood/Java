package com.iii.cb101.mt;

public class operator {

	public static void main(String[] args) {
		int sec = 3661;
		final int SEC_PER_MIN = 60;
		final int MIN_PER_HR = 60;
		System.out.printf("%d秒=%d分%d秒%n", sec, sec/60, sec%60);
		
		
		System.out.println(sec + "秒 =" 
		+ sec / MIN_PER_HR / SEC_PER_MIN + "時" 
		+ sec % MIN_PER_HR + "分" + sec % SEC_PER_MIN + "秒"	//錯
		);
		System.out.printf("%d秒=%d時%d分%d秒%n", 
				sec, sec / MIN_PER_HR / SEC_PER_MIN, sec % MIN_PER_HR, sec % SEC_PER_MIN);
		
		//單元運算子
		//int x = 3, y = 4, z;
		//z = ++x * y;
		//z = x++ * y;	//先 x=x+1, 再y=x*y
		//z = ++x * y;	//先z=x*y, 再x+1=x
		//z = (x++) * y;
		//z = x++ + y; 寫成下式較好
		//z = (X++)+7;
		
		//z = x + (++y);
		//System.out.println("x =" + x + ", " + "y =" + y + ", " + "z = " + z );
		
		//資料型態轉換type casting
		/*int m = 8;
		double n = 5.8;
		d = x;	//可
		x = d;	//不可需修改成下式
		n = (int)d;
		 */
		
		//簡易格式輸出

	}

}
