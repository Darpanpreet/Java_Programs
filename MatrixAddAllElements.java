package practiceEdureka;

public class MatrixAddAllElements {

	public static void main(String[] args) {
		
		int x[][] = {{1, 2, 3}, {1, 2, 3}, {2, 3, 4}};
				int sum = 0;
				for(int i=0; i<x.length; i++) {
					for(int j=0; j<x.length; j++) {
						sum = sum + x[i][j];
					}
				}System.out.print(sum);
	}
}
