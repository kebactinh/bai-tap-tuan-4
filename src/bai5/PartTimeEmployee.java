package bai5;

public class PartTimeEmployee implements SalaryStrategy {
	private double hourlyRate;
	private int hoursWorked;

	@Override
	public double calculateSalary() {
		return hourlyRate * hoursWorked * 0.8; // Giảm 20% so với nhân viên hợp đồng
	}
}
