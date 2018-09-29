package hw1;

public class question01Electricity {

	public static void main(String[] args) {
		/*1.	選擇性敘述的練習-Electricity
				輸入何種用電和度數，計算出需繳之電費。
				電力公司使用累計方式來計算電費，分工業用電及家庭用電。
                   	   家庭用電        工業用電
   				240度(含)以下			0.15元			0.45元
				241~540(含)度   		0.25元			0.45元
				541度以上        	0.45元			0.45元
		*/
		
		//String type = "industry"; //type.equals("industry")	 	//industry ，區分家庭以及工業用電
		int type = 0 ;						//用電類別，0為家庭，1為工業
		double electricity = 541;			//用電度數
		double industryDegree = 0.45;		//工業用電費率
		double homeDegree240 = 0.15;		//家庭用電240度以下
		double homeDegree241540 = 0.25;		//家庭用電241~540度之間
		double homeDegree541 = 0.45;		//家庭用電541度以上
		double value = 0;					//電費總額
		if (type == 1) {			//工業用電類別
									//switch無法使用boolean，只能使用四大基本類別，若要用boolean，必須使用常數型變數或char
			value = electricity * industryDegree;	//計算電費，電費 = 費率 * 度數 
			System.out.printf("工業度數為：%f度，電費總計%.4f元%n", electricity, value);	//顯示工業用電度數

		}else{		//家庭用電
			if (electricity <= 240) {		//度數在 240 以下
				value = electricity * homeDegree240;	//計算電費，電費 = 費率 * 度數
			}else {		//度數在 241 以上 
				if (electricity <= 540){	//度數在 241 至 540 之間
					value = 240 * homeDegree240 + (electricity -240) * homeDegree241540 ;					
				}else{	//度數在541以上
					value = 240 * homeDegree240 + 300 * homeDegree241540 + (electricity - 540 ) * homeDegree541;
				}
				
			}
			System.out.printf("家庭度數為：%f度，電費總計%.4f元",electricity, value);	//顯示家庭用電度數
			
		}

	}

}
