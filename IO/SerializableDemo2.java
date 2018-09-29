//¥[¤Jtransient
import java.io.*;
public class SerializableDemo2 implements Serializable{
	private static final long serialVersionUID = 1L;
	String s;
	int n;
	transient double d;
	public SerializableDemo2(String s, int n, double d) {
		this.s = s; 
		this.n = n;
		this.d = d;
	}
	public static void main(String[] args) {
		try {
			SerializableDemo2 st = new SerializableDemo2("Goodluck", 3, 4.5);
			System.out.println("s = " + st.s + ", n = " + st.n + ", d = " + st.d);
			FileOutputStream fos = new FileOutputStream("res/out.ser");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(st);
			FileInputStream fis = new FileInputStream("res/out.ser");
			ObjectInputStream ois = new ObjectInputStream(fis);
			SerializableDemo2 st1 = (SerializableDemo2)ois.readObject();
			System.out.println("s = " + st1.s + ", n = " + st1.d);
			oos.close();
			ois.close();
		}catch(Exception e) {
			e.printStackTrace();
		}

	}

}
