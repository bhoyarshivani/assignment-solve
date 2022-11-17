package hospital;
public class Patient{
	
	private double patientId;
	private int bedType;
	private int noofDays;

	public Patient(){
		
		this(121, 1, 30);
	}

	public Patient(double pId, int bT, int nod){
	
		patientId = pId;
		bedType = bT;
		noofDays = nod;
	}

	public double getPatientid(){
	
		return patientId;
	}

	public void setPatientid(double value){
	
		patientId = value;
	}
	
	public double getBedtype(){
	
		return bedType;
	}

	public void setBedtype(int value){
	
		bedType = value;
	}
	public double getNoofdays(){
	
		return noofDays;
	}

	public void setNoofdays(int value){
	
		noofDays = value;
	}

	public double getBillAmount(){
		
		double price = 0;
		double amount;

		if(bedType == 1)
			price = 500;
		if(bedType == 2)
			price = 350;
		if(bedType == 3)
			price = 200;
		
		amount = noofDays * price;
		return amount;
	}

}
