import java.util.*;
public class trianglePattern {

	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i=0;i<n;i++)
		{
			for(int j=i;j<n;j++)
			{
				System.out.print(" ");
			}
			for(int k=0 ;k <=i;k++)
			{
				if(i >=2 && i<n-1 && k!=0 && k!=i)
					System.out.print("  ");
				else
					System.out.print("* ");
			}
			System.out.println();
		}
		sc.close();
		

	}

}
