package bai1;

import java.time.LocalDate;

public class CustomerService {
	private final double HIGH_PURCHASE_THRESHOLD = 500;
	private final int LOYAL_CUSTOMER_YEARS = 2;

	public boolean isEligibleForDiscount(Customer customer) {
		return isVipCustomer(customer) && hasHighPurchase(customer) && isLoyalCustomer(customer);
	}

	private boolean isVipCustomer(Customer customer) {
		return customer.isVipCustomer();
	}

	private boolean hasHighPurchase(Customer customer) {
		return customer.getPurchaseAmount() > HIGH_PURCHASE_THRESHOLD;
	}

	private boolean isLoyalCustomer(Customer customer) {
		return customer.getJoinDate().isBefore(LocalDate.now().minusYears(LOYAL_CUSTOMER_YEARS));
	}
}
