import java.util.*;
class Lexico
{
	public static void main(String [] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the String ");
		String str = scan.next();
		char a[]=str.toCharArray();
		char arr[]=new char[a.length];
		int k=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]!=' ')
			{
				for(int j=i+1;j<a.length;j++)
				{
					if(a[i]==a[j])
					{
						a[j]=' ';
					}
				}
				arr[k++]=a[i];
			}
		}
		System.out.println(arr);
	}
}
