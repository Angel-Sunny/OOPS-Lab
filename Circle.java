import java.util.Scanner;
public class Circle
{
   double r;
   public double cir()
  {
    double c=2*3.14*r;
    System.out.println("Circumference of circle= "+c);
    return 0;  //2*3.14*r;
  }
  public double area()
  {
    double a=3.14*r*r;
    System.out.println("Area of circle= "+a);
    return 0 ; //3.14*r*r;
  }
  public static void main(String[] args)
  {
    Scanner  sc=new Scanner(System.in);
    Circle aCircle;
    aCircle=new Circle();
    System.out.print("Enter the radius : ");
    aCircle.r=sc.nextInt();
    //double ar=
    aCircle.area();
    //double cir=
    aCircle.cir();
    //System.out.println("Area of circle= "+ar);
    //System.out.println("Circumference of circle= "+cir);
}
}
