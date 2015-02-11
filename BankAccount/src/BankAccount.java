public class BankAccount {
	public static int nextAccountID = 1000;
	private int accountNum;
	protected double accountBalance;

	public BankAccount() {
		this.accountNum = nextAccountID;
		nextAccountID += 5;
	}

	public double withdraw(double amountToRemove) {
		setAccountBalance(accountBalance -= amountToRemove);
		return accountBalance;
	}

	public double Deposit(double amountToAdd) {
		setAccountBalance(accountBalance += amountToAdd);
		return accountBalance;
	}

	public static int getNextAccountID() {
		return nextAccountID;
	}

	public static void setNextAccountID(int nextAccountID) {
		BankAccount.nextAccountID = nextAccountID;
	}

	public int getAccountNum() {
		return accountNum;
	}

	public void setAccountNum() {
		this.accountNum = accountNum;
	}

	public double getAccountBalance() {
		return accountBalance;
	}

	public void setAccountBalance(double accountBalance) {
		this.accountBalance = accountBalance;
	}
	
	public enum accountType
	{
		PERSONAL, BUSINESSS
	}

}
