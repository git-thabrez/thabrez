import java.util.*;
class CompareTwoNumbers 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter two Numbers :");
		int n1 = scan.nextInt();
		int n2 = scan.nextInt();
		if(n1>n2)
		{		
			System.out.println(n1+">"+n1);
		}
		else if(n1<n2)
		{
			System.out.println(n1+"<"+n2);
		}
		else if (n1!=n2)
		{
			System.out.println(n1+"!="+n2);
		}
	}
		
}
