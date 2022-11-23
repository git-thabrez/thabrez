import java.util.*;
class Traps2
{
	public static void main(String [] args)
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
			if(trap<3)
			{
				trap=3;
			}
			if(n1==trap)
			{
				trap+=2;
				count+=1;
			}
			if(n1!=trap)
			{
				for(int j=2;j<=10;j++)
				{
					if(n1%j==0 && trap%j==0)
					{
						trap+=2;
						count+=1;
						break;
					}
					else
					{
						count+=1;
						break;
					}
				}
			}
		}
		System.out.println(count);
	}
	
	
}