public class HomeLoan extends Loan implements Discountable {

	public HomeLoan(double principle, double period) {
	
		super(principle, period);
	}

	public double getRate() {
	
		double rate = 0;
		
		if(getPrinciple() <= 2000000)
			return rate = 0.10;
		else
			return rate = 0.11;
	}
	
	
}
