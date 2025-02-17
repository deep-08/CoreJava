package defaultpg;

public class StringImmutableConcept {

	public static void main(String[] args) {
		String s1 ="abc";
		String s2 = new String("abc");
		String s3 = s2; // Object is assined to variables
		
		System.out.println(s1==s2); // This will return false type why because '==' this operator evaluate the object are same not values.
		System.out.println(s1.equals(s3));//This will return true type why because 'equalsto' this method evaluates the values of an objects.
		System.out.println(s3==s2);//This will return true why because '==' object is assigned to s3 instance;
	}

}
