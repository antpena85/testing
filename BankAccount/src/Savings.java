
public class Savings extends BankAccount 
{
//	private int checks;
	
	public Savings(int checks) 
	{
//		setChecks(checks);	//TODO: change to APR	
	}

//	public int getChecks() 
//	{
//		return checks;
//	}
//
//	public void setChecks(int checks) 
//	{
//		this.checks = checks;
//	}
	
	@Override
	public double withdraw(double amountToRemove) 
	{
		if (amountToRemove<=super.accountBalance)
		{
			setAccountBalance(super.accountBalance -= amountToRemove);
			return accountBalance;
		}
		else 
			System.out.println("Insufficiant funds");
		return accountBalance;
	}
//	public int nextCheck()
//	{
//		checks--;
//		return checks;
//	}
//	public int nextCheck(int checknum)
//	{
//		checks-=checknum;
//		return checks;
//	}

}
