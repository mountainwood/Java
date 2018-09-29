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
		System.out.println("���ѬO " + year + "/" + month + "/" + day);
		System.out.println("���ѬO�P�� " + (day_of_week - 1));
		System.out.println("�ɶ��O " + hour + "�G" + minute + "�G" + second);
		
		//�ϥιL���� API ����
		Date now = new Date();
		year = now.getYear();
		
		//LAB: �ﵽ�P������ܤ覡�M�ɶ���X�榡
		String[] days = {"��","�@","�G","�T","�|","��","��"};
		System.out.println("���ѬO�P��" + days[(day_of_week - 1)]);
		
		//LAB:�������������Q��Ƹɹs
			//�ۤw���g�k�A�B��JAVA API
		System.out.printf("�ɶ��O%d:%02d:%02d%n",hour, minute, second);
		
			//�ϥΤT���B��l
		System.out.println("�ɶ��O " + hour + "�G"	+
				((minute < 10) ? "0" + minute : minute) + "�G" +
					((second < 10) ? "0" + second :second));
	}

}
