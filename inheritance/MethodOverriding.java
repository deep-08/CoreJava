package inheritance;

class ubi{
	double accountType() {
		return 0;
	}
}

class sbi extends ubi{
	double accountType() {
		return 10000000000l; // Method overriding
	}
}

class IB extends ubi{
	double accountType() {
		return 10.4; //Method overriding
	}
}

public class MethodOverriding {

	public static void main(String[] args) {
			
		ubi transUbi = new ubi();
		IB transIb = new IB();
		sbi traSbi = new sbi();
		System.out.println(transUbi.accountType());
		System.out.println(transIb.accountType());
		System.out.println(traSbi.accountType());
		
	}

}
