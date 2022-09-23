import java.util.*;
class Subset
{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the number of elements : ");
		int n = scan.nextInt();
		System.out.println("Enter the sum number : ");
		int sum = scan.nextInt();
		int i,j;
		System.out.println("Enter the elements : ");
		int arr[] = new int[n];
		for(i=0;i<n;i++)
			arr[i] = scan.nextInt();
		int found=0;
		for(i=0;i<n-1;i++)
		{
			for(j=i+1;j<n-1;j++)
			{
			   if(arr[i]+arr[j]==sum)
				System.out.println(arr[i]+" "+arr[j]);
			
			}
		}
	}
}