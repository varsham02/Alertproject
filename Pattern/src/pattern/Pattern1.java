/*

 		*
 		**
 		***
 		****
 */
package pattern;
import java.util.Scanner;
public class Pattern1
{
public static void main(String[] args) 
{
Scanner s=new Scanner(System.in);	
System.out.println("How many rows of star to print");
int n=s.nextInt();

for(int i=1;i<=n;i++)
{
	
for(int j=1;j<=i;j++)
{
	System.out.print("*");
}
System.out.println("");
}
}
}

