import hospital.*;
import java.util.Scanner;
public class Patienttest{

	public static void main(String[] args){
		/*
		double id = Double.parseDouble(args[0]);
		int type = Integer.parseInt(args[1]);
		int days = Integer.parseInt(args[2]);
		*/

		Scanner Myscan = new Scanner(System.in);
		System.out.println("Enter the patient ID / BedTtype / NoOfDays ");
		
		double id = Myscan.nextDouble();
		int type = Myscan.nextInt();
		int days = Myscan.nextInt();
		
		Patient p = new Patient(id,type,days);

	//	p.setPatientid(131);
	//	p.setBedtype(2);
	//	p.setNoofdays(50);
		
		//double d = 0;
		
		InHousePatient ihp = new InHousePatient(id, type, days, 0);
		//InHousePatient ihp = new InHousePatient(id, type, days, d);

		System.out.printf("Billing amount is : %.2f%n",p.getBillAmount());
		
		System.out.printf("Billing amount after discount is : %.2f%n",ihp.getBillAmount());
	}




}
