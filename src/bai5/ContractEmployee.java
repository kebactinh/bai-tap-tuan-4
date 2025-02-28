package bai5;

public class ContractEmployee implements SalaryStrategy {
	private double hourlyRate;
	private int hoursWorked;

	@Override
	public double calculateSalary() {
		return hourlyRate * hoursWorked;
	}
}
