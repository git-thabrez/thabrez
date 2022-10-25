import java.util.Scanner;

public class ThreeCandi_11 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Number of Elements :");
		int n = scan.nextInt();
		int arr[] = new int[n];
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
	    			int temp=arr[j];
	    			arr[j]=arr[j+1];
	    			arr[j+1]=temp;
	    		}
	    	}
	    }
	    int product=1;
	    for(int i=n-1;i>=n-3;i--) 
		{
	    	product*=arr[i];
	    }
	    System.out.println(product);
	   
	}

}
