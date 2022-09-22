import java.util.*;
class Shift{
	public static void main(String [] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number of Elements : ");
		int n = scan.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter the Elements : ");
		for(int i=0;i<n;i++)
			arr[i]=scan.nextInt();
		for(int i=0;i<n-1;i++){
			if(arr[i]==arr[i+1]){
				arr[i]=arr[i]+arr[i+1];
				arr[i+1]=0;
			}
		}
		int output[] = new int[n];
		int k=0;
		for(int i=0;i<=n-1;i++){
			if(arr[i]>0)
				output[k++]=arr[i];
		}
		
		for(int i=0;i<=n-1;i++)
			System.out.print(output[i]+" ");
		

	}
}