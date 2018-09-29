
public class StaticDemo {
	int x; 
	static int y;
	public static void main(String[] args) {
		//x++; 		//不可，static use non-static
		y++;
		StaticDemo sd = new StaticDemo();
		sd.x++;			//若想使用 non-static 變數，需要 new 之後，取得記憶體空間再來使用
		System.out.println(sd.x);
		System.out.println(y);
		sd.y++;			//p.66 pp.131
		StaticDemo.y++;			//

	}

}
