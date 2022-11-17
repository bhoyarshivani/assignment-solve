class Curvedbanner extends Banner {

	private int radius;

	public Curvedbanner(float w, float h, int r) {
	
		super(w, h);
		radius = r;
	}

	public double area() {
	
		double area = super.area();
		return area - 0.80 * radius * radius;	
	}

}
