package common;

public class Linseq implements Seq {

	private float current;
	private float difference;

	public Linseq(float ct, float diff){
	
		current = ct;
		difference = diff;
	}

	public double next() {
	
		double term = current;
		current += difference;
		return term;
	}
}
