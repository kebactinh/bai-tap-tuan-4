package bai1;

import java.time.LocalDate;

public class Bai1 {
	public boolean isEligibleForDiscount(Customer customer) {
		return isVipCustomer(customer) && hasHighPurchase(customer) && isLoyalCustomer(customer);
	}

	private boolean isVipCustomer(Customer customer) {
		return customer.isVipCustomer();
	}

	private boolean hasHighPurchase(Customer customer) {
		return customer.getPurchaseAmount() > 500;
	}

	private boolean isLoyalCustomer(Customer customer) {
		return customer.getJoinDate().before(LocalDate.now().minusYears(2));
	}
}
