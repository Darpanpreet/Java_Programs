package practiceEdureka;

import java.util.Scanner;

public class ArrayAscOrder {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x[] = new int[5];
		int temp;
		System.out.print("Enter the Array: ");
		for (int i=0; i<x.length; i++) {
			x[i]=sc.nextInt();
		}
		System.out.print("Your Array is: ");
		for(int i=0; i<x.length; i++) {
			System.out.print(x[i] + "  ");
		}
		for (int i=0; i<x.length; i++) {
			for(int j=i+1; j<x.length; j++) {
				//if you need to descend the order all you have to do is:
				//if(x[i]<x[j]){
				if(x[i]>x[j]) {
					temp = x[i];
					x[i]=x[j];
					x[j]=temp;
				}
			}
		}
		System.out.print("\nArray in ascending order: ");
		for(int i=0; i<x.length; i++) {
			System.out.print(x[i] + " ");
		}
	}
}
