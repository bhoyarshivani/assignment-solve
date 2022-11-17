using BankLib;

class Program
{
    public static double price(Banner info, int copies)
    {
        double rate = copies > 5 ? 0.70 : 0.90;
        return rate * copies;
    }
    
    public static void Main(string[] args)
    {
        float f = float.Parse(args[0]);
        float w = float.Parse(args[1]);

        Banner b  = new Banner(f,w);
        Console.WriteLine("size of banner = {0}", b.area());
        Console.WriteLine("price of banner = {0}", price(b, 5));

        CurvedBanner cb = new CurvedBanner(f,w,10);
         Console.WriteLine("size of CurvedBanner = {0}", cb.area());
         Console.WriteLine("price of banner = {0}", price(cb, 15));

    }
}
