package TypeCasting;

class parent{
	int id =202;
	
	void m1() {
		System.out.println("This method come from m1");
	}
}
 
 class child extends parent{
	 String nameString = "deep";
	 
	 void m2() {
		 System.out.println("this method come from m2");
	 }
 }
public class TypeCastingObjects1 {

	public static void main(String[] args) {
		
		child ch = new child();
		
		System.out.println(ch.id);
		
		ch.m2();
		
		parent prtParent= new child(); // upCasting 
		
		System.out.println(prtParent.id);
		prtParent.m1();
		
//		System.out.println(prtParent.name);
//		prtParent.m2();
		
		child chchChild = new child();
		parent prtParent2 = chchChild;
		
		
		parent parParent = new parent();
		child chChild =(child)parParent; // downcasting explicitly;
		
		System.out.println(chChild.nameString);
		chChild.m2();
		
		
		

	}

}
