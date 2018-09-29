import java.io.*;
public class CopyFile {

	public static void main(String[] args) {
		File inFile = new File(args[0]);
		//String inFile = args[0];	更簡單的寫法
		File outFile = new File(args[1]);
		//String outFile = args[1];		更簡單的寫法
		
		//兩個命令列引數間以空白間隔
		
		try {
			BufferedReader in = new BufferedReader(new FileReader(inFile));
			PrintWriter out = new PrintWriter(new FileWriter(outFile));
			StringBuilder sb = new StringBuilder(256);
			String str;
			while((str = in.readLine()) != null) {
				sb.append(str).append("\n");
			}
			System.out.print(sb);
			in.close();
			out.close();
		}catch(IOException e) {e.printStackTrace();}
		
		

	}

}
