package practiceEdureka;

import java.util.Scanner;

public class AddDigits {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number (should be atleast 2 digit) =  ");
		int n = sc.nextInt();
		int i;
		int sum = 0;
		while(n > 0) {
			
			i = n%10;
			sum=sum+i;
			n=n/10;
		}
		System.out.println("Sum of the digits is: " + sum);
	}

}
