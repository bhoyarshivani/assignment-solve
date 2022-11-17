package hospital;
public class InHousePatient extends Patient{
	
		private double discount;

		public InHousePatient(double pid, int bt, int dd, double dsc){
			super(pid, bt, dd);
			discount = dsc;
		}

		public double getDiscount(){
		
			return discount;
		}

		public double getBillAmount(){
		
			double amount = super.getBillAmount();

				return amount * 0.9;

		
		}

}
