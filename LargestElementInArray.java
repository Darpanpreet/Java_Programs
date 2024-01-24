package practiceEdureka;

import java.util.Scanner;

public class LargestElementInArray {

	public static void main(String[] args) {
		int[] n = new int[5];
		int max;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the array; ");
		for(int i=0; i<5;i++) {
			n[i]=sc.nextInt();
		}
		max = n[0];
		for(int i=1;i<5;i++) {
			if(n[i]>max) {
				max=n[i];
			}
		}
		System.out.print("The max number in array is: " + max);
	}

}
