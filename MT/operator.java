package com.iii.cb101.mt;

public class operator {

	public static void main(String[] args) {
		int sec = 3661;
		final int SEC_PER_MIN = 60;
		final int MIN_PER_HR = 60;
		System.out.printf("%d��=%d��%d��%n", sec, sec/60, sec%60);
		
		
		System.out.println(sec + "�� =" 
		+ sec / MIN_PER_HR / SEC_PER_MIN + "��" 
		+ sec % MIN_PER_HR + "��" + sec % SEC_PER_MIN + "��"	//��
		);
		System.out.printf("%d��=%d��%d��%d��%n", 
				sec, sec / MIN_PER_HR / SEC_PER_MIN, sec % MIN_PER_HR, sec % SEC_PER_MIN);
		
		//�椸�B��l
		//int x = 3, y = 4, z;
		//z = ++x * y;
		//z = x++ * y;	//�� x=x+1, �Ay=x*y
		//z = ++x * y;	//��z=x*y, �Ax+1=x
		//z = (x++) * y;
		//z = x++ + y; �g���U�����n
		//z = (X++)+7;
		
		//z = x + (++y);
		//System.out.println("x =" + x + ", " + "y =" + y + ", " + "z = " + z );
		
		//��ƫ��A�ഫtype casting
		/*int m = 8;
		double n = 5.8;
		d = x;	//�i
		x = d;	//���i�ݭק令�U��
		n = (int)d;
		 */
		
		//²���榡��X

	}

}