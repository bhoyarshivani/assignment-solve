class MathUtil {

//	private int num1;
//	private int num2;

//	public MathUtil(int n1) {

//		num1=n1;
//		num2=n2;
	
	public static boolean isEven(int n1) {
		
		return (n1 % 2 == 0) ? true : false;
	}


	public static boolean isOdd(int n1) {
	
		return (n1 % 2 != 0) ? true : false;
	}


	public static boolean isPrime(int n1) {
	//	int term =0;
	//	int count = 0;
		int m =0;
		if (n1 == 1)
			return false;
		if ((n1 == 2) || (n1 == 3)) 
			return true;
		if ((n1 %2)==0)
			return false;
	
		for (m=3 ; m*m <=n1;m+=2)
		{
		if((n1%m)==0)
			return false;
		}return true;
	}

	public static int countPrime (int n1, int n2) {
		int term;
		int count =0;
		int m= 0;
		for(term = n1; term<=n2; ++term)
		{	if (isPrime(term) == true)
			count += 1;
			else
			 count+=0;

		}
		return count;

             }

	public static int count(int n1){
		int a = 1;
		int b = n1;
		int c = 0;

		do
		{
			a = a * 10;
			c = c +1;
		}while(a <= b);
		return c;
	}
	
	public static int rev(int n2){
		int rem, rev = 0;
		while(n2 <= 0)
		{
			rem = n2 % 10;
			rev =(rev * 10) + rem;
			n2 = n2 / 10;
		}
		return rev;
	}
	}
