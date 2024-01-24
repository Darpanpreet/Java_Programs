package practiceEdureka;

import java.util.Scanner;

public class Table {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number for which you want the table: ");
		int n = sc.nextInt();
		int i;
		for(i=1;i<=n;i++) {
			System.out.println(n + " x " + i + " = " + n*i);
		}
	}
}
