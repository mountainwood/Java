package com.iii.cb101.mt;

public class printDEMO {
	public static void main(String[] args) {	
	System.out.printf("-%5d-%n", 123);				
	//-  123-
	/*d:ボ10秈璶5计穦干フ */
	System.out.printf("-%+5d-%n", 123);				
	//- +123-
	/*ボタ计 */
	
	System.out.printf("-%X-%n", 123);				
	//-7B-
	/*16秈猭ぃ璝Τ64ê礚猭耞琌10秈临16秈 */
	System.out.printf("-%#X-%n", 123);				
	//-0X7B-
	/*16秈玡0X0x(-%#x-%n碞穦糶)*/
	
	System.out.printf("-%f-%n", 123.678);			
	//-123.678000-
	/*疊翴计箇砞16*/
	System.out.printf("-%10.2f-%n", 123.678);		
	//-    123.68-
	/*10计2计(彼き)*/
	System.out.printf("-%-10.1f-%n", 12.678);		
	//-12.7      -
	/*10计1计璽腹オ綼娩痙フ*/
	System.out.printf("-%010.2f-%n", 123.678);		
	//-0000123.68-
	/*娩干箂*/
	System.out.printf("-%10.2E-%n", 123.678);		
	//-  1.24E+02-
	/*厩癘腹计痙 2*/
	System.out.printf("-%,10.2f-%n", 123.678);		
	//-    123.68-
	/*硆腹硆腹计*/
	System.out.printf("-%(10.1f-%n", 123.678);		
	//-     123.7-
	/*璽珹腹*/
	System.out.printf("-%10s-%n", 123.678);			
	//-   123.678-
	/*﹃*/


	}
}
