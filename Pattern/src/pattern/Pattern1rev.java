/*

 			*****
 			****
 			***
 			***
 			*
*/
package pattern;
import java.util.Scanner;
public class Pattern1rev
{
public static void main(String[] args) 
{
Scanner s=new Scanner(System.in);	
System.out.println("How many rows of star to print");
int n=s.nextInt();
for(int i=n;i>=1;i--)
{
	
for(int j=i;j>=1;j--)
{
	System.out.print("*");
}
System.out.println(" ");
}
}
}

