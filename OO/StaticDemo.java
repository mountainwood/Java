
public class StaticDemo {
	int x; 
	static int y;
	public static void main(String[] args) {
		//x++; 		//���i�Astatic use non-static
		y++;
		StaticDemo sd = new StaticDemo();
		sd.x++;			//�Y�Q�ϥ� non-static �ܼơA�ݭn new ����A���o�O����Ŷ��A�Өϥ�
		System.out.println(sd.x);
		System.out.println(y);
		sd.y++;			//p.66 pp.131
		StaticDemo.y++;			//

	}

}
