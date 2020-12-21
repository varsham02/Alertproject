package pattern;

import java.util.Scanner;

public class Pattern4
{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("How many rows to print");
		int n=s.nextInt();
		for(int i=1;i<=n;i++)		/* loop for rows */
		{
			for(int j=1;j<=(i-1);j++)		/* for space where 1st row has zero space 2nd has 1 space so i-1*/
			{
				System.out.print(" ");			
			}
			for(int j=1;j<=(n+1-i);j++)			/* loop for printing "*" which is eg.5 in 1st row 4 in 2nd row so (n+1-i)ie.6-i */
			{
				System.out.print("*");		/* print to print on same line */
			}
			System.out.println(" ");		/* to print on next line*/
		}
	}
}
