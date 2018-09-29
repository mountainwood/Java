package hw1;

public class question02Season {

	public static void main(String[] args) {
		/*2.	選擇性敘述的練習-Season
		輸入月份1~12月，利用switch判斷相對應的季節春、夏、秋、冬並印出。若不在此範圍則印出”輸入錯誤”。
		*/
		
		int season = 12;		//季節
		switch(season) {		//判定月份屬於的季節
			case 1: System.out.println("冬季");		//印出冬季
					break;
			case 2: System.out.println("冬季");
					break;
			case 3: System.out.println("春季");		//印出春季
					break;
			case 4: System.out.println("春季");
					break;
			case 5: System.out.println("春季");
					break;
			case 6: System.out.println("夏季");		//印出夏季
					break;	
			case 7: System.out.println("夏季");
					break;
			case 8: System.out.println("秋季");		//印出秋季
					break;
			case 9: System.out.println("秋季");
					break;
			case 10: System.out.println("秋季");
					break;
			case 11: System.out.println("秋季");
					break;
			case 12: System.out.println("冬季");		//印出冬季
					break;
			default:System.out.println("輸入錯誤。");		//輸入錯誤月份
		}

	}

}
