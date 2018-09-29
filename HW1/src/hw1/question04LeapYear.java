package hw1;

public class question04LeapYear {

	public static void main(String[] args) {
		/*4.選擇性敘述的練習-LeapYear
			輸入一西元年，如2015。判斷此年份是否為閏年。
			提示：每四年一閏，每百年不閏，每四百年一閏，每四千年不閏。

		 */
		
		int LeapYear = 8100;		//年份
		if(LeapYear % 4000 == 0) {		//Year為4000的倍數-不閏
			System.out.println("不是潤年");
		}else {
			if (LeapYear % 400 == 0) {	//Year為400的倍數-是潤年
				System.out.println("是潤年");
			}else {
				if (LeapYear % 100 ==0) {		//Year為100的位數-不是潤年
					System.out.println("不是潤年");
				}else {
					if (LeapYear % 4 == 0){		//Year為4的倍數-是潤年
						System.out.println("是潤年");
					}else {
						System.out.println("不是潤年");	//Year非4的倍數-不是潤年
					}
					
				}
			}
		}

	}

}
