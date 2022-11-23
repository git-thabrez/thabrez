import java.util.*;
class Concentric
{
	public static void main(String [] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Value :");
		int n = scan.nextInt();
		
		int size=2*n-1;
		
		System.out.println(size);
		int arr[][]=new int[size][size];
		
		int start=0;
		int end=size-1;
		
		while(n!=0)
		{
			for(int i=start;i<=end;i++)
		    {
			   for(int j=start;j<=end;j++)
			   {
				   if(i==start || j==start || i==end || j==end)
				   {
					   //System.out.print(n);
					   arr[i][j]=n;
				   }
			   }
		    }
			++start;
			--end;
			--n;
		}
		
		for(int i=0;i<size;i++)
		{
			for(int j=0;j<size;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
}