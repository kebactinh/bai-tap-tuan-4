package bai5;

public class FullTimeEmployee implements SalaryStrategy {
	private double monthlySalary;

	public FullTimeEmployee(double monthlySalary) {
		this.monthlySalary = monthlySalary;
	}

	@Override
	public double calculateSalary() {
		return monthlySalary;
	}
}
