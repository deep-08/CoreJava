package polymorphism;

public class MainMethodOverloading {

	public static void main(String[] args) {
		MethodOverloading mo = new MethodOverloading();
		
		mo.sum();
		mo.sum(3, 4);
		mo.sum(10, 4.5);
		mo.sum(4, 4, 4);

	}

}
