package defaultpg;

import java.util.Scanner;

public class Ifclause {

	public static void main(String[] args) {
		int num;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number");
		num = scanner.nextInt();
		
		if(num>0) {
			System.out.println(num + "is positive");
		}
		else if(num==0) {
				System.out.println(num + "is neutral");
			}
		else {
			
		}
			System.out.println(num + "is -");
			
		
			scanner.close();
		}
	}
