package accessModifier;

public class Private {
	 private int a =1;
	 private void name() {
		System.out.println("Scope level within the class");
	}
	 
	 public void maam(int a) {	
		 System.out.println("Private Override");
	 }
	 
	 @SuppressWarnings("unused")
	public static void main(String[]args) {
		Private pvtPrivate = new Private();
		
	    int a2 = pvtPrivate.a;
		pvtPrivate.name();
	}

}
