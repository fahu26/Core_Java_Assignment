package comm.fahim;

public class Manager extends Employee {

private double incentive;
	public double getIncentive() {
	return incentive;
}
public void setIncentive(double incentive) {
	this.incentive = incentive;
}
public Manager(double defaultSalary, double incentive) {
	super(defaultSalary);
	this.incentive = incentive;
}
	@Override
	double getSalaryAmount() {
		return getIncentive()+getDefaultSalary();
	}

}
