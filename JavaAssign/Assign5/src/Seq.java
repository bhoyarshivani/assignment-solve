package common;

public interface Seq {

	double next();

	default double sum(int count) {
	
		double total = 0;

		for(int i=1; i<=count; ++i) {
		
			total += next();
		}
		return total;
	}
}
