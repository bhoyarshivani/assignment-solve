class Emptest {


	public static void main (String[] args){
	
	int i= Integer.parseInt(args[0]);

	int a = Integer.parseInt(args[1]);
	double r= Double.parseDouble(args[2]);
	int h= Integer.parseInt(args[3]);

	Employee E1 = new Employee(i,a,r,h);
	System.out.printf("Employee salary is : %.2f%n",E1.getIncome() );

	E1.printInfo();
	
	
	
	}

}
