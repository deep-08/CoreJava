package encapsulation;

public class MainAccount {

	public static void main(String[] args) {
		Account acnt = new Account();
		
//		acnt.accHolderString="Deepak";
//		acnt.Accno= 233029;
//		acnt.amount = 29320d;
		
		acnt.setAccno(123);
		acnt.setAccHolderString("Deepak");
		acnt.setAmount(20495950d);
		
		System.out.println(acnt.getAccno());
		System.out.println(acnt.getAccHolderString());
		System.out.println(acnt.getAmount());
	}

}
