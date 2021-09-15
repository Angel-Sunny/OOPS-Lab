import java.util.Scanner;
import java.lang.Math;
public class SumAverage
{
public static void main(String args[])
{
  int i,sum=0;
 Scanner x=new Scanner(System.in);
 System.out.print("Enter the size  of array  ");
 int l=x.nextInt();
 int a[]=new int[l];
 System.out.println("Enter the elements ");
 for(i=0;i<l;i++)
 {
   a[i]=x.nextInt();
   sum=sum+a[i];
 }
 System.out.print("Elements are ");
 for(i=0;i<l;i++)
    System.out.print(" " +a[i]);
  System.out.println();
  double avg=(double)sum/l;
  System.out.println("Sum of elements : "+sum);
  System.out.println("Average of elements : "+avg);

}
}
