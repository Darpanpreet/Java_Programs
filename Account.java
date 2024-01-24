package practiceEdureka;

public class Account {

	long acno;
	String name;
	float bal;
	
	public Account(long acno,String name,float bal){
		this.acno = acno;
		this.name = name;
		this.bal = bal;
	}
	void deposit(float amt){
		this.bal = this.bal + amt;
		System.out.println(amt + " has been credited your account. Your new balance is: " + this.bal);
	}
	void withdraw(float amt){
		if(this.bal>=amt) {
			this.bal = this.bal - amt;
			System.out.println(amt + " has been withdrwan from your account, Your new Balance is: " + this.bal);
		}
		else {
			System.err.println("Insufficient Balance");
		}
	}
	void getbalance(float amt) {
		this.bal = amt;
		System.out.println("Your Balance is: " + this.bal);
	}

}
