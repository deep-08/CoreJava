package defaultpg;

import java.util.Scanner;

public class Loop_Demo {

	public static void main(String[] args) {
		int n;
		Scanner scanner=new Scanner(System.in);
		System.out.println("How many star do you want");
		n=scanner.nextInt();
		
		while (n<=6) {
			System.out.print('*');
			n++;
		}
		
		 do {
			System.out.print('*');
			n++;
		}while (n<=6);

	}

}
