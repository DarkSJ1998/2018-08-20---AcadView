import java.util.Scanner;
class q4
{
	public static void main(String[] s)
	{
		int num,sum = 0,digits = 0,temp;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a num : ");
		num = sc.nextInt();
		
		temp = num;
		while(temp > 0)
		{
			digits++;
			temp /= 10;
		}
		
		temp = num;
		while(temp > 0)
		{
			sum += Math.pow(temp%10,digits);
			temp /= 10;
		}
		System.out.println("Num = " + num);
		System.out.println("Sum = " + sum);
		if(num == sum)
			System.out.println("The number is an Armstrong Number.");
		else
			System.out.println("The number is not an Armstrong Number.");
		System.out.println();
	}
}