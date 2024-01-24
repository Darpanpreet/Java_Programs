package practiceEdureka;

import java.util.Scanner;

public class TransposeMatrix {

	public static void main(String[] args) {
		
		int x[][] = new int[2][2];
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter the data: ");
		for(int i=0; i<2; i++) {
			for(int j=0; j<2; j++) {
				x[i][j]=sc.nextInt();
			}
		}
		System.out.print("Your matrix Data is: \n");
		for(int i=0; i<2; i++) {
			for(int j=0; j<2; j++) {
				System.out.print(x[i][j]+ " ");
			}
		System.out.println();
		}
		
		//  Transpose the Matrix
		
		System.out.println();
		for(int i=0; i<2; i++) {
			for(int j=0; j<2; j++) {
				System.out.print(x[j][i] + " ");
			}
		System.out.println();
	}
	}
}
