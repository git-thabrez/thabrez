import java.util.*;
class Rev
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		String str = "i.like.programming.very.much";
		String temp="";
		String end="";
		for(int i=str.length()-1;i>=0;i--)
		{
			temp+=str.charAt(i);
		}
		System.out.println(temp);
		int m=0;
		for(int i=0;i<temp.length();i++)
		{
			if(temp.charAt(i)=='.')
			{   
			    for(int j=i-1;j>=m;j--)
				{
					end+=temp.charAt(j);
				}
				end+=temp.charAt(i);
				m=i+1;
				i=i+1;
			}
		}
		end+=temp.charAt(m);
		System.out.println(end);
	}
}