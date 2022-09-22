import java.util.*;
class RecurStr
{
	public static void main(String[] args)
{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the String :");
		String str = scan.nextLine();
		char arr[]=str.toCharArray();
		rev(arr,0,arr.length-1);
		System.out.println(arr);
		int start=0;
        for(int end=0;end<arr.length;end++)
		{
        	if(arr[end]==' ')
			{
        		rev(arr,start,end-1);
        		start=end+1;
        	}
        }
        rev(arr,start,arr.length-1);
        System.out.println(arr);
		
		
}
    public static void rev(char arr[],int x,int y)
	{
    	   for(;x<y;x++,y--)
		   {
    		   char temp=arr[x];
    		   arr[x]=arr[y];
    		   arr[y]=temp;
    	   }
	}
}
