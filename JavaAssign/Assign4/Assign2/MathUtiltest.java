class MathUtiltest {

	public static void main(String[] args) {
		int n1 = Integer.parseInt(args[0]);

		int n2 = Integer.parseInt(args[1]);
		
	//	MathUtil M1 = new MathUtil(n1);
		boolean i = MathUtil.isEven(n1);

		if (i==true)
		System.out.printf("%d is even number%n",n1);
		else 
	
		System.out.printf("%d is odd number%n",n1);


		i = MathUtil.isOdd(n1);
		if (i==true)
		System.out.printf("%d is ODD number%n",n1);
		else 
		System.out.printf("%d is EVEN number%n",n1);
		
		i = MathUtil.isPrime(n1);
		if (i==true)
		System.out.printf("%d is Prime %n",n1);
		else 
		System.out.printf("%d is Non Prime%n",n1);
		
		System.out.printf("Count of prime nos between %d & %d  is : %d%n",n1,n2, MathUtil.countPrime(n1,n2));

		System.out.printf("Count of digits in %d is = %d%n",n1,MathUtil.count(n1));

		System.out.printf("Reverse of  %d is = %d%n",n2,MathUtil.rev(n2));
	}
}
