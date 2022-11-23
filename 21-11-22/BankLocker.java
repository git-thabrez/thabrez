import java.util.*;
class BankLocker
{
	public static void main(String [] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Alphabets :");
		String str=scan.next();
		
		int ans=0;
		for(int i=0;i<str.length();i++)
		{
			ans*=26;
			ans+=(str.charAt(i)-'A'+1);
			
		}
		System.out.println(ans);
	}
}