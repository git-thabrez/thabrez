import java.util.*;
class Occur
{
  public static void main(String [] args)
  {
     Scanner scan = new Scanner(System.in);
	 System.out.println("Enter the number of Elements : ");
	 int n = scan.nextInt();
	 int arr[]=new int[n];
	 System.out.println("Enter the Elements : ");
	 for(int i=0;i<n;i++)
	 {
		 arr[i]=scan.nextInt();
	 }
	 int b[]=new int[n];		
		for(int i=0;i<n;i++)
		{
			int count=1;
			if(arr[i]!=-1)
			{
				for(int j=i+1;j<n;j++)
				{
					if(arr[i]==arr[j])
					{
						count+=1;
						arr[j]=-1;
					}
				}
				b[i]=count;
			}
		}
		for(int i=0;i<n;i++)
		{
			if(arr[i]!=-1)
				System.out.println(arr[i] + ":"+ b[i]);
		}

  }
}