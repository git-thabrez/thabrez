import java.util.*;
class L32
{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n=0;
		do{
		System.out.println("'1' for Admin and '2' for User :");
		 n = scan.nextInt();
		switch(n){
		     case 1:
		       {
		    	  AdminWork aw = new AdminWork();
				  int a=aw.signIn();
				  if(a==1)
				  {
					  aw.work();
				  }
			      break;
		       }
		     case 2:
		       {
				   UserWork uw = new UserWork();
		    	   break;
		       }
		}
		}while(n!=3);
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
	public int signIn(){
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
		return 1;
	}
	
	public void signUp()
	{
		System.out.println("Enter the User Name");
	    userName = scan.next();
		System.out.println("Enter the password");
		password=scan.next();
		
	}
}

interface Showing extends Data
{
	public void ViewAccountDetails();
}

class AdminWork extends Data
{
	public void work()
	{
		
	}
}

class UserWork extends Login
{
	public void work()
	{
		
	}
}