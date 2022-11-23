import java.util.*;
class MinimumOfAllGreatest
{
	public static void main(String [] thabrez)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Number of Elements :");
		int n = scan.nextInt();
		
		int arr[]=new int[n];
		int arr1[]=new int[n];
		System.out.println("Enter the Elements :");
		for(int i=0;i<n;i++)
		{
			int z=scan.nextInt();
			arr[i]=z;
			arr1[i]=z;
		}
			
		
		
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(arr1[i]>arr1[j])
				{
					int temp=arr1[i];
					arr1[i]=arr1[j];
					arr1[j]=temp;
					
				}
			}
		}
		
		
		
		
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n-1;j++)
			{
				if(arr[i]==arr1[j])
				{
					System.out.println(arr[i]+">"+arr1[j+1]);
					break;
				}
			}
		}			
	}  
}