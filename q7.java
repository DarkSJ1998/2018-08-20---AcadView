import java.util.Scanner;
class q7
{
	public static void main(String[] args)
	{
		int arr[] = {1,4,6,7,8,9,10};
		int i,num,size = 7;
		boolean flag = false;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Original Array :-");
		for(int n : arr)
			System.out.print(n + " ");
		
		System.out.println();
		System.out.print("\nEnter a number to search : ");
		num = sc.nextInt();
		
		for(int n : arr)
		{
			if(num == n)
			{
				flag = true;
				break;
			}
		}
		System.out.println();
		
		if(flag == true)
			System.out.println("Number is present");
		else
			System.out.println("Number is absent");
		
	}
}