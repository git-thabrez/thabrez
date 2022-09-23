import java.util.*;
class Bracs
{
	public static void main(String [] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Brackets ");
		String str = scan.nextLine();
		char arr[] = str.toCharArray();
		//int brr[] = new int [arr.length];
		     int count =0;
			 int count1=0;
			 int count2=0;
		for(int i=0;i<arr.length;i++)
		{    
			if(arr[i]!=' ')
			{
				for(int j= i+1;j<arr.length;j++)
				{
					if(arr[i]==123 &&arr[j]==125)
					{
						count+=1;
						arr[j]=' ' ;
					}
					if(arr[i]==40 && arr[j]==41)
					{
						count1+=1;
						arr[j]=' ';
					}
					if(arr[i]==91 && arr[j]==93)
					{
						count2+=1;
						arr[j]=' ';
					}
				}
				//brr[i]=count;
			}
		}
		System.out.println("{ }"+count);
		System.out.println("( )"+count1);
		System.out.println("[ ]"+count2);
		
	}
}
