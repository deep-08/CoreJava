package conditionalStatements;
import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the weekno ");
		int weekno = scan.nextInt();
		
		switch (weekno) {
		case 1:System.out.println("Sun");
		case 2:System.out.println("Mon");break;
		case 3:System.out.println("Tue");break;
		case 4:System.out.println("wed");break;
		case 5:System.out.println("Thu");break;
		case 6:System.out.println("Fri");break;
		case 7:System.out.println("Sat");break;

		default: System.out.println("Invalid");
		}
		scan.close();
	}

}
