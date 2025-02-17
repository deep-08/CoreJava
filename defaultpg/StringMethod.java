package defaultpg;

public class StringMethod {

	public static void main(String[] args) {
		
		String s = "Deepak Sudhakar";
		System.out.println(s.trim()); // It will remove the space before or after the string.
		System.out.println(s.charAt(3));
		System.out.println(s.contains("Deep"));
		
//		Compare the string
		//Equals()
		String s1 = "Deepak";
		String s2 = " sudhakar";
		
		System.out.println(s1.concat(s2));
		System.out.println(s.equalsIgnoreCase(s1.concat(s2))); // is equalto values of objects
		
		
// 			Multiple(sequence) of character in a string
		    // replace()
		
			String s3= "Welcome to selenium java selenium python selenium c#";
			System.out.println(s3.replace('w', 'g'));
			
//			Using StringBuffer class			
            //StringBuffer class
			
			StringBuffer str = new StringBuffer("welcome");
			System.out.println("Reversed String " + str.reverse());
			
//			Using StringBuilder class			
            //StringBuilder class
			StringBuilder st = new StringBuilder("welcome");
			System.out.println("Reversed String " + st.reverse());
			
			
			String sr= new String("Aswin"); // It is object is immutable
			String cntString = sr.concat(" kumar"); // It will take it has value
			System.out.println(cntString);
			
	}

}
