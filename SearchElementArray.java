package practiceEdureka;

import java.util.Scanner;

public class SearchElementArray {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int x[] = new int[5];
		int n;
		int count = 0;
		System.out.println("Enter your array: ");
		for (int i=0; i<x.length; i++) {
			x[i]= sc.nextInt();
		}
		System.out.print("Your Array is: ");
		for(int i=0; i<x.length; i++) {
			System.out.print( x[i] + " ");
		}
		System.out.print("\nEnter search elements: ");
		n=sc.nextInt();
		for (int i=0; i<x.length; i++) {
			if(x[i] == n) {
				count++;
			}
		}
		if (count>0) {
			System.out.println("Element Found " + count + " times");
		}
		else {
			System.out.println("Element Not Found");
		}
	}
}
