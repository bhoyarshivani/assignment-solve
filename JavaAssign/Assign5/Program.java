import common.*;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
	
		Scanner Myscan = new Scanner(System.in);
		System.out.println("Enter values of current, difference, ratio, count");

		float c = Myscan.nextFloat();
		float d = Myscan.nextFloat();
		float r = Myscan.nextFloat();
		int ct = Myscan.nextInt();

		Linseq l = new Linseq(c, d);
		Powseq p = new Powseq(c, r);

		Powseq p2 = new Powseq(c, r);
		System.out.printf("Sum of linear sequence = %s%n",l.sum(ct));

		System.out.printf("Sum of power sequence = %s%n",p.sum(ct));

		System.out.printf("Sum of power sequence = %s%n",p2.sum(ct));
	}
}
