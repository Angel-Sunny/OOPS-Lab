import java.util.Scanner;
public class NumberName
{
public static void main(String args[])
{
 Scanner x=new Scanner(System.in);
 System.out.print("Enter the number ");
 int num=x.nextInt();
 switch (num) {
  case 1 : System.out.println("1=One");
           break;
  case 2 : System.out.println("2=two");
           break;
  case 3 : System.out.println("3=Three");
           break;
  case 4 : System.out.println("4=Four");
           break;
  case 5 : System.out.println("5=Five");
           break;
  case 6 : System.out.println("6=Six");
           break;
  case 7 : System.out.println("7=Seven");
           break;
  case 8 : System.out.println("8=Eight");
           break;
  case 9 : System.out.println("9=Nine");
           break;
  default:System.out.println("Invalid Selection");
           break;
 }
}
}
