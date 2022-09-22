import java.util.*;
class Twist
{
   public static void main(String [] args)
   {
	   Scanner scan = new Scanner(System.in);
	   System.out.println("Enter the number : ");
	   int n = scan.nextInt();
	   int rem,rev=0;
	   boolean flag=true;
	   while(n!=0)
	   {
		   rem=n%10;
		   rev=rev*10+rem;
		   n=n/10;
	   }
          //System.out.println(n);	   
	   for(int i=2;i<n/2;i++)
	   {
		   if(n%2==0)
			   flag=false;
		   else
			   flag = true;
	   }
	   if(flag==true)
		   System.out.println("Twisted Prime");
	   else
		   System.out.println("Not a Twisted Prime ");
   }
}