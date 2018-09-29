
public class CheckingAccount extends Account{
	int checkCount;
	
	CheckingAccount(String accountNO, double balance, int checkCount){
		super(accountNO, balance);
		this.checkCount = checkCount;		//�غc�l
	}
	
	void printAccData() {
		super.printAccData();
		System.out.println("checkCount = " + checkCount);
	}
	
	public static void main(String[] args) {
		Account a = new Account("32434566", 457000);
		a.printAccData();		//a ���I�s a ��}
		CheckingAccount ca = new CheckingAccount("3244566", 388444, 30);
		ca.printAccData();		//ca ���I�s a ��}
		
		//��g�W�|�欰�h��
		System.out.println("==�H�h����g�W�|��==");
		Account[] aa = new Account[2];
		aa[0] = new Account("32434566", 457000);
		aa[1] = new CheckingAccount("3244566", 388444, 30);
		for(int i = 0; i < aa.length; i++) {
			aa[i].printAccData();
		}
	}
	
}
