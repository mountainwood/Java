import java.io.*;
public class ConsoleIODemo {
	public static void main(String[] args) {
		String str;
		InputStreamReader isr = new InputStreamReader(System.in);		////isr 為過渡變數，所以直接合併至 in 裡，在demo2
		BufferedReader in = new BufferedReader(isr);
		try {
			while(!(str = in.readLine()).equals("")) {
				System.out.println(str);
			}
			in.close();
			isr.close();
		}catch(IOException e){ e.printStackTrace();}
	}
}
