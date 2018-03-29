
public class Account {
	int acnumber;
	String name;
	int balance;
	
	public int getAcnumber() {
		return acnumber;
	}
	public String getName() {
		return name;
	}
	public int getBalance() {
		return balance;
	}

	public Account(int acnum,String name,int bal)
	{
		this.acnumber=acnum;
		this.name=name;
		this.balance=bal;
	}
	
	public void Deposit(int bal)
	{
		//this.acnumber=acnum;
		System.out.println("\nDeposit Amount: "+bal);
		this.balance=balance+bal;
		System.out.println("Balance after Deposit: "+getBalance());
	}
	
	public boolean Withdraw(int bal)
	{
		//this.acnumber=acnum;
		System.out.println("\nWithdraw Amount: "+bal);
		if(balance-bal>=1000){
		this.balance=balance-bal;
		System.out.println("Withdraw Successful");
		System.out.println("Balance after Withdraw: "+getBalance());
		return true;
		}
		else{
			System.out.println("Insufficient Balance");
		return false;
		}
	}
	
	public void DisplayAccountDetails()
	{
		System.out.println("_____Account Details_____");
		System.out.println("Account No: "+getAcnumber());
		System.out.println("Account Name: "+getName());
		System.out.println("Account Balance: "+getBalance());
		System.out.println("_________________________\n");
	}
	
	
	public void transfer(Account baccount1, int amt) {
		// TODO Auto-generated method stub
		System.out.println("\n\n___________________________________________");
		System.out.println("Transfer Details between:"+getName()+" And "+baccount1.getName());
		
		System.out.println("\n"+getName()+" Balance Before Transfer: "+getBalance());
		//System.out.println(baccount1.getName()+" Balance Before Transfer: "+baccount1.getBalance());
		
		if(Withdraw(amt)==true)
		{
			baccount1.Deposit(amt);
			System.out.println("\n"+getName()+" Balance after Transfer: "+getBalance());
			int GST=((amt/100)*5);
			baccount1.balance=baccount1.balance-GST;
			System.out.println("GST Amount: "+GST);
			//System.out.println(baccount1.getName()+" Balance after Transfer: "+baccount1.getBalance());
			System.out.println("____________Transfer Sucessful____________");
		}
		else
			System.out.println("Transfer Failed Due to Insufficient Balance");
		System.out.println("___________________________________________");
	}
}

