//4) Factorial Program in Java
package basic.problems;
import java.util.Scanner;
public class FactorialProgram 
{
	public static void main(String args[])
	{  
	  int fact=1;
	  Scanner sc = new Scanner(System.in);
	  
	  System.out.println("Enter Number");
	  int n = sc.nextInt();
	  for(int i=1;i<=n;i++)
	  {    
	      fact=fact*i;    
	  }    
	  System.out.println("Factorial of "+n+" is: "+fact);    
	 }
}
