package common;

public class Powseq implements Seq,Reset{

	private float current;
	private float ratio;

	public Powseq(float c, float r){
		current = c;
		ratio = r;
	}

	public double next() {
	
		double term = current;
		current *= ratio;
		return term;

	}

	public void reset(){
	current = 1;
	}
}
