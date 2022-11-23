import java.util.*;
class Distinct
{
	public static void main(String [] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the String :");
		String str = scan.nextLine();
		
		int size=0;
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)==' ')
			{
				size+=1;
			}
		}
		size+=1;
		String arr[]=new String[size];
		
		int k=0;
		
		for(int i=0;i<arr.length;i++)
			arr[i]="";
		
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)!=' ')
			{
				arr[k]+=str.charAt(i);
			}
			else
			{
				k++;
			}
		}
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i].equals(arr[j]))
				{
					arr[j]="";
				}
			}
		}
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i].equals(""))
			{
				continue;
			}
			else
			{
				System.out.print(arr[i]+" ");
			}
		}
	}
}