package Interface;

interface inheriA{
	int x =100;
	void m();
}

interface inherB{
	int y =200;
	void n();
}

public class MultipleInheritance extends Class2 implements inheriA,inherB{
	@Override
	public void n() {
		System.out.println(x);
	}
	
	@Override
	public void m() {
		System.out.println(y);	
	}
	public static void main(String args[]) {
		MultipleInheritance multipleinherit = new MultipleInheritance();
		multipleinherit.n();
		multipleinherit.m();
		multipleinherit.m3();
	}
	
}
