/*
    cross pattern  
 	row	    col 12345
 		1	    *- -*   (1,5)
 		2	    -*-*    (2,4)
 		3		--*--   (3,3)
 		4		-*-*-   (4,2)     addition =6  (i+j)==(n+1)
 		5		*- -*   (5,1)
 			   
 

 */



package pattern;
import java.util.Scanner;
public class Pattern7 
{
public static void main(String[] args) 
{
	Scanner s=new Scanner(System.in);
	System.out.println("How many no. of rows");
	int n=s.nextInt();
	for(int i=1;i<=n;i++)
	{
		for(int j=1;j<=n;j++)
		{
			if((i==j)||(i+j)==(n+1))
			{
			System.out.print("*");
			}
			else
			{
				
				System.out.print(" ");
			}
		}
		System.out.println(" ");
	}
	
}
}
