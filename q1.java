/*
Q1. Write a Java program to print the following pattern : 
*****
****
***
**
*
*/

class q1
{
	public static void main(String[] s)
	{
		for(int i=0;i<5;i++)
		{
			for(int j=5;j>i;j--)
				System.out.print("* ");
			System.out.println();
		}
	}
}
