import java.util.*;
class Traps
{
	public static void main(String [] args) throws Exception
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the N1 Value :");
		int n1 = scan.nextInt();
		
		System.out.println("Enter the N2 Value :");
		int n2 = scan.nextInt();
		
		System.out.println("Enter the Trap Value :");
		int trap=scan.nextInt();
		
		int count=0;
		
		for(int i=n1;i<=n2;i++)
		{
			if(n1==trap)
			{
				trap+=2;
				System.out.println(n1);
				count+=1;
			}
			if(n1%trap==0)
			{
				trap+=2;
				System.out.println(n1);
				count+=1;
			}
			if(n1%trap!=0)
			{
				trap-=1;
			}
			
			
			n1++;
		}
		System.out.println(count);
		
	}
	public static void check()
	{
		
	}
}