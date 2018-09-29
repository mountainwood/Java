import java.io.*;
public class LabFileDemo2 {

	public static void main(String[] args) {
		File file = new File(args[0]);
		if(!file.isDirectory()) {
			System.err.println("Not a directory");
			System.exit(0);
		}
		StringBuilder sb = new StringBuilder(256);
		File[] contents = file.listFiles();
		
		//解三，使用for each
		for(File f : contents) {
			sb.append((f.isDirectory()) ? "Dir：" : "File：");
			sb.append(f.getName()).append("\n");
		}
		
		//解二，使用for 和 三元運算子
		/*
		for(int i = 0; i < contents.length; i++) {
			sb.append((contents[i].isDirectory()) ? "Dir：" : "File：");
			sb.append(contents[i].getName()).append("\n");
		}
		*/
		
		/* 解一
		for(int i = 0; i < contents.length; i++) {
			if(contents [i].isDirectory()) {
				sb.append("Dir: ");
			}else {
				sb.append("File： ");
			}
			sb.append(contents[i].getName()).append("\n");
		}
		*/
		System.out.print(sb);
	}

}
