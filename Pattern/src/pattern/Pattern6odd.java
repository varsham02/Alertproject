/*
 ----*		1*
 ---***		3* (* is increased 2 times so formula is (2*i)-1)
 --*****	5*
 -*******	7*
 *********	9*
 
 */

package pattern;
import java.util.Scanner;
public class Pattern6odd
{
public static void main(String[] args) 
{
	Scanner s=new Scanner(System.in);
	System.out.println("how many rows");
	int n=s.nextInt();
int count=1;
for(int i=1;i<=n;i++)
{
	for(int j=1;j<=n-1;j++)
	{
		System.out.print(" ");
	}
	
	for(int j=1;j<=i;j++)
	{
		if(j%2!=0)
		{
	for(int k=1;k<=count;k++)
	{
        System.out.print("*");
	}
		count++;
		}
		
		
        
	}
	System.out.println(" ");

}
}
}

