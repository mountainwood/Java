import java.io.*;
///解決警告訊息的三種方法
public class SerializableDemo3 implements Serializable{
	//第一種，也可從compile選 add default serial version ID
	private static final long serialVersionUID = 1L;
	//第二種
	//利用compile的清單，選 add generated serial version ID，java會自動產生 serialVersionUID
	//The serializable class SerializableDemo3 does not declare a static final serialVersionUID field of type long
	//private static final long serialVersionUID = -6659359925640289270L;
	//第三種
	//在最上方加上@SuppressWarnings("serial")
	
	String s;
	int n;
	transient double d;
	public SerializableDemo3(String s, int n, double d) {
		this.s = s; 
		this.n = n;
		this.d = d;
	}
	public static void main(String[] args) {
		try {
			SerializableDemo3 st = new SerializableDemo3("Goodluck", 3, 4.5);
			System.out.println("s = " + st.s + ", n = " + st.n + ", d = " + st.d);
			FileOutputStream fos = new FileOutputStream("res/out.ser");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(st);
			FileInputStream fis = new FileInputStream("res/out.ser");
			ObjectInputStream ois = new ObjectInputStream(fis);
			SerializableDemo3 st1 = (SerializableDemo3)ois.readObject();
			System.out.println("s = " + st1.s + ", n = " + st1.d);
			oos.close();
			ois.close();
		}catch(Exception e) {
			e.printStackTrace();
		}

	}

}
