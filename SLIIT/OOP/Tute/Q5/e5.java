package e5;
import java.util.Scanner;

public class e5 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int count;
		count = 0;
		
		System.out.print("Enter a string :");
		String name = scan.nextLine();
		
		System.out.print("Enter what occurance want to count :");
		char occur = scan.nextLine().charAt(0);
		
		for(int i = 0;i <= name.length() - 1;i++) {
			if(name.charAt(i) == occur) {
				count++;
			}
		}
		System.out.print("There are " + count +" "+ occur+ "'s in " + name);
		
		scan.close();
		

	}
}
