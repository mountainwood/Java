
public class Account {
	String accountNO;
	double balance;
	
	Account(String accountNO, double balance){
		this.accountNO = accountNO;
		this.balance = balance;
	}
	void printAccData() {
		System.out.println("�b���G" + accountNO);
		System.out.println("���B�G" + balance);
	}

	
	public static void main(String[] args) {
		Account a = new Account("124654", 50000.0);
		a.printAccData();		//�C�L
		
		//p.117 �~�Ӥ�lab
		/*
		Account a1 = new Account("127333", 57730.0);
		a1.printAccData();
		CheckingAccount ca = new CheckingAccount("837444", 18730.0, 20);
		*/
	}

}
