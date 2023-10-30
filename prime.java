import java.util.*;
class prime
{
 public static void main(String args[])
{
 int n1,i,count=0;
   Scanner s=new Scanner(System.in);
    System.out.println("enter the numbers");
   n1=s.nextInt();
 for(i=2;i<=n1;i++)
{
if(n1%i==0)
{
count=count+1;
}}
if(count<2){
System.out.println("it is a prime number");}
else
{System.out.println("it is not prime number");}
}}

