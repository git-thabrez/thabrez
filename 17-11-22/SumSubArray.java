import java.util.*;
class SumSubArray
{
	
	public static void main(String [] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number of Elements :");
		int n = scan.nextInt();
		
		int arr[]=new int[n];
		System.out.println("Enter the Elements :");
		for(int i=0;i<n;i++)
			arr[i]=scan.nextInt();
		
		System.out.println("Enter the Sum Value :");
		int target=scan.nextInt();
		
		String output="";
		for(int i=0;i<n;i++)
		{
			int sum=0;
			output="";
			for(int j=i;j<n;j++)
			{
				sum+=arr[j];
				output=output+j+",";
				if(sum==target)
				{
					System.out.println(output);
					break;
				}		
			}
		}
		
		//System.out.println(output);
		
		for(int i=0;i<arr.length;i++)
		{
			if(output.charAt(i)!=',')
			{
				System.out.print(arr[output.charAt(i)]+" ");
			}
			
		}   
	} 
}