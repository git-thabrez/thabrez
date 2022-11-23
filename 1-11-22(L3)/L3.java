import java.util.*;
class L3
{
	static String name;
	static String pass;
	public static void main(String [] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter '1' for Admin or  '2' for User");
		
		int n = scan.nextInt();
		switch(n)
		{
			case 1:
			{
				
				System.out.println("Enter Your Name :");
				name = scan.next();
				System.out.println("Enter Your Password :");
			    pass=scan.next();
				boolean flag=Login.adminLogin(name,pass);
				
			}
			case 2:
			{
				
			}
		}
	
		
	}
}
class Login
{
	Scanner scan = new Scanner(System.in);
	static int cid[]=new int[3];
	static String cpass[]=new String[3];
	static int deposit[]=new int[3];
	static int k=0;
	
	String adminname="Thabrez";
	String adminpass="Thabrez#123";
	
	public void signIn()
	{
		System.out.println("Enter your UserId :");
		int uid=scan.nextInt();
		System.out.println("Enter your Password :");
		String upass=scan.next();
		for(int i=0;i<3;i++)
		{
			if(uid==cid[i] && upass==cpass[i])
			{
				System.out.println("Signed in successfully");
			}
		}
	}
	
	public void signup()
	{
		System.out.println("Enter your UserId :");
		int uid=scan.nextInt();
		System.out.println("Enter your Password :");
		String upass=scan.next();
		
		for(int i=0;i<3;i++)
	    {
		   if(cid[i]==0 && cpass[i]==null)
		    {
			   cid[i]=uid;
			   cpass[i]=upass;
		    }
	    }
	}
	
	public static boolean	adminLogin(String name,String pass)
	{
		if(name==adminname  &&  pass== adminpass)
		{
			System.out.println("Logged in successfully :");
			return true;
		}
		else
		{
			return false;
		}
	}
	
}
	
	
		

