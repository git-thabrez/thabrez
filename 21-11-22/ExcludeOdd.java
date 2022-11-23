import java.util.*;
class ExcludeOdd
{
	public static void main(String [] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Number of Elements :");
		int n = scan.nextInt();
		
		int arr[]=new int[n];
		
		System.out.println("Enter the Array Elements :");
		for(int i=0;i<n;i++)
			arr[i]=scan.nextInt();
		
		int sum=arr[0];
		
		for(int i=1;i<n;i++)
		{
			if(arr[i]%2!=0)
			{
				if(arr[i-1]%2==0)
				{
					continue;
				}
				else
				{
					sum+=arr[i];
				}
			}
			else
			{
				sum+=arr[i];
			}
		}
		System.out.println(sum);
		
		
	}
}