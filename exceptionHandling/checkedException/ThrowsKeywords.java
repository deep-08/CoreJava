package exceptionHandling.checkedException;

import java.io.FileInputStream;
import java.io.IOException;

public class ThrowsKeywords {

	public static void main(String[] args) throws  IOException, InterruptedException {
		System.out.println("Program Strated");
		System.out.println("Program in progress");
		
		FileInputStream fileInputStream = new FileInputStream("C:\\Text.txt");
		
		fileInputStream.available();
		
		Thread.sleep(200);
		
		System.out.println("Program is finished");
		System.out.println("Program is exited");

	}

}
