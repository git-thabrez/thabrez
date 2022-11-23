import java.util.*;
class Possible
{
	public static void main(String [] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number of Strings to be Entered :");
		int n = scan.nextInt();
		
		String arr[]=new String[n];
		System.out.println("Enter the Strings :");
		for(int i=0;i<n;i++)
			arr[i]=scan.next();
		
		for(int i=0;i<n;i++)
		{
			check(arr[i]);
		}
	}
	public static void check(String str)
	{
		char c[]=str.toCharArray();	
		for(int i=0;i<c.length;i++)
		{
			for(int j=0;j<c.length;j++)
			{
				if(c[i]>c[j])
				{
					char temp=(char)c[i];
					c[i]=(char)c[j];
					c[j]=(char)temp;
				}
			}
		}
		System.out.println(c);
	}
}