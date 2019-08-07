package comm.fahim;

public abstract class Employee {
	private double defaultSalary;
	public double getDefaultSalary() {
		return defaultSalary;
	}
	public void setDefaultSalary(double defaultSalary) {
		this.defaultSalary = defaultSalary;
	}
	abstract double getSalaryAmount();
	
	public Employee(double defaultSalary) {
		super();
		this.defaultSalary = defaultSalary;
	}

}