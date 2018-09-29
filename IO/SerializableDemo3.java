import java.io.*;
///�ѨMĵ�i�T�����T�ؤ�k
public class SerializableDemo3 implements Serializable{
	//�Ĥ@�ءA�]�i�qcompile�� add default serial version ID
	private static final long serialVersionUID = 1L;
	//�ĤG��
	//�Q��compile���M��A�� add generated serial version ID�Ajava�|�۰ʲ��� serialVersionUID
	//The serializable class SerializableDemo3 does not declare a static final serialVersionUID field of type long
	//private static final long serialVersionUID = -6659359925640289270L;
	//�ĤT��
	//�b�̤W��[�W@SuppressWarnings("serial")
	
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
