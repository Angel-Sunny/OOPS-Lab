// co3-5
import java.util.Scanner;
class student1 {
int rollno;
float m1;
float m2;


    void data1(){
       Scanner s = new Scanner(System.in);
       System.out.print("Enter the roll no ");
       rollno=s.nextInt();
     }
    void display1()
    {
       System.out.println("Rollno is "+rollno);
    }
    void getmark()

    {
   	Scanner s = new Scanner(System.in);
   	System.out.print("Enter mark 1 ");
       m1=s.nextFloat();
       System.out.print("Enter mark 2 ");
       m2=s.nextFloat();
     }
    void putmark()
    {
   	System.out.println("mark 1= "+m1);
   	System.out.println("mark 2= "+m2);
    }
 }
 interface sports
 {
  float sportswt=6.0f;
  void putwt();
 }
 class result1 extends student1 implements sports
 {
  float total;
  public void putwt()
  {
   System.out.println("sports mark = "+sportswt);
  }
 void display()
 {
  total=m1+m2+sportswt;
  System.out.println("Total score of Roll no "+rollno +" is "+total);
 }
}
class Result
 {
  public static void main(String args[])
  {
   result1 r=new result1();
   r.data1();
   r.display1();
   r.getmark();
   r.putmark();
   r.putwt();
   r.display();
  }
}
