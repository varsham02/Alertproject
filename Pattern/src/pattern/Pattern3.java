/*
    ---*	Here means space
    --**
    -***
    ****
*/

package pattern;
import java.util.Scanner;
public class Pattern3 
{

	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("How many rows to print");
		int n=s.nextInt();
		for(int i=1;i<=n;i++)		/* loop for rows */
		{
			for(int j=1;j<=(n-i);j++)		/* for space*/
			{
				System.out.print(" ");			
			}
			for(int j=1;j<=i;j++)			/* loop for printing "*" */
			{
				System.out.print("*");		/* print to print on same line */
			}
			System.out.println(" ");		/* to print on next line*/
		}
	}
}
