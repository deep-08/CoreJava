package loopingIterativeStatement;


public class ForLoop {

	public static void main(String[] args) {
		
		for (int i = 10; i>=0; i--) {
			if (i%2==0) {
				System.out.println("Even " +i);
			}
			else {
				System.out.println("Odd " +i);
			}
		}
			
		for (int j = 1; j <= 10; j++) {
			System.out.println(j);
		}
			
		}

}
