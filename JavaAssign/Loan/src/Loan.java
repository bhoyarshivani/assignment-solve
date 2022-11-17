public abstract class Loan {
	
	private double principle;
	private double period;

	public Loan(double principle, double period) {

		this.principle = principle;
		this.period = period;
	}	

	public double getPrinciple() {
	
		return principle;
	}

	public void setPrinciple(double pr) {
	
		principle = pr;
	}

	public double getPeriod() {
	
		return period;
	}

	public void setPeriod(double pd) {
	
		period = pd;
	}

	public abstract double getRate();

	public double getEmi() {
	
		double emi = principle * (1 + getRate() * period / 100) / (12 * period);
		return emi;
	}
}
