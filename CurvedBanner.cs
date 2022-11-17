namespace BankLib;

public class CurvedBanner : Banner
{
    public int radius { get; set; }
    public CurvedBanner( float w,float h,int radius) : base(w,h)
    {
     this.radius = radius ;
    }

    public override double area()
    {
        double area = base.area();

        return area - 0.80 * radius * radius;
        
    }
}