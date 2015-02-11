
public class Test {
	
	public static void main(String[] args) {
		
//		BankAccount account = new BankAccount();
//		account.setAccountNum();
//		account.setAccountBalance(5000.32);
//		System.out.println("Account ID is "+account.getAccountNum()+" with a starting balance of $"+account.getAccountBalance());
//		
//		BankAccount account1 = new BankAccount();
//		account.setAccountNum();
//		account1.setAccountBalance(30.50);
//		System.out.println("Account ID is "+account1.getAccountNum()+" with a starting balance of $"+account1.getAccountBalance());
//		
//		account.withdraw(100.24);
//		System.out.printf("New balance is $%.2f \n",account.getAccountBalance());
//		account1.Deposit(100.24);
//		System.out.printf("New balance is $%.2f \n",account1.getAccountBalance());
//		
//		System.out.println("Account ID is "+account.getAccountNum()+" with a starting balance of $"+account.getAccountBalance());
		
		
		Savings account = new Savings(500);
		account.setAccountNum();
		account.setAccountBalance(500.32);
		account.withdraw(5.05);
//		System.out.printf("Account ID is %d with a current balance of $%.2f and currently has %d checks\n", 
//				account.getAccountNum(),account.getAccountBalance(),account.getChecks());
//		System.out.println(account.nextCheck());
//		System.out.println(account.nextCheck(99));
				
	}

}
