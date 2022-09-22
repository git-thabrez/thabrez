import java.util.*;
class Pairs
{
	public static void main(String [] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number of Elements : ");
		int n = scan.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter the Elements : ");
		   for(int i=0;i<n;i++)
		     arr[i]=scan.nextInt();
	    System.out.println("Enter the sum number : ");
	    int sum = scan.nextInt();
		for(int i=0;i<n-1;i++)
		{
			for(int j=i+1;j<n-1;j++)
			{
				if(arr[i]+arr[j]==sum)
					System.out.println("The pairs are :"+arr[i]+" "+arr[j]);
			}
		}
	}
}