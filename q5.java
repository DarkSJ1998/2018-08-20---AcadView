/*
Q5. Take a number N from the user and print its reverse.
*/

import java.util.Scanner;
class q5
{
	public static void main(String[] s)
	{
		int num,rev = 0,temp;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a num : ");
		num = sc.nextInt();
		
		temp = num;
		while(temp > 0)
		{
			rev = rev*10 + temp%10;
			temp /= 10;
		}
		System.out.println("Entered Num = " + num);
		System.out.println("Reverse of Num = " + rev);
		
		System.out.println();
	}
}
