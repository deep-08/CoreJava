package defaultpg;

import java.util.Scanner;

public class Nestedif {

	public static void main(String[] args) {
		int mark;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter mark 0-100");
	    mark = scanner.nextInt();
	    
	    if (mark>=90 && mark>=60) 
	    	System.out.println(" Grade A");
	    else if (mark>=80)
	    	System.out.println("Grade B");
	    
	    else if (mark>=70)
	    	System.out.println("Grade C");
	    
	    else if (mark>=60)
	    	System.out.println("Grade D");
	    
	    else if (mark>=50)
	    	System.out.println("Grade E");
	    else {
			System.out.println("Grade F");
			scanner.close();
	    }
	    
	}		

		
	}
