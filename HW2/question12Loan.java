package hw2;
/*
 * 12.	迴圈敘述的練習-Loan
		錢不精以100000元分別向銀行、當鋪和地下錢莊借貸。若銀行的年利率為20%，
		當鋪月利率為10%和地下錢莊日利率為1%。以月為單位，計算一個月後至一年後每個月該歸還多少錢。
*/
public class question12Loan {

	public static void main(String[] args) {
		double p = 100000;					//本金
		double pp = 100000;
		double bankRate = 0.2;
		double pawnshopRate = 0.1;			//當鋪月利率
		double brokenRate = 0.01;			//地下錢莊日利率
		for(int i = 1; i <= 12; i++) {
			System.out.printf("%f = % f * ( 1 + 0.1)%n",p, p);
			p = p * ( 1 + pawnshopRate);
			System.out.printf("%s月，本利和為%f%n",i, p);
		}
		System.out.println("=============================================");
		for(int i = 1; i <= 365; i++) {
			pp = pp * ( 1 + brokenRate);
			if ( i % 30 == 0) {
				System.out.printf("%d月時，本利和為 %f%n",i/30 ,pp);
			}
			
		}

	}

}
