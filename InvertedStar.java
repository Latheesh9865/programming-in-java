import java.util.Scanner;
class InvertedStar
{
public static void main(String args[])
{
	Scanner s=new Scanner(System.in);
	int i,n,j,k;
	System.out.println("enter n:");
	n=s.nextInt();
	for(i=n-1;i>=1;i--)
	{
		for(k=0;k<=n-i;k++)
		{
			System.out.print(" ");
		}
		for(j=1;j<=i;j++)
		{
			System.out.print("* ");
                }
		System.out.println();
	}

}
}
