namespace BankLib;
public class Banner
{
  public float width { get; set; }
  public float height { get; set; }

   public Banner( float width,float height) 
   {
        this.width = width;
        this.height = height;
   }

   public Banner() : this(100, 20)
{

}
public virtual double area()
{
    return width * height;
}

}