

package assignment;

import java.util.Scanner;

public class PalindromeinNumber{

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a number");
		
		int num = sc.nextInt();
		int num1= num;
		int org_num;
		
		int rev = 0;
		  // Reverse the digits of the number
        while (num != 0) {
            org_num= num % 10;          // Extract the last digit
            rev = rev *10 + org_num;    // Append the digit to the reversed number
            num /= 10;                  // Remove the last digit from the number
        }
		
		System.out.println(rev);
		
		
		if (num1==rev) {
			System.out.println("its palindrome " + rev);
		}
		else {
			System.out.println("Its not palindrome " + rev);
		}
		
		
		sc.close();
	}

}
