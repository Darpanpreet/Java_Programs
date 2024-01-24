package practiceEdureka;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter your number: ");
		int num = sc.nextInt();
		
		if(num%2 == 0) {
			System.out.println("Given number is even. Number is "+ num );
		}
		else {
			System.out.println("Given number is odd. Number is "+ num);
		}
	}

}
