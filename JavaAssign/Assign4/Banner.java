class Banner {
	
	private float width;
	private float height;
//	private Geometry shape;

	public Banner()	{
	
		this(12.5f, 20.6f);
	}

	public Banner(float w, float h) {
	
		width = w;
		height = h;
	}

	public float getWidth() {
	
		return width;
	}

	public float getHeight() {
	
		return height;
	}

	public void setWidth(float w1) {
	
		width = w1;
	}

	public void setHeight(float h1) {
	
		height = h1;
	}
	

	public double area() {
	
//	return width * height;
//	switch (shape){

//		case TRAIANGULAR :
//		       return 0.5 * width * height;
	
//		case ELLIPTICAL :
//			return 3.14 * width * height / 4;
	
//		default :
			return width * height;		
		}		
	
}
