wpackage e2;
import java.util.Scanner;

public class ex2 {
	public static void main(String[] args) {
		//Creating scanning object
		Scanner scan = new Scanner(System.in);
		//Variable declaration
		int i,num,total;
		double avg;
		
		//variable initialization
		i = 0;
		num = 0;
		total = 0;
		
		System.out.print("Enter how many numbers you want to store?");
		num = scan.nextInt();
		int[] mArray = new int[num];
		
		while(i < num) {
			System.out.print("Enter a number");
			int number = scan.nextInt();
			scan.nextLine();
			
			mArray[i] = number;
			i++;
		}
		i= 0;
		System.out.print("The numbers yo entered");
		while(i < mArray.length) {
			//System.out.print(","+mArray[i]);
			
			total  += mArray[i];
			
			i++;
		}
		avg = (double)total / mArray.length;
		System.out.print("Average = " + avg);
	}

}
