/*
 ----*		1*
 ---***		3* (* is increased 2 times so formula is (2*i)-1)
 --*****	5*
 -*******	7*
 *********	9*
 
 */

package pattern;
import java.util.Scanner;
public class Pattern6 
{
public static void main(String[] args) 
{
	Scanner s=new Scanner(System.in);
	System.out.println("how many rows");
	int n=s.nextInt();

for(int i=1;i<=n;i++)
{
	for(int j=1;j<=n-i;j++)
	{
		
	System.out.print(" ");
	}
	for(int j=1;j<=(2*i)-1;j++)
	{
		
		System.out.print("*");
		
	}
	
	
         System.out.println(" ");
}

}


}

