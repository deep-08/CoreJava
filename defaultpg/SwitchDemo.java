package defaultpg;

import java.util.Scanner;

public class SwitchDemo	{ 
	public static void main(String[] argsStrings) {
		int a,b;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter first Num");
		a= scanner.nextInt();
		System.out.println("Enter second num");
		b=scanner.nextInt();
		char operator;
		System.out.println("Enter the operator +,-,*,/ or % :");
		operator = scanner.next().charAt(0);
		
		switch (operator) {
		case '+':
			System.out.println(a + "+" + b + "=" + (a+b));
			break;
		case '-': 
			System.out.println(a + "+" + b + "=" + (a-b));
			break;

		case '*': 
			System.out.println(a + "+" + b + "=" + (a*b));
			break;

		case '/': 
			System.out.println(a + "+" + b + "=" + (a/b));
			break;

		case '%': 
			System.out.println(a + "+" + b + "=" + (a%b));
			break;
		default:
			System.out.println(" you have entered incorrect operator");
			
		}
		scanner.close();
	}
}
