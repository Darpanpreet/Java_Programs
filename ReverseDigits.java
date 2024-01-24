package practiceEdureka;

import java.util.Scanner;

public class ReverseDigits {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number for which you want to reverse = ");
		int n = sc.nextInt();
		int i;
		while(n>0) {
			i=n%10;
			System.out.print(i);
			n=n/10;
		}
	}
}
