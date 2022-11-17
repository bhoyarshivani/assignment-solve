class Employee {
	private int id;
	private int age;
	private double rate;
	private int hours;


	public Employee (int i1, int a1,double r1, int h1){
		id = i1;
		age= a1;

		rate = r1;
		hours = h1;
	}
	public double getIncome(){
		
		double o= overTime();
			return (rate*hours)+o ;
	}
	public double overTime(){
	
		if (hours > 180)
			return (hours-180)*100;
		else 
			return 0;	
	}
	public void printInfo(){
		{
		System.out.printf("Employee is id = %d%n",id);
		System.out.printf("Employee age is = %d%n",age);
		System.out.printf("Employee rate is = %.2f%n",rate);
		System.out.printf("Employee working hours are  = %d%n",hours);
		}
	}
}
