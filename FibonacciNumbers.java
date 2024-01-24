package practiceEdureka;

import java.util.Scanner;

public class FibonacciNumbers {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the term: ");
		int x = sc.nextInt();
		int a =0;
		int b = 1;
		int c;
		sc.close();
		for(int i=1;i<=10;i++) {
			System.out.print(a + " ");
			c= a+b;
			a= b;
			b= c;
		}
	}

}
