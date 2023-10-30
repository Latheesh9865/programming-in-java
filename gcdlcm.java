import java.util.*;
class gcdlcm
{
 public static void main(String args[])
{
 int n1,n2,i;
   Scanner s=new Scanner(System.in);
    System.out.println("enter the 2 numbers");
   n1=s.nextInt();
   n2=s.nextInt();
   for(i=2;i<=n1&&i<=n2;i++)
{
if(n1%i==0&&n2%i==0)
{
 
System.out.println(i);}}
}}