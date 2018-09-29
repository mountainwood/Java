package hw2;
/*8.迴圏的練習-Password
出現”請輸入密碼”的提示，使用者有最多三次輸入的機會。
若輸入正確，則印出”密碼輸入正確，歡迎使用本系統！”。
若輸入不正確，再次出現”請輸入密碼”的提示。
若三次輸入不正確，則印出”密碼輸入超過三次！”，並結束程式的執行。
*/
import java.util.Scanner;
public class question08Password {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);	//建立鍵盤可輸入的記憶體空間
		//System.out.println("輸入密碼");
		//String inputPassword = scanner.next();
		
		//String inputPassword = "111";	//輸入的密碼
		String Password = "password";		//正確密碼
		int errornumber = 5;				//錯誤極限數值，此為 4 次
		int i = 1;					//起始 i 為 1 的話，極限數值需多加 1 。 
		do {			//判斷密碼正確與否
			
			System.out.println("輸入密碼");				//鍵盤輸入密碼
			String inputPassword = scanner.next();
			
			
			if (inputPassword.equals(Password)) {		//輸入密碼正確與否的判斷
				System.out.println("密碼正確，歡迎光臨");
				System.out.printf("正確時的計數器：%d%n",i);
				break;		//正確則將程式終止
			}else {
				System.out.printf("密碼錯誤 %d 次，請再輸入", i);			//錯誤
				System.out.printf("失敗時的計數器：%d%n", i);	//計數器
			}
			i++;		//時，計數器 + 1
			System.out.printf("(while迴圈加 1，i++後，i 為 %d )%n", i);
		}while(i < errornumber);
		
		if (i == errornumber) {		//輸入錯誤超過 3 次
			System.out.printf("錯誤超過%d次，下次再來", errornumber-2);
		}
	scanner.close();
	}

}
