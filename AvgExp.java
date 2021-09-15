import java.util.Scanner;
class MyException extends Exception
{
    public MyException(String str)
    {
        System.out.println(str);
    }
}
public class AvgExp {
    public static void main(String[] args){
        try {
            int i, n, sum=0;
            float average=0;
            int elem[]=new int[40];
            Scanner reader = new Scanner(System.in);
            System.out.print("Enter number of elements: ");
            n = reader.nextInt();
            System.out.println("Enter elements: ");
            for (i = 0; i < n; i++)
             {
                elem[i] = reader.nextInt();
              }
            for(i=0;i<n;i++)
            {
                if (elem[i] >= 0)
                 {
                    sum = elem[i] + sum;
                }
                else
                    throw new MyException("Negative number is entered");
            }
                average = sum/n;
                System.out.print("\nAverage is " +average);
        }
        catch (MyException m){}
    }
}
