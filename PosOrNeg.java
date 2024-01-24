package practiceEdureka;

import java.util.Scanner;

public class PosOrNeg {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter your number =  ");
		int num = sc.nextInt();
		if(num<0) {
			System.out.println("Your number is negative. Your number is =  " + num);
		}else if(num > 0) {
			System.out.println("Your number is positive. Your number is =  " + num);	
			}
		
		else {
			System.out.println("Your number is 0. ");
		}
	}

}
