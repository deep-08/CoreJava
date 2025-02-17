/****************Encapsulation**************
 * * Wrapping the variable & methods as a single unit.
 * * All variables should be private.
 * * Usually encapsulation use protect the data
 * * Variables are accessed by methods only.
 * * If Access Modifier is private. We can access by using
 * 				1.Getter method
 * 				2.Setter method 
 * 
 * When we duplicate variable same name in encapsulation 
 * 1. 'This' keyword it always indicates global variable.
*/




package encapsulation;



public class Account {
	

	private int accno ;
	private String accHolderString;
	private Double amount;
	
	public int getAccno() {// get method always return
		System.out.println(accno); ;
		return accno;
	}
	public void setAccno(int accno) {
		this.accno = accno;
	}
	public String getAccHolderString() {
		return accHolderString;
	}
	
	public void setAccHolderString(String accHolderString) {
		this.accHolderString = accHolderString;
	}
	public Double getAmount() {
		return amount;
	}
	
	public void setAmount(Double amount) {
		this.amount = amount;
	}
	
	
	
	
}
