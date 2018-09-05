/*
Q2. Take a number N from the user as input and find all even numbers upto N.
*/

import java.util.Scanner;
class q2
{
	public static void main(String[] s)
	{
		int i,n;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a num : ");
		n = sc.nextInt();
		
		System.out.println("Even numbers from 0 to " + n + ":-");
		for(i=2;i<=n;i++)
		{
			if(i%2 == 0)
				System.out.print(i + " ");
		}
		System.out.println();
	}
}
