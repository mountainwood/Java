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
		
		//�ѤT�A�ϥ�for each
		for(File f : contents) {
			sb.append((f.isDirectory()) ? "Dir�G" : "File�G");
			sb.append(f.getName()).append("\n");
		}
		
		//�ѤG�A�ϥ�for �M �T���B��l
		/*
		for(int i = 0; i < contents.length; i++) {
			sb.append((contents[i].isDirectory()) ? "Dir�G" : "File�G");
			sb.append(contents[i].getName()).append("\n");
		}
		*/
		
		/* �Ѥ@
		for(int i = 0; i < contents.length; i++) {
			if(contents [i].isDirectory()) {
				sb.append("Dir: ");
			}else {
				sb.append("File�G ");
			}
			sb.append(contents[i].getName()).append("\n");
		}
		*/
		System.out.print(sb);
	}

}
