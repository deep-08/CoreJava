package polymorphism;

public class MainConstructorOverloading {
	public static void main(String[] args) {
		ConstructorOverloading cOvr = new ConstructorOverloading(10.3,4, 3, 4);
		ConstructorOverloading covr1 = new ConstructorOverloading(2.4);
		
		ConstructorOverloading covl = new ConstructorOverloading();
		
		System.out.println(covr1.volume());
		
		
		
	}
}
