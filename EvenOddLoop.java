package practiceEdureka;

public class EvenOddLoop {

	public static void main(String[] args) {
		// program to print 10 even 
		int num;
		int i;
		
		for (num = 1; num<=20; num++) {
			if(num%2 == 0) {
				System.out.println("10 even numbers are : " + num);
			}
		}
		//program to print 10 odd numbers
		for (i = 1 ; i <=20; i++) {
			if(i%2 !=0) {
				System.out.println("10 odd number are: " +i);
			}
		}
	}

}
