import java.util.*;
class Repeat
{
	public static void main(String [] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the String : ");
		String str = scan.nextLine();
		System.out.println("Enter the number of times to repeat : ");
		int n = scan.nextInt();
		for(int i=0;i<n;i++)
			System.out.print(str);
	}

}