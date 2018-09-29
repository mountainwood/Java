package hw1;

public class question06Equation {

	public static void main(String[] args) {
		/*6.擇性敘述的練習-Equation
			一元二次方程式ax^2+bx+c=0。輸入a, b, c三值，並計算方程式的根。
			b2-4ac > 0，有兩個不相等的實根。
			b2-4ac = 0，有兩個相等的實根。
			b2-4ac < 0，則印出”沒有實根”。
		*/
		
		/* double result = 0;
		 
		int x = 2;
		int y = 5;
		 
		 平方
		result = java.lang.Math.pow(x, y);
		System.out.println(result); --------> 32.0
		 
		// 開根號
		result = java.lang.Math.sqrt((double)x);
		System.out.println(result);---------> 1.4142135623730951
		*/
		
		double a = 1;
		double b = -4;
		double c = 4;
		double xEqual = 0;
		double x1 = 0;
		double x2 = 0;
		
		
		if ((java.lang.Math.pow(b,2) - 4*a*c) < 0) {		//判斷b^2-4ac是否 < 0`
			System.out.println("沒有實根");		//b^2-4ac < 0 ==> 沒有實根
		}else {		//b^2-4ac，1.等於0，2.大於0
			if ((java.lang.Math.pow(b, 2) - 4 *a * c) == 0) {	//b^2-4ac 是否等於0
				xEqual = (-b) / (2 * a);
				System.out.printf("%8s，兩相等實根為 %.2f%n","有兩個相等的實根", xEqual);	//1. b^2-4ac == 0，有兩個相等實根
			}else {			//2. b^2-4ac > 0，有兩個不相等的實根
				x1 = ((-b) + java.lang.Math.sqrt(java.lang.Math.pow(b, 2) - 4 * a *c)) / (2 * a);
				//若資料型態使用int，則無法使用java.lang.Math.sqrt函數
				x2 = ((-b) - java.lang.Math.sqrt(java.lang.Math.pow(b, 2) - 4 * a *c)) / (2 * a);
				System.out.printf("%13s%f%s%f%n","有兩個不相等的實根，分別為", x1, "和", x2);
				System.out.println("分數型式為：");
				System.out.printf("%s%.0f%2s%.0f%7s%s%s%.0f%n", "(", -b, "+(", java.lang.Math.pow(b, 2) - 4 * a * c, ")^(1/2)",")", "/",  2 * a);
				System.out.printf("%s%.0f%2s%.0f%7s%s%s%.0f%n", "(", -b, "-(", java.lang.Math.pow(b, 2) - 4 * a * c, ")^(1/2)",")",  "/", 2 * a);
			}
		}

	}

}
