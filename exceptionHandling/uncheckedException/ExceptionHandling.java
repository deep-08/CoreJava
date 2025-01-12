package exceptionHandling.uncheckedException;

import java.security.PublicKey;
import java.util.Scanner;

public class ExceptionHandling {
		
	@SuppressWarnings("null")
	public static void main(String []args) {
		System.out.println("Enter a number");
		
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		try {
			System.out.println(100/num); //Arithmetic exception	
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		 try {
			 String str= null;
			 System.out.println(str.length());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("Program is completed...");
		System.out.println("Program is exited...");
		
		
		
		
		
		
	}
}
