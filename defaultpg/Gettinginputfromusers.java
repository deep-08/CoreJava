package defaultpg;

import java.util.Scanner;

public class Gettinginputfromusers {

	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		System.out.println("Wt is ur name");
		String name = scanner.nextLine();
		
		int rating = scanner.nextInt();
		System.out.println("What is ur rating");
		
		short rate = scanner.nextShort();
		scanner.nextLine();
		
		System.out.println("Enter email");
		String email= scanner.nextLine();
		
		System.out.println("Hello " + name);
		System.out.println(rating);
		
		
		

	}

}
