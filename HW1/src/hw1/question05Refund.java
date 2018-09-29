package hw1;

public class question05Refund {

	public static void main(String[] args) {
		/*5.選擇性敘述的練習-Refund
		輸入在某商店購物應付金額與實付金額。
		實付金額小於應付金額，則印出”金額不足”。
		實付金額等於應付金額，則印出”不必找錢”。
		實付金額大於應付金額，則輸出找回金額最少的鈔票數和錢幣數。
		假設幣值只有1000, 500, 100元紙鈔和50, 10, 5, 1元硬幣。
		
		說明：若買了132元的商品，付1000元，應找回一張500元，三張100元，一個50元硬幣，一個10元硬幣，一個5元硬幣和三個1元硬幣。
		*/
		
		
		int requestCost = 100;
		int guestMoney = 116;
		//鈔票面額
		int Amount1000 = 1000;
		int Amount500 = 500;
		int Amount100 = 100;
		int Amount50 = 50;
		int Amount10 = 10;
		int Amount5 = 5;
		int Amount1 = 1;
		//各面額所找張數
		int refund1000 = 0;
		int refund500 = 0;
		int refund100 = 0;
		int refund50 = 0;
		int refund10 = 0;
		int refund5 = 0;
		int refund1 = 0;
		if (guestMoney < requestCost) {		//判斷實付金額 1.不足與 2.大於或等於 實際金額
			System.out.printf("%4s/%n", "金額不足");		//1.金額不足
		}else {
			if (guestMoney == requestCost) {		//2-1.等於實際金額與 2-2大於實際金額
				System.out.printf("%4s%n", "不必找錢");		//2-1. 等於實際金額，不找錢
			}else {		//2-2大於實際金額，要找錢
				refund1000 = guestMoney / Amount1000;
				refund500 = guestMoney % Amount1000 / Amount500;
				refund100 = guestMoney % Amount1000 % Amount500 /Amount100;
				refund50 = guestMoney % Amount1000 % Amount500 % Amount100 / Amount50;
				refund10 = guestMoney % Amount1000 % Amount500 % Amount100 % Amount50 / Amount10;
				refund5 = guestMoney % Amount1000 % Amount500 % Amount100 % Amount50 % Amount10 / Amount5;
				refund1 = guestMoney % Amount1000 % Amount500 % Amount100 % Amount50 % Amount10 % Amount5 /Amount1;
				System.out.printf("找回鈔票為：%d張1000元鈔票，%d張500元鈔票，%d張100元鈔票，%d顆50元硬幣，%d顆10元硬幣，%d顆5元硬幣，%d顆元硬幣%n"
						,refund1000 ,refund500, refund100, refund50, refund10, refund5, refund1);
			}
				
			}
		
		
			

	}

}
