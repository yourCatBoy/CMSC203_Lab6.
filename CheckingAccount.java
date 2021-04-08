
public class CheckingAccount extends BankAccount{
	
	
	// Setting check clearing fee in protected access for outside of package access
	protected static final double FEE = 0.15;
	
	
	// Checking method with param name and amount
	public CheckingAccount(String name, double amount) {
		super(name,amount);
		setAccountNumber(getAccountNumber() + "-10");
		
	}
	
	
	@Override
	public boolean withdraw(double amount) {
		//check if the withdrawl request is lesser then the total balance
		if(getBalance() < amount) {
			//if true then withdraw with and post clearing fee
			setBalance(getBalance() - amount - FEE);
			return true;
		}
		return false;
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
