package comm.fahim;

public class Labour extends Employee {
private double overTime;

public double getOverTime() {
	return overTime;
}

public void setOverTime(double overTime) {
	this.overTime = overTime;
}

public Labour(double defaultSalary, double overTime) {
	super(defaultSalary);
	this.overTime = overTime;
}

@Override
double getSalaryAmount() {
	return getDefaultSalary()+getOverTime();
}

}
