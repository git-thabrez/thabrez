import java.util.*;
class L31
{
	public static void main(String [] args)
	{
		Scanner scan = new Scanner(System.in);
		int n=0;
		boolean flag=false;
		do
		{
			System.out.println("Enter '1' for Admin or  '2' for User or '3' for Exit :");
		    n = scan.nextInt();
			switch(n)
		  {
			case 1:
			{
				Admin ad = new Admin();
				flag=ad.adminLogin();
				while(flag)
				{
					System.out.println("Enter '1' for view Account details or '2' for Exit :");
					int z = scan.nextInt();
					switch(z)
					{
						case 1:
						{
							ViewAccountDetails.view();
							break;
						}
						case 2:
						{
							flag = false;
							break;
					    }
					}
					
				}
				break;
			}
			case 2:
			{
				User obj = new User();
				System.out.println("Enter '1' for Signin or '2' for Signup :");
				int k=scan.nextInt();
				switch(k)
				{
					case 1:
					{
						obj.signIn();
						
					}
					case 2:
					{
						
					}
					
				}
			}
			case 3:
			{
				
			}
		  }
			
		}
		while(n==3);
		
		
		
	}
}

class Login
{
	
	public Login() {
		// TODO Auto-generated constructor stub
	}
	public Login(String admin) {
		userName="Thabrez";
		password="Thabrez#1999";
	}
	Scanner scan = new Scanner(System.in);
	String userName;
	String password;
	public void signIn(){
		System.out.println("Enter the User Name : ");
		String Name1=scan.next();
		System.out.println("Enter the password : ");
		String Pass1=scan.next();
		if(Name1.equals(userName)&&Pass1.equals(password))
		{
			System.out.println("Signed in successfully");
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
	    userName = scan.next();
		System.out.println("Enter the password");
		password=scan.next();
		
	}
}
class ViewAccountDetails extends DataL3
{
	public  static void view()
	{
		System.out.println("Enter your id number :");
		int n = scan.nextInt();
		for(int i=0;i<3;i++)
		{
			if(cid[i]==n)
			{
				System.out.println("Account id       :"+cid[i]);
				System.out.println("Account passowrd :"+cpass[i]);
				System.out.println("Account balance  :"+deposit[i]);
				
			}
		}
	}
}

class DataL3
{
	static Scanner scan = new Scanner(System.in);
	static int cid[]=new int[3];
	static String cpass[]=new String[3];
	static int deposit[]=new int[3];
	static int k=0;
}
class AdmiWork 
{
	
}
class User extends DataL3
{
	public void signIn()
	{
		System.out.println("Enter your UserId :");
		int uid=scan.nextInt();
		System.out.println("Enter your Password :");
		String upass=scan.next();
		for(int i=0;i<3;i++)
		{
			if(uid==cid[i] && upass.equals(cpass[i]))
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
}

class UserWork extends DataL3
{
	
	public void work()
	{
		System.out.println("Enter '1' for CreateGiftCard\n"+
		                   "Enter '2' for Topup\n"+
						   "Enter '3' for Transaction History\n"+
						   "Enter '4' for Block\n"+
						   "Enter '5' for Logout\n"
	}
	
}