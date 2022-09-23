import java.util.*;
class Coordinator 
{
	public static void main(String[] args) 
	{
          Scanner scan = new Scanner(System.in);
          System.out.println("Enter the number of elements : ");
          int n = scan.nextInt();
          int i,j;
          System.out.println("Enter  the Elements : ");
          int arr[] = new int[n];
		  for(i=0;i<arr.length;i++)
			  arr[i]=scan.nextInt();
		  for(i=0;i<arr.length;i++)
		  {
			  boolean flag = false;
			  for(j=i+1;j<arr.length;j++)
			  {
				  if(arr[i]<=arr[j])
				  {
					  flag=true;
					  break;
				  }
			  }
			  if(flag==false)
			  {
				  System.out.println(arr[i]);
			  }
		  }
          
	   
	}
}
