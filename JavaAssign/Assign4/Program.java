import java.util.Scanner;


class Program {

		 static double bannerPrice(Banner info, int copies) {
		
			float rate = copies < 5 ? 0.60f : 0.40f;
			return rate * copies * info.area();
		 }

		public static void main(String[] args) {
		Scanner Myscan = new Scanner(System.in);
		System.out.println("Enter Banner dimenssions  width ,height ,radius ");
		float w = Myscan.nextFloat();
		float h = Myscan.nextFloat();
		int r = Myscan.nextInt();
//		float w = Float.parseFloat(args[0]);
//		float h = Float.parseFloat(args[1]);		
//		int r = Integer.parseInt(args[2]);

		Banner b = new Banner(w, h);

//		b.setWidth(10.00f);
//		b.setHeight(20.00f);
//              Curvedbanner cb = new Curvedbanner(10.00, 20.00, 5);

		Curvedbanner cb = new Curvedbanner(w, h, r);
		
		System.out.printf("Size of banner = %.2f sqcm",b.area());
		System.out.printf("\nSize of curvedbanner = %.2f sqcm",cb.area());
		System.out.println(" \n----------------------------------------------------------------");
 		System.out.printf("Price of banner = %.2f",bannerPrice(b, 4));
		System.out.printf("\nPrice of curvedbanner = %.2f\n",bannerPrice(cb,6));
		}



}

