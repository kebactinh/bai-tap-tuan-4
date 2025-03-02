package bai5;

public class PartTimeEmployee implements SalaryStrategy {
	private final double PART_TIME_DISCOUNT = 0.8;

	private SalaryStrategy salaryStrategy;

	public PartTimeEmployee(SalaryStrategy salaryStrategy) {
		this.salaryStrategy = salaryStrategy;
	}

	@Override
	public double calculateSalary() {
		return salaryStrategy.calculateSalary() * PART_TIME_DISCOUNT; // Giảm 20% so với nhân viên hợp đồng
	}
}
