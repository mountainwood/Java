package com.iii.cb101.mt;

public class printDEMO {
	public static void main(String[] args) {	
	System.out.printf("-%5d-%n", 123);				
	//-  123-
	/*d:���10�i��A�n5�Ӧ�ơA�h���|�ɤW�ť� */
	System.out.printf("-%+5d-%n", 123);				
	//- +123-
	/*��ܥ��� */
	
	System.out.printf("-%X-%n", 123);				
	//-7B-
	/*16�i��A���k���n�Y��64�A���L�k�P�_�O10�i����16�i�� */
	System.out.printf("-%#X-%n", 123);				
	//-0X7B-
	/*16�i��A�e���L�X0X�B0x(�H-%#x-%n�N�|�L�X�p�g)*/
	
	System.out.printf("-%f-%n", 123.678);			
	//-123.678000-
	/*�B�I�ơA�w�]�L16��*/
	System.out.printf("-%10.2f-%n", 123.678);		
	//-    123.68-
	/*�L10��ơA�]�t2��p��(�|�ˤ��J)*/
	System.out.printf("-%-10.1f-%n", 12.678);		
	//-12.7      -
	/*�L10��ơA�]�t1��p�ơA�t���V���a�A�k��d��*/
	System.out.printf("-%010.2f-%n", 123.678);		
	//-0000123.68-
	/*�P�W�A�k��ɹs*/
	System.out.printf("-%10.2E-%n", 123.678);		
	//-  1.24E+02-
	/*��ǰO���A�p�Ưd 2��*/
	System.out.printf("-%,10.2f-%n", 123.678);		
	//-    123.68-
	/*�d��r���A�r�����@���*/
	System.out.printf("-%(10.1f-%n", 123.678);		
	//-     123.7-
	/*�t���ɡA�[�W�p�A��*/
	System.out.printf("-%10s-%n", 123.678);			
	//-   123.678-
	/*�N��r��*/


	}
}
