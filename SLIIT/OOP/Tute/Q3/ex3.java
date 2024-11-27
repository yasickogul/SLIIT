package ex3;
import java.util.Scanner;

public class ex3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int i;
		i = 1;
		
		System.out.print("Enter a number :");
		int table = scan.nextInt();
		scan.nextLine();
		while(i <= 10) {
			System.out.println(table + "*" +i + "=" + i * table);
			i++;
		}
		
	}

}
