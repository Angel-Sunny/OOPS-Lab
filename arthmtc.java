package arithmetic;

interface arthop{
    void add(int x,int y);
    void sub(int x,int y);
    void div(int x,int y);
    void multi();
}
public class arthmtc {
    public void add(int x,int y){
        System.out.println("ADDITION: "+(x+y));
    }
    public void sub(int x,int y){
        System.out.println("SUBTRACTION: "+(x-y));
    }
    public void div(int x,int y){
        System.out.println("DIVISION: "+(x/y));
    }
    public void multi(int x,int y){
        System.out.println("MULTIPLICATION: "+(x*y));
    }
}
/*  =================================================
import arithmetic.*;
import java.util.Scanner;

public class operation {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        int a = reader.nextInt();
        int b = reader.nextInt();
        arthmtc m = new arthmtc();
        m.add(a, b);
        m.sub(a, b);
        m.div(a, b);
        m.multi(a, b);
    }
}
*/
