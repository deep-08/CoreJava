package defaultpg;

public class TypeCasting {

	public static void main(String[] args) {
		byte b=5; // 1byte
		int n; //4bytes
		n=b; // automatic type conversion / implicit type conversion
		b=(byte)n; // --Explicit type casting
		System.out.println(b);
		
	}

}
