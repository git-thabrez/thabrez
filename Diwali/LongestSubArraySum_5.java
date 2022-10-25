import java.util.Scanner;

public class 
 {
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Number of Elements :");
		int n = scan.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter the Elements :");
		for(int i=0;i<n;i++)
			arr[i]=scan.nextInt();
		System.out.println("Enter the Sum Value :");
		int ans=scan.nextInt();
		int sum=0;
		int count=0;
		
		for(int i=0;i<n;i++) 
		{
			for(int j=i;j<n;j++) 
			{
				sum+=arr[j];	
				if(sum==ans) 
				{
					count=Math.max(count,j-i+1);
				}
			}
		}
		System.out.println(count);
	}

}
