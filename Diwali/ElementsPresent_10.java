import java.util.Scanner;

public class ElementsPresent_10 
{
	public static void main(String [] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the A Matrix number of Elements :");
		int a = scan.nextInt();
		int A[]=new int[a];
		System.out.println("Enter A Matrix Elements :");
		for(int i=0;i<a;i++)
			A[i]=scan.nextInt();
		System.out.println("Enter the B Matrix number of Elements :");
		int b = scan.nextInt();
		int B[]=new int[b];
		System.out.println("Enter A Matrix Elements :");
		for(int i=0;i<b;i++)
			B[i]=scan.nextInt();
         scan.close();		
		
		for(int i=0;i<a;i++) 
		{
			int j;
			for(j=0;j<b;j++) 
			{
				if(A[i]==B[j])
					break;
			}
			
			if(j==b)
				System.out.println(A[i]);
		}
		
		
	}		
}
