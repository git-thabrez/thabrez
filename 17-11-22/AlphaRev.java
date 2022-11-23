import java.util.*;
class AlphaRev
{
	public static void main(String [] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Value :");
		int n = scan.nextInt();
		
		System.out.println(calculate(n));
		
		
	}
	public static String calculate(int n)
	{
		String temp="";
		while(n>0)
		{
			char c=(char)((n-1)%26+'A');
			n=(n-1)/26;
			temp=c+temp;
		}
		return temp;
	}
}