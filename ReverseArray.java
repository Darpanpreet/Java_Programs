package practiceEdureka;

import java.util.Scanner;

public class ReverseArray {

	public static void main(String[] args) {
		
		int x[]= new int[6];
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the array: ");
		for(int i=0; i<x.length; i++) {
			x[i]= sc.nextInt();			
		}
		System.out.print("Your array is:  ");
		for(int i=0; i<x.length; i++) {
			System.out.print(x[i] + " ");
		}
		System.out.print("\nReverse Order:  ");
		for(int i=x.length-1; i>=0; i--) {
			System.out.print(x[i] + " ");
		}
	}
}
