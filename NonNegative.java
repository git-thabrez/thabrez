import java.util.*;
class NonNegative
{
	public static void main(String [] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number of elements : ");
		int n = scan.nextInt();
		int arr[] =new int[n];
		System.out.println("Enter the Elements :");
		for(int i=0;i<n;i++)
			arr[i]=scan.nextInt();
		String str="";
		for(int i=0;i<n;i++)
		{
			
			for(int j=i+1;j<n;j++)
			{
				int temp=0;
				if(arr[i]<arr[j])
				{
			    temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
				}
			}
			str+=arr[i];
		}
		//System.out.println(str);
		int arr2[]=new int[str.length()];
        for(int i=0;i<str.length();i++)
			arr2[i]=arr2[i]*10+(str.charAt(i)-'0');
		
		for(int i=0;i<arr2.length;i++)
		{
			for(int j=i+1;j<arr2.length;j++)
			{
				int temp=0;
				if(arr2[i]<arr2[j])
				{
					temp = arr2[i];
					arr2[i]=arr2[j];
					arr2[j]=temp;
				}
			}
		}
		for(int i=0;i<arr2.length;i++)
			System.out.print(arr2[i]);
	}
}
