
public class Test {
	
	public static void main(String[] args) {
		
		BankAccount account = new BankAccount();
		account.setAccountNum();
		account.setAccountBalance(5000.32);
		System.out.println("Account ID is "+account.getAccountNum()+" with a starting balance of $"+account.getAccountBalance());
		
		BankAccount account1 = new BankAccount();
		account.setAccountNum();
		account1.setAccountBalance(30.50);
		System.out.println("Account ID is "+account1.getAccountNum()+" with a starting balance of $"+account1.getAccountBalance());
		
		account.withdraw(100.24);
		System.out.printf("New balance is $%.2f \n",account.getAccountBalance());
		account1.Deposit(100.24);
		System.out.printf("New balance is $%.2f \n",account1.getAccountBalance());
		
		System.out.println("Account ID is "+account.getAccountNum()+" with a starting balance of $"+account.getAccountBalance());
		
		
	}

}
