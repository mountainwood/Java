import java.io.*;
public class FileDemo {

	public static void main(String[] args) {
		File file = new File(args[0]);
		if(!file.isDirectory()) {
			System.err.println("Not a directory");
			System.exit(0);
		}
		StringBuilder sb = new StringBuilder(256);
		String[] contents = file.list();
		for(int i = 0; i < contents.length; i++) {
			sb.append(contents[i]).append("\n");
		}
		System.out.print(sb);
	}

}

//相對路徑：res\text.txt

//絕對路徑：E:\Java\workspace\IO\LabFileDemo2.java
