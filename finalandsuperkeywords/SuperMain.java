package finalandsuperkeywords;


public class SuperMain {

	public static void main(String[] args) {
		SuperClassMethods objAnimal = new SuperClassMethods();
		Dog obDog = new Dog();
		
		obDog.display();
		obDog.cat();
		objAnimal.cat();
		
	}

}
