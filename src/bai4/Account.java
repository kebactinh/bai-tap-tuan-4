package bai4;

public class Account {
	private double balance;

	public double withdraw(double amount) throws BalanceException {
		if (balance >= amount) {
			balance -= amount;
			return amount;
		} else {
			throw new BalanceException("message error");
		}
	}
}
