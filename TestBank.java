package Com.run;
import Com.acc.*; 
import Com.logic.*;
public class TestBank 
{
	public static void main(String[] args) {
		Account ac = new Account ();
		System.out.println(ac);
		Deposite d =new Deposite(1000);
		
		Withdraw w =new Withdraw(2000, 1234);
	}

	
}
