import java.util.*;
class L34
{
	public static void main(String [] args)
	{
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		System.out.println("Enter '1' for Admin or '2' for User ");
		switch(n)
		{
			case 1:
			{
				AdminWork aw = new AdminWork();
				Login l = new Login("Admin");
				l.signIn();
				aw.work();
				
			}
			case 2:
			{
				UserWork uw = new UserWork();
				System.out.println("Enter '1' for Signin or '2' for Signup :");
				int x = scan.nextInt();
				Login l = new Login();
				switch(x)
				{
					case 1:
					{
						l.signIn();
					}
					case 2:
					{
						l.signUp();
						l.signIn();
					}
				}
				
				
			}
		}
		
	}
}
class Data
{
	static Scanner scan = new Scanner(System.in);
	static int cid[]=new int[3];
	static String cpass[]=new String[3];
	static int deposit[]=new int[3];
	static int k=0;
}

class Login extends Data
{
	String name;
	String password;
	public Login()
	{
		
	}
	public Login(String name)
	{
		name="THabrez";
		password="THabrez#123";
	}
	public void signIn()
	{
		System.out.println("Enter the User Name : ");
		String Name1=scan.next();
		System.out.println("Enter the password : ");
		String Pass1=scan.next();
		if(Name1.equals(name)&&Pass1.equals(password))
		{
			System.out.println("Logged in successfully");
		}
		else
		{
			System.out.println("Account not found....");
			System.out.println("Try to signin first...");
		}
	}
	public void signUp()
	{
		System.out.println("Enter the User Name");
	    name = scan.next();
		System.out.println("Enter the password");
		password=scan.next();
	}
	
}


class AdminWork extends Data
{
	public void work()
	{
		
	}
	
}

class UserWork extends Data
{
	public void work()
	{
		
	}
}