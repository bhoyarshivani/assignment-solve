public class PersonalLoan extends Loan {

	public PersonalLoan(double principle, double period) {
	
		super(principle, period);
	}

	public double getRate() {
	
		double rate = 0;

		if(getPrinciple() <= 500000)
			return rate = 0.15;
		else
			return rate = 0.16; 
	}

}
