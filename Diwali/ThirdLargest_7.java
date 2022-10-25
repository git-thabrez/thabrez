import java.util.Scanner;

public class ThirdLargest_7 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number of Elements :");
		int n = scan.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter the Elements :");
		for(int i=0;i<n;i++)
			arr[i]=scan.nextInt();
		
		scan.close();
		for(int i=0;i<n;i++) 
		{
			for(int j=0;j<n-1;j++) 
			{
				if(arr[j]>arr[j+1]) 
				{
					int temp = arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
	   }
		int max=0;
		if(arr.length<3) 
		{
			System.out.println("-1");
		}
		else 
		{
			max=arr[n-3];
			System.out.println("The third greatest Number is :"+max);
		}
	  
	  
	}
}
