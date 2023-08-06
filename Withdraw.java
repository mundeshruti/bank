package Com.logic;

import Com.acc.Account;

public class Withdraw {
	
		Account ac = new Account ();
		
		public Withdraw (double amt , int pin) {
			if(amt<ac.getBalance()&& pin == 1234) {
				double am = ac.getBalance() - amt;
				ac.setBalance(am);
				System.out.println(ac);
			}else if (amt < ac.getBalance() && pin != 1234) {
				System.out.println("wrong pin ");
			}else {
				System.out.println("insufficient balance");
			}

	}

}
