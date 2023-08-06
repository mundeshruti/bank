package Com.logic;

import Com.acc.Account;

public class Deposite {
	Account ac = new Account ();
	
	public Deposite(double amt) {
		if(amt>0) {
			double am = ac.getBalance()+ amt;
			ac.setBalance(am);
			System.out.println(ac);
		}
	}

}
