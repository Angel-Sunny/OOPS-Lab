import java.util.Scanner;
public class Factorial
{
 public static void main(String args[])
 {
  Scanner x=new Scanner(System.in);
  System.out.print("Enter the number: ");
  int num=x.nextInt();
  int fact=1;
  for(int i=num;i>0;i--)
  {
    fact=fact*i;
  }
  System.out.println("Factorial of "+num+" is "+fact);
 }
}