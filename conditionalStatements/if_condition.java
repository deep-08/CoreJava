package conditionalStatements;

public class if_condition {

	public static void main(String[] args) {
		int a=60, b = 50;
		int max;
		if (a>b) 
			max =a;
		else 
			max = b;
		System.out.println(max);
		
		int persongAge= 15;
		
		if (persongAge<18) {
			System.out.println("Eligible");
		} else {
			System.out.println("Not eligible ");
		}		
	}

}
