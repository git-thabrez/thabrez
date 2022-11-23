import java.util.*;
class FindExtra
{
	public static void main(String [] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Number of Elements for 1'st Array :");
		int n = scan.nextInt();
		
		int arr[]=new int[n];
		
		
		System.out.println("Enter the Elements :");
		for(int i=0;i<n;i++)
		     arr[i]=scan.nextInt();
		
		System.out.println("Enter the Number of Elements for 2'nd Array :");
		int m = scan.nextInt();
		
		int arr1[]=new int[m];
		int temp[]=new int[n+m];
		System.out.println("Enter the Elements :");
		for(int i=0;i<m;i++)
			arr1[i]=scan.nextInt();
		
		int len=temp.length;
		int k=0;
		
		for(int i=0;i<n;i++,k++)
		{
			temp[k]=arr[i];
		}
		for(int j=0;j<m;j++,k++)
		{
			temp[k]=arr1[j];
		}
		
		for(int i=0;i<len;i++)
		{
			for(int j=i+1;j<len;j++)
			{
				if(temp[i]==temp[j])
				{
					temp[i]=-70;
					temp[j]=-70;
					break;
				}
				
			}
		}
		
		for(int i=0;i<len;i++)
		{
			if(temp[i]!=-70)
			{
				System.out.print(temp[i] + " is present in the index "+i);
			}
		}	
	} 
}