/*
Q3. Take a number N from the user as input and find all prime numbers upto N.
*/

import java.util.Scanner;
class q3
{
	public static void main(String[] s)
	{
		int i,j,count,n;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a num : ");
		n = sc.nextInt();
		
		System.out.println("Prime numbers from 0 to " + n + ":-");
		for(i=2;i<=n;i++)
		{
			count = 0;						// setting count = 0
			for(j=2;j<=Math.sqrt(i);j++)
			{
				if(i%j == 0)
					count++;				// incrementing the factor count
			}
			
			if(count == 0)
				System.out.print(i + " ");
		}
		System.out.println();
	}
}
