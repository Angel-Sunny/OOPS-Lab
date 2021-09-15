import java.util.Scanner;
 public class LargestList
 {
  public static void main(String args[])
  {
    int i,max;
    Scanner x=new Scanner(System.in);
    System.out.print("Enter the size of array ");
    int l=x.nextInt();
    int a[]=new int[l];
    System.out.println("Enter the elements ");
    for(i=0;i<l;i++)
    {
      a[i]=x.nextInt();
     }
     System.out.print("Elements are ");
     for(i=0;i<l;i++)
        System.out.print(" " +a[i]);
    System.out.println();
    max=a[0];
    for(i=1;i<l;i++)
    {
    if(max<a[i])
      max=a[i];
    }
    System.out.print("Largest number is "+max);
  }
 }
