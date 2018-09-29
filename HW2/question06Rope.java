package hw2;
/*
 * 若有一條繩子長3000公尺，每天剪去一半的長度，需多少天繩子的長度會短於5公尺。*/
public class question06Rope {

	public static void main(String[] args) {
		double rope = 3000;		//繩長
		int day = 0;			//天數
		while ( rope > 5) {		//小於5公尺時，統計天數
			rope = rope / 2;
			day++;
			
			System.out.printf("第 %d 天", day);
			System.out.printf("繩長%f%n", rope);
		}
		System.out.printf("所以第 %d 天繩長小於一半",day);
	
	}

}
