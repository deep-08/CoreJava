
public class Practice {
	public class Example {
	    public void display(Example obj) {
	        System.out.println("Method called with: " + obj);
	    }

	     public void invokeDisplay() {
	        display(this); // Passes the current object to the display method
	    }

	    
	    }
	  public static void main(String[] args) {
		Practice examplePractice = new Practice();
		Example exa = examplePractice. new Example();
	    exa.invokeDisplay();
}
}