package assignment;
import java.util.Scanner;

public class PrintWeeks {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter the week day 1 to 7");
		int weekno = scan.nextInt(); 
				
		if (weekno==1) { //== is compare the compare the object
			System.out.println("This is sunday");
			
		}
		else if (weekno==2) {
			System.out.println("This is Monday");
		}
		else if (weekno==3) {
			System.out.println("This is Tuesday");
		}
		else if (weekno==4) {
			System.out.println("This is wednesday");
		}
		else if (weekno==5) {
			System.out.println("This is Thursday");
		}
		else if (weekno==6) {
			System.out.println("This is Friday");
		}
		else if (weekno==7) {
			System.out.println("This is Saturday");
		}
		else {
			System.out.println("Invalid");
		}
		scan.close();
	}
}
