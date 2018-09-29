import java.util.Calendar;
import java.util.Date;
public class CalendarDemo {

	public static void main(String[] args) {
		
		Calendar today = Calendar.getInstance();
		int year = today.get(Calendar.YEAR);
		int month = today.get(Calendar.MONTH) + 1;
		int day = today.get(Calendar.DATE);
		int day_of_week = today.get(Calendar.DAY_OF_WEEK);
		int hour = today.get(Calendar.HOUR_OF_DAY);
		int minute = today.get(Calendar.MINUTE);
		int second = today.get(Calendar.SECOND);
		System.out.println("今天是 " + year + "/" + month + "/" + day);
		System.out.println("今天是星期 " + (day_of_week - 1));
		System.out.println("時間是 " + hour + "：" + minute + "：" + second);
		
		//使用過期的 API 的話
		Date now = new Date();
		year = now.getYear();
		
		//LAB: 改善星期的顯示方式和時間輸出格式
		String[] days = {"日","一","二","三","四","五","六"};
		System.out.println("今天是星期" + days[(day_of_week - 1)]);
		
		//LAB:把時鐘的分跟秒的十位數補零
			//自已的寫法，運用JAVA API
		System.out.printf("時間是%d:%02d:%02d%n",hour, minute, second);
		
			//使用三元運算子
		System.out.println("時間是 " + hour + "："	+
				((minute < 10) ? "0" + minute : minute) + "：" +
					((second < 10) ? "0" + second :second));
	}

}
