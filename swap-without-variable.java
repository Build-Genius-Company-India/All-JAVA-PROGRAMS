// wap to swap two numbers without using third variable
import java.util.*;
public class swapwithoutvariable
{
    public static void main()
    {
     Scanner sc = new Scanner (System.in);   
     System.out.println("ENTER THE TWO NUMBERS");
     int a = sc.nextInt();
     int b = sc.nextInt();
     System.out.println("before swap a ="+a+" b ="+b);
     a= a+b;
     b=a-b;
     a=a-b;
     System.out.println("AFTER SWAP -- A="+a+" B = "+b);
    }
}
