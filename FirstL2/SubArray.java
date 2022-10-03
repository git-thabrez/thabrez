import java.util.*;
class SubArray
{
	public static void main(String [] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Number of Elements to be entered");
		int n = scan.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter the Elements");
		for(int i=0;i<n;i++)
			arr[i]=scan.nextInt();
		System.out.println("Enter the Sum Value");
		int sum = scan.nextInt();
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				for(int k=j+1;k<n;k++)
				{
				      if(arr[i]+arr[j]==sum)
				        {
				      	  System.out.println(arr[i]+" "+arr[j]);
				        }
					  if(arr[i]+arr[j]+arr[k]==sum)
					  {
						  System.out.println(arr[i]+" "+arr[j]+" "+arr[k]);
					  }
				}
			}
		}
	}
}