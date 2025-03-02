package bai5;

public class ContractEmployee implements SalaryStrategy {
	private double hourlyRate;

	private int hoursWorked;

	public ContractEmployee(double hourlyRate, int hoursWorked) {
		this.hourlyRate = hourlyRate;
		this.hoursWorked = hoursWorked;
	}

	@Override
	public double calculateSalary() {
		return hourlyRate * hoursWorked;
	}
}
