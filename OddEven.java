import java.lang.Math;
import java.util.Scanner;
public class OddEven
{
  public static void main(String[] args) {
    Scanner x=new Scanner(System.in);
    System.out.print("Enter the number : ");
    int num=x.nextInt();
    if(num%2==0)
      System.out.println("The number "+num+" is Even");
    else
      System.out.println("The number "+num+" is Odd");
}
}
