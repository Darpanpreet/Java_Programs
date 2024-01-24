package practiceEdureka;

import java.util.Scanner;

public class BankApp{

	public static void main(String[]args) {

		Scanner sc = new Scanner(System.in);
		Account acc = null;
		
		long accno;
		String name;
		float amt;
		
		while(true) {
		System.out.println();
		System.out.println("1. Create Account");
		System.out.println("2. Deposit");
		System.out.println("3. Withdraw");
		System.out.println("4. Balance");
		System.out.println("5. Exit");
		
		System.out.println();
		
		System.out.println("Enter the Option: ");
		int opt = sc.nextInt();
		System.out.println();
		
		switch(opt) {
		case 1:
			if(acc == null) {
			System.out.print("Enter account number: ");
			accno = sc.nextLong();
			sc.nextLine();
			
			System.out.print("Enter Name: ");
			name = sc.nextLine();
			
			System.out.print("Enter the initial Deposit: ");
			amt = sc.nextFloat();
			
			System.out.println("Your Account details====>> " + "Account Number: "+accno + " | " + "Name: "+ name + " | " + " | " + amt);
			System.out.println();
			sc.nextLine();
			}
			else {
				System.out.println("You already have a account with us.");
				sc.nextLong();
			
			}
			break;
		
		case 2:
			if(acc != null) {
				System.out.print("Enter the amount for deposit: ");
				amt = sc.nextFloat();
				acc.deposit(amt);
				
			}
			else {
				System.out.println("## Please Open an Account with us ##");
			}
			break;
		case 3:
			if(acc != null ) {
				System.out.println("Enter the amount for withdraw: ");
				amt = sc.nextFloat();
				acc.withdraw(amt);
			}
			else {
				System.out.println("## Please Open an Account with us ##");
			}
			break;
		case 4:
			if(acc != null) {
				System.out.println("Current Balance is: " + acc.bal);
			}
			else {
				System.out.println("## Please Open an Account with us ##");
			}
			break;
		case 5:
			System.exit(0);
			break;
		default:
				System.out.println("## Invalid Option ==>> TRY AGAIN");
		}
		}
		
}
		
		

	}
		
		
		
	


