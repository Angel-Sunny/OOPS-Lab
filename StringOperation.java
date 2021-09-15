import  java.util.Scanner;
public class StringOperation {
    public static void main(String[] args) {
      String s1, s2,s3,s4;
      int ch,len;
      Scanner reader = new Scanner(System.in);
      while(true)
        {
        System.out.print("\n STRING OPERATIONS\n 1.Length\n 2.Concat\n 3.Compare\n 4.Copy\n 5.Exit\nEnter your choice: ");
        ch=reader.nextInt();
        switch (ch){
            case 1:System.out.print("Enter first string: ");
                   s1 = reader.next();
                   len=s1.length();
                   System.out.print("String length is: "+len);
                   break;
            case 2:System.out.print("Enter first string: ");
                   s1 = reader.next();
                   System.out.print("Enter second string: ");
                   s2 = reader.next();
                   s4=s1.concat(s2);
                   // s4=s1.concat(" ").concat(s2);   with space
                   s3=s1 + s2;
                   System.out.print("Concatenated String: "+s3);
                   System.out.print("\nConcatination using library function: "+s4);
                   break;
            case 3:System.out.print("Enter first string: ");
                   s1 = reader.next();
                   System.out.print("Enter second string: ");
                   s2 = reader.next();
                   System.out.println("\nCompare using library function: "+s1.equals(s2));
                   if(!(s1.equals(s2)))
                      System.out.println("Strings are not equals");
                   else
                      System.out.println("Both Strings are equals");
                  break;
            case 4:System.out.print("Enter first string: ");
                    s1 = reader.next();
                    System.out.print("Enter second string: ");
                    s2 = reader.next();
                   s2=s1;
                   System.out.print("The copied string is : "+s2);
                   break;
            case 5:return ;
            default:System.out.print("Invalid choice");
                    break;
        }
        System.out.println();
      }
    }
}
