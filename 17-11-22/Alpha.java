import java.util.*;
class Alpha
{
	public static void main(String [] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the String :");
		String str = scan.next();
		int ans=Find(str);
		System.out.println(ans);
		
		
	}
	public static int Find(String str)
	{
		int res=0;
		
		for(int i=0;i<str.length();i++)
		{
			res*=26;
			res+=str.charAt(i)-'A'+1;
		}
		return res;
	}
}