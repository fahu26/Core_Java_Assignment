package comm.fahim;

public class IncomeTaxCalculation {

	public double taxCalculator(double annualIncome) {
		double taxInterest=0;
		if(annualIncome>=0 && annualIncome<=180000) {
			taxInterest=0;
		}
		else if(annualIncome>=181001 && annualIncome<=300000) {
			taxInterest=annualIncome * 0.1;
		}
		else if(annualIncome>=300001 && annualIncome<=500000) {
			taxInterest=annualIncome * 0.2;
		}
		else if(annualIncome>=500001 && annualIncome<=1000000) {
			taxInterest=annualIncome * 0.3;	
		}
		else {
			System.out.println("Tax Slab Not Defined");
			taxInterest=0;
		}
		return taxInterest;
	}
}
