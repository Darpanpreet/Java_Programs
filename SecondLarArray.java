package practiceEdureka;

import java.util.Arrays;

public class SecondLarArray {

	public static void main(String[] args) {
		
		int x[]= {23, 45, 34, 12, 45};
		//int y =x.length;
		
		if(x.length < 2) {
			System.out.print("Second largest element doesnot exist.");
			return;
		}
		
		/*
		//using sorting
		Arrays.sort(x);
		int secondLargest = x[y-2];
		
		System.out.print("Second largest number is: " + secondLargest);
		*/
		
		//without sorting
		int largest = Integer.MIN_VALUE;
		int secondlargest = Integer.MIN_VALUE;
		
		for(int i=0; i<x.length; i++) {
			if(x[i]>largest) {
				secondlargest = largest;
				largest = x[i];
			}
			if(x[i] != largest && x[i] > secondlargest) {
				secondlargest = x[i];
			}
		}
		System.out.println(secondlargest);
	}
}
