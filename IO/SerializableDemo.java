import java.io.*;
public class SerializableDemo implements Serializable{
	private static final long serialVersionUID = 1L;
	String s;
	int n;
	public SerializableDemo(String s, int n) {this.s = s; this.n= n;}
	public static void main(String[] args) {
		try {
			SerializableDemo st = new SerializableDemo("Goodluck", 3);
			System.out.println("s = " + st.s + ", n = " + st.n);
			FileOutputStream fos = new FileOutputStream("res/out.ser");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(st);
			FileInputStream fis = new FileInputStream("res/out.ser");
			ObjectInputStream ois = new ObjectInputStream(fis);
			SerializableDemo st1 = (SerializableDemo)ois.readObject();
			System.out.println("s = " + st1.s + ", n = " + st1.n);
			oos.close();
			ois.close();
		}catch(Exception e) {e.printStackTrace();}

	}

}
