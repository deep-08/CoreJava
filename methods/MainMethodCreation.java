package methods;

public class MainMethodCreation {

	public static void main(String[] args) {
		MethodsCreation  mc = new MethodsCreation();
		mc.m1();
		
		String rtnmtdString=mc.m2(); // m2 no return type we are declaring memory
		System.out.println(rtnmtdString);
		
		mc.m3(" Dubakur"); // passing parameter values here
		
		String rtnmtString2=mc.m4("Halwa");
		System.out.println(rtnmtString2);
		
	}

}
