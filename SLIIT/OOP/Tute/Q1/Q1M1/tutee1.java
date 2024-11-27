package tute1;
import java.util.Scanner;

public class tute1e2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = 1;
		int i;
		
		System.out.println("Enter a number :");
		int x = scan.nextInt();
		scan.nextLine();
		
		for(i = x; i > 0;i--) {
			n *= i;
		}
		System.out.println(x+"! = " + n);
	}

}
