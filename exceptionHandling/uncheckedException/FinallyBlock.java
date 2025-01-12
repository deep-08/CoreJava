package exceptionHandling.uncheckedException;

import java.util.Scanner;

public class FinallyBlock {

	public static void main(String[] args) {
System.out.println("Enter a number");
		
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		
		 try {
			 String str= null;
			 System.out.println(str.length());
		} catch (NullPointerException e) {
			System.out.println("Catch block handled exception");
			System.out.println(e.getMessage());
		}
		 
		 finally {
			 System.out.println("you entered npe finally block....");		 
		 }
		
		 System.out.println("Program is finished");
	}

}
