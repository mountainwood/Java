
public class Greeting {

	public static void main(String[] args) {
		String[] greetings = {"Hello", "Hi!", "Good"};
		try {
			for(int i = 0; i <4 ;i++) {
				System.out.println(greetings[i]);
				/*出現以下結果與錯誤exception
				 * Hello
					Hi!
					Good
					Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 3
						at Greeting.main(Greeting.java:8)
				 * */
			}
		}catch(ArrayIndexOutOfBoundsException e){		//上式丟了java.lang.ArrayIndexOutOfBoundsException訊息
														//給此 catch 接住，並print下式
			System.out.println("Array out of range");
		}catch(Exception e) {			//為所有Exception的父親，若是前面所有exception都接不到error，就會執行此式
			System.out.println("Exception happend!");
		}
		
	}

}
