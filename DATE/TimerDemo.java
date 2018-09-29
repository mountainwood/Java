import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;
public class TimerDemo {

	public static void main(String[] args) {
		Calendar cal = new GregorianCalendar(1985, Calendar.APRIL, 8);
		Date myDate = cal.getTime();
		int c_year = cal.get(Calendar.YEAR) - 1911;
		DateFormat df1 = DateFormat.getDateInstance();
		SimpleDateFormat df2 = new SimpleDateFormat("yyyy/MM/dd");
		SimpleDateFormat df3 = new SimpleDateFormat("�~M��d��");
		System.out.println(df1.format(myDate));
		System.out.println(df2.format(myDate));
		System.out.println(c_year + df3.format(myDate));
		
		//�{�b�ɶ��Z���ȩ]���@���
		Calendar today = Calendar.getInstance();
		int year = today.get(Calendar.YEAR);
		int month = today.get(Calendar.MONTH);
		int day = today.get(Calendar.DATE);
		long end = new GregorianCalendar(year, month, day+1).getTimeInMillis();		//�p����o�S�w�ɶ����@���
		long now = System.currentTimeMillis();
		System.out.println(end - now);
	}

}
