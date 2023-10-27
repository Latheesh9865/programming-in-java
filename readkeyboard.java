import java.lang.*;
import java.util.*;
class readkeyboard
{
    public static void main(String args[])
    {
     Scanner s=new Scanner(System.in);
     
     //intx=s.nextInt();
      //float x=s.nextFloat();
     //double x=s.nextDouble();
       //String x=s.next();
       //String x=s.nextline();
      

        s.useRadix(2);
        int x=s.nextInt();
      System.out.println("the no. is "+ x);
}}