import java.util.*;

class TruthTable
{
	public static void main(String [] args)
	{
		Scanner scan = new Scanner(System.in);	
		System.out.println("Enter the number :");
		int n = scan.nextInt();
		printTable(n);
	}
	
	public static void printTable(int n)
	{
		int rows=(int)Math.pow(2,n);
		
		for(int i=0;i<rows;i++)
		{
			for(int j=n-1;j>=0;j--)
			{
				System.out.print((i/(int)Math.pow(2,j))%2 + " ");
			}
			System.out.println();
		}
	}
}