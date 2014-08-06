package asg08.account;




public abstract class Account {
	protected int balance;
	protected int transactions;

	public Account(int initialBalance) throws InvalidAmountException {
		if (initialBalance <= 0) {
			throw new InvalidAmountException("Balance is must geater than 0!");
		}
		balance = initialBalance;
	}

	public int getBalance() {
		return balance;
	}

	public int getTransactionCount() {
		return transactions;
	}

	public void deposit(int amount) {
		balance += amount;
		transactions++;
	}

	public void withdraw(int amount) throws OverWithdrawException {

		balance -= amount;
		transactions++;
	}

	public abstract int endMonthCharge();

	public void endMonth() {
		balance -= endMonthCharge();
		transactions = 0;
	}
}