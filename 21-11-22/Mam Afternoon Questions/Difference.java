import java.util.*;
class Difference
{
	public static void main(String [] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the String :");
		String str = scan.next();
		
		boolean flag = true;
		for(int i=0;i<str.length()-1;i++)
		{
			char c = (char)(str.charAt(i+1));
			if(str.charAt(i)==(int)c-1)
			{
				continue;
			}
			else
			{
				flag = false;
			}
		}
		
		if(flag == true)
		{
			System.out.println("Equal Difference ");
		}
		else
		{
			System.out.println("UnEqual Difference ");
		}
	}
}