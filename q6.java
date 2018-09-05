/*
Q6. Given the array A = {1,1,1,1,0,0,1,0}. Sort it in ascending order as {0,0,0,1,1,1,1,1} in least computation.
*/

class q6
{
	public static void main(String[] args)
	{
		int arr[] = {1,1,1,1,0,0,1,0};
		int i,j,size = 8;
		
		System.out.println("Original Array :-");
		for(int n : arr)
			System.out.print(n + " ");
		
		for(i=1;i<=size;i++)
		{
			for(j=0;j<size-i;j++)
			{
				if(arr[j] > arr[j+1])
				{
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		System.out.println("\n");;
		System.out.println("Sorted Array :-");
		for(int n : arr)
			System.out.print(n + " ");
		
		System.out.println();
	}
}
