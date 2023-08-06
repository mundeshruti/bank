package Com.acc;

public class Account {
	
	private int acc_no = 1234567;
	private String name = "shrutika";
	private static double balance= 2000;
	
	
	public void setacc_no( int acc_no) {
		this.acc_no = acc_no;
	}
	public int getAcc_no() {
		return acc_no;
	}
	public void setName (String name) {
		this.name = name ;
	}
	public String getName() {
		return name;
	}   
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public double getBalance() {
		return balance;
	}
	@Override
	public String toString() {
		return "Account [acc_no=" + acc_no + ", name=" + name + ", Balance=" + balance + "]";
	}
	
	
		
}
