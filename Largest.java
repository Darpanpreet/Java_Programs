package practiceEdureka;

import java.util.Scanner;

public class Largest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter your first number:  ");
		int a = sc.nextInt();
		System.out.print("Enter your Second number:  ");
		int b = sc.nextInt();
		
		/*if (a>b) {
			System.out.println("Largest number is =  " + a);
		}
		else {
			System.out.println("Largest number is =  " + b);
		}
*/		
		// using ternary operator
		int lar = (a>b)?a:b;
		System.out.println("Largest number is : " + lar);
	}

}
