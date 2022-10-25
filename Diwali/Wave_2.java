import java.util.Scanner;
public class Wave_2 
{
		public static void main(String[] args) 
		{
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter the Number of Elements :");
			int n = scan.nextInt();
			int arr[]= new int[n];
			System.out.println("Enter the Elements :");
			for(int i=0;i<n;i++)
				arr[i]=scan.nextInt();
			scan.close();
			for(int i=0;i<n-1;i+=2)
				temp(arr,i,i+1);
			
			
			for(int i=0;i<n;i++) 
			{
				System.out.print(arr[i]+" ");
			}
			
		}
		
		public static void temp(int arr[],int a,int b) 
		{
			int temp=arr[a];
			arr[a]=arr[b];
			arr[b]=temp;
		}

	}
