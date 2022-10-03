import java.util.*;
class Vowels
{
	public static void main(String [] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the String");
		String str = scan.next();
		String temp="";
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u' )
			{
				if(str.charAt(i+1)=='a'||str.charAt(i+1)=='e'||str.charAt(i+1)=='i'||str.charAt(i+1)=='o'||str.charAt(i+1)=='u')
				{
				    temp+=str.charAt(i);
			        temp+=str.charAt(i+1);
				}
			}
			if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u' )
			{
				continue;
			}
			else
			{
				temp+=str.charAt(i);
			}
			
		}
		System.out.println(temp);
	}

}