package hw4;
/*
 * 2.�G���}�C���m��-Sales
	�Y�@���q�����ز��~A�BB�BC�BD�PE�A�������O��12�B16�B10�B14�P15���F�ӸӤ��q�@���T��P����A�L�̦b�Y������P��ƶq�p�U�ҥ�
	a.	�C�@�ӾP������P���`���B
	b.	�C�@�����~���P���`���B
	c.	���̦n�~�Z�]�P���`���B�̦h�̡^���P���
	d.	�P���`���B�̦h�����~

*/
public class Sales {

	public static void main(String[] args) {
		int[][] memberAndSpecies = new int[][]{{33, 32, 56, 45, 33},{77, 33, 68, 45, 23},{43, 55, 43, 67, 65}};
		//���~��P������x�}
		//row���C�ӾP������U���~���P��ƶq
		//col���U���~���P������P��ƶq
		int[] price = new int[] {12, 16, 10, 14, 15};		//���~������x�}
		int[][] sumSP = new int[3][5]; 		//���~�x�} * ���~������s�x�}

		
		
		 
		for (int i = 0; i < memberAndSpecies.length; i++) {				//memberAndSpecies.length���C��
			for(int j = 0; j < memberAndSpecies[i].length; j++) {
				sumSP[i][j] = memberAndSpecies[i][j] * price[j];		//���~�x�} * ���~������s�x�}
				System.out.printf("%d * %d = %d, ", memberAndSpecies[i][j], price[j], sumSP[i][j]);
			}
			System.out.printf("%n");
		}
		
		///////a.�D�بC�@�ӾP������P���`���B
		//�H�U���p��U�P������P���`�B
		for (int m = 0; m < sumSP.length; m++) {				//�C��
			int memberSum = 0;
			for(int n = 0; n < sumSP[m].length; n++) {		
				memberSum = memberSum + sumSP[m][n];
				if(n == sumSP[m].length-1) {
					System.out.printf("%d���P���`�B���G%d%n", m+1, memberSum);	//�U�P������P���`���B
				}
			}
		}
		
		//////b.�C�@�����~���P���`���B
		//����sumSP�x�}�A�䬰�U�����~�����P������P����B�x�} 3 x 5
		System.out.printf("%n");
		System.out.printf("b.�C�@�����~���P���`���B%n");
		int[] totalSpecies15 = new int[15]; 
			for (int i = 0; i < sumSP.length; i++) {			//�x�}��row����
				for(int j = 0; j < sumSP[i].length; j++) {		//�x�}��col����
					switch (i) {
						case 0: totalSpecies15[j] = sumSP[i][j];				
								//��  1 row��������JtotalSpecies15�� 0~4 ��m
							System.out.printf("%d %d%n", i, totalSpecies15[j]);
								break;
						case 1: totalSpecies15[j+5] = sumSP[i][j];
								//��  2 row��������JtotalSpecies15�� 5~9 ��m
							System.out.printf("%d %d%n", i, totalSpecies15[j+5]);
							break;
						case 2: totalSpecies15[j+10] = sumSP[i][j];
								//�� 3 row��������JtotalSpecies15�� 10~14 ��m
							System.out.printf("%d %d%n", i, totalSpecies15[j+10]);
							break;
						default: System.out.println("error%n");
					}
				}
			}
		System.out.println("totalSpecies15���x�}");			//�C�LtotalSpecies15���x�} 1x15
		for(int i = 0; i < totalSpecies15.length; i++) {
			System.out.printf("%d, ", totalSpecies15[i]);
		}
		System.out.printf("%n=========================================================================================%n");
		int[] totalSpecies5 = new int[5];					//�إߦU���~�U�۪��P���`���B���@���x�} 1x5
		for(int i = 0; i < totalSpecies15.length; i++) {	//�v�@�`���x�}	
				switch(i % 5) {				//�P���`���B���@���x�}(1x15) �����ޭȰ��H 5 ���l�ƨӧP�O�ӧ�U�۪����B�[�`�ܯx�}(1x5)
					case 0:
						totalSpecies5[i%5] = totalSpecies5[i%5] + totalSpecies15[i];	//�l�Ƭ� 0�A�[�ܯx�}(1x5) [0]����m
						break;
					case 1:
						totalSpecies5[i%5] = totalSpecies5[i%5] + totalSpecies15[i];	//�l�Ƭ� 1 �A�[�ܯx�}(1x5) [0]����m
						break;
					case 2:
						totalSpecies5[i%5] = totalSpecies5[i%5] + totalSpecies15[i];	//�l�Ƭ� 2 �A�[�ܯx�}(1x5) [0]����m
						break;
					case 3:
						totalSpecies5[i%5] = totalSpecies5[i%5] + totalSpecies15[i];	//�l�Ƭ� 3 �A�[�ܯx�}(1x5) [0]����m
						break;
					case 4:
						totalSpecies5[i%5] = totalSpecies5[i%5] + totalSpecies15[i];	//�l�Ƭ� 4 �A�[�ܯx�}(1x5) [0]����m
						break;
					default:
						System.out.printf("error%n");
				}
			}
		for(int i = 0; i < totalSpecies5.length; i++) {				//�C�L�U�Ӳ��~���P����B�x�}(1x5)
			System.out.printf("���~%d�����B%d, ",i+1 , totalSpecies5[i]);
		}
	System.out.println("");
	System.out.println("");
	System.out.println("c.���̦n�~�Z�]�P���`���B�̦h�̡^���P���");
		//////////c.���̦n�~�Z�]�P���`���B�̦h�̡^���P���
		int[] memberSumArray = new int[3];
		for (int m = 0; m < sumSP.length; m++) {				//�C��
			for(int n = 0; n < sumSP[m].length; n++) {		
				switch(m) {
					case 0 :
						memberSumArray[0] = memberSumArray[0] + sumSP[m][n];
						break;
					case 1 :
						memberSumArray[1] = memberSumArray[1] + sumSP[m][n];
						break;
					case 2 :
						memberSumArray[2] = memberSumArray[2] + sumSP[m][n];
						break;
					default:System.out.printf("error%n");
				}
			}
		}
		for(int i = 0; i < memberSumArray.length; i++) {				//�C�L�U�Ӳ��~���P����B�x�}(1x5)
			System.out.printf("�P���%d���P����B��%d%n",i+1 , memberSumArray[i]);
		}
		for(int i = 0;  i < memberSumArray.length; i++) {			//�q�}�C�Ĥ@�Ӥ����}�l�A�v�@�M�ĤG��̫�@�Ӥ�����j�p
			for(int j = 0 ; j < memberSumArray.length; j++) {		//�M�ĤG�Ӥ�����j�p�A�N�� j
				if(memberSumArray[i] < memberSumArray[j]) {					//�Y�� i �Ӥ������ j �Ӥ����p�A��̤���
					int m = memberSumArray[i];						//�O�� i �Ӥ����� m
					//System.out.println(memberSumArray[i]);		
					int n = memberSumArray[j];						//�O�� j �Ӥ����� n
					//System.out.println(memberSumArray[j]);
					memberSumArray[i] = n;							//��̦�m����
					memberSumArray[j] = m;
				}											//���j��i���s�̤p�ܤj�A�Ƨǰ}�C�̪�����
			}
			
		}
		for(int i = 0; i < memberSumArray.length; i++) {			//�v�@��X�x�}������
			System.out.println(memberSumArray[i]);
		}
		System.out.printf("�̤p�O�G%d�A�̤j�O�G%d",memberSumArray[0], memberSumArray[memberSumArray.length-1]);		//��X�̤p�M�̤j������
		
		///////////d.	�P���`���B�̦h�����~
		System.out.println("");
		System.out.println("");
		System.out.println("d.�P���`���B�̦h�����~");
		
		for(int i = 0; i < totalSpecies5.length; i++) {				//�C�L�U�Ӳ��~���P����B�x�}(1x5)
			System.out.printf("��%d���P����B��%d%n",i+1 , totalSpecies5[i]);
		}
		for(int i = 0;  i < totalSpecies5.length; i++) {			//�q�}�C�Ĥ@�Ӥ����}�l�A�v�@�M�ĤG��̫�@�Ӥ�����j�p
			for(int j = 0 ; j < totalSpecies5.length; j++) {		//�M�ĤG�Ӥ�����j�p�A�N�� j
				if(totalSpecies5[i] < totalSpecies5[j]) {					//�Y�� i �Ӥ������ j �Ӥ����p�A��̤���
					int m = totalSpecies5[i];						//�O�� i �Ӥ����� m
					//System.out.println(memberSumArray[i]);		
					int n = totalSpecies5[j];						//�O�� j �Ӥ����� n
					//System.out.println(memberSumArray[j]);
					totalSpecies5[i] = n;							//��̦�m����
					totalSpecies5[j] = m;
				}											//���j��i���s�̤p�ܤj�A�Ƨǰ}�C�̪�����
			}
			
		}
		for(int i = 0; i < totalSpecies5.length; i++) {			//�v�@��X�x�}������
			System.out.println(totalSpecies5[i]);
		}
		System.out.printf("�̤p�O�G%d�A�̤j�O�G%d",totalSpecies5[0], totalSpecies5[totalSpecies5.length-1]);	
	}
}
