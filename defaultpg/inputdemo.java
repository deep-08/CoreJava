package defaultpg;

import java.util.Scanner;

/*************Getting input from user**************/ 	
public class inputdemo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("What is ur Name");
		String name = scan.nextLine();
		System.out.println("rating 1-5");
		Short value = scan.nextShort();
		scan.nextLine();
		System.out.println("Enter Email");
		String email = scan.nextLine();
		System.out.println("hello" + name);
		System.out.println("ur rating" + value );
		System.out.println("hello" + email);
		scan.close();
	}
}


/* Scanner - inbuild class
 * scan - Object
 * new Scanner() new - Object
 * system.in - Predefined Object
 */