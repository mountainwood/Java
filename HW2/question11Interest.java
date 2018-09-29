package hw2;
/*11.迴圈敘述的練習-Interest
錢精打以10%單利投資100000元，郝細算則以5%複利投資100000元。計算多少年後郝細算的投資可以超過錢精打，並將此時兩人錢數印出。(27年後)
提示：單利公式：P(1+r*n)    複利公式：P(1+r)n
P：本金，r：利率，n：多少年
*/
public class question11Interest {

	public static void main(String[] args) {
		int original = 100000;		//兩人的本金
		double totalA = 0;			//單利人的利息和
		double totalB = 1;			//複利人的利息和，初始設為 1 
		int n =1;					//年數
		while(n> 0) {
			totalA = 1+ 0.1 * n;		//單利人的本利和計算，(1+0.1)*n
			totalB = totalB * 1.05;		//複利人的本利和計算，(1+0.05)^n
			
			if(totalB > totalA) {		//如果 B 的本利和超過 A，則跳出迴圈
				break;
			}
			
			n++;
		}
		System.out.printf("%d 年後， 單利人 A 的本利和會超過複利人 B，A 之本利和為 %f，B 之本利和為 %f，", n, original*totalA ,original*totalB);

	}

}
