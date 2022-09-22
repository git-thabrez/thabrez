import java.util.*;
class SpecialPalin
 {
	public static void main(String[]args)
	{
	 Scanner scan = new Scanner(System.in);
	   System.out.println("Enter the String :");
	   String str = scan.nextLine();
	   String temp="";
	   for(int i=0;i<str.length();i++)
	   {
		   if(str.charAt(i)>=32&&str.charAt(i)<=64)
			   continue;
		     temp +=str.charAt(i);
	   }
	   String temp2="";
	   for(int i=temp.length()-1;i>=0;i--)
		   temp2 += temp.charAt(i);
	   int amount=temp2.length()-1;
	   int count=0;
	   for(int i=0;i<temp.length()-1;i++)
	   {
		   if(temp.charAt(i)==temp2.charAt(i))
			   count++;
	   }
	   if(count==amount)
		   System.out.println("Palindrome");
	   else
		   System.out.println("Not a Palindrome");

	}
}
