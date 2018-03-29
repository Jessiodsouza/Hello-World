
public class Bank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Account baccount=new Account(1612,"Jessio",1000);
		Account baccount1 = new Account(1630,"Shreyash",1000);
		baccount.DisplayAccountDetails();
		//System.out.println("Balance: "+baccount.getBalance());
		
		baccount.Deposit(3000);
		//System.out.println("Balance after Deposit: "+baccount.getBalance());
		
		baccount.Withdraw(1000);
		
		//System.out.println("Balance after Withdraw: "+baccount.getBalance());
		
		baccount.transfer(baccount1,1500);
	}
}
