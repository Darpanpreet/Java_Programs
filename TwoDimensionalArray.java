package practiceEdureka;

import java.util.Scanner;

public class TwoDimensionalArray {

	public static void main(String[] args) {
		// add / subtract two dimensional array of 2x2 matrix
		
		Scanner sc = new Scanner(System.in);
		int x[][]= new int[2][2];
		int y[][]= new int[2][2];
		int sum[][]= new int[2][2];
		int sub[][]= new int[2][2];
		
		System.out.print("Enter the first matrix: ");
		for(int i=0; i<2; i++) {
			for(int j=0; j<2; j++) {
				x[i][j]=sc.nextInt();
			}
		}
		for(int i=0; i<2; i++) {
			for(int j=0; j<2; j++) {
			System.out.print(x[i][j] + " ");
		}
			System.out.println();
		}
		System.out.println();
		System.out.print("Enter Second Matrix: ");
		System.out.print("\n");
		for(int i=0; i<2; i++) {
			for(int j=0; j<2; j++) {
				y[i][j]= sc.nextInt();
			}
		}
		for(int i=0; i<2; i++) {
			for(int j=0; j<2; j++) {
				System.out.print(y[i][j] + " ");
			}
			System.out.println();
		}
		for(int i=0; i<2; i++) {
			for(int j=0; j<2; j++) {
				sum[i][j]=x[i][j]+y[i][j];
			}
		}
		System.out.println();
		
		// Addition
		System.out.print("Sum is: \n");
		for(int i=0; i<2; i++) {
			for(int j=0; j<2; j++) {
				System.out.print(sum[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
		// Subtraction
		for(int i=0; i<2; i++) {
			for(int j=0; j<2; j++) {
				sub[i][j]=x[i][j]-y[i][j];
			}
		}
		System.out.println("Subtraction is: ");
		for(int i=0; i<2; i++) {
			for(int j=0; j<2; j++) {
				System.out.print(sub[i][j] + " ");
			}
			System.out.println();
		}
	}
}
