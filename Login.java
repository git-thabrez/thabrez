import java.util.*;
class Login
{
   Scanner scan = new Scanner(System.in);
   String userName;   
   String password;
   String admin="Thabrez";
   String adminPass="Thabrezzz";
   String user="Siddiq";
	String userPass="Siddiqaa";
	public static void main(String [] args)
	{
		Login obj=new Login();
		Scanner scan = new Scanner(System.in);
		System.out.println("Login Page :");
		System.out.println("Enter a for Admin login or u for User Login :");
		char a=scan.next().charAt(0);
		switch(a){
		  case 'a' :
		     System.out.println("Want to signin or signup - to signin click 'a' or to signup click 'b' ");
		     char n = scan.next().charAt(0);
		     switch(n){
		        case 'a':
		        	obj.adminSignin();
		        	break;
		        case 'b':
		        	obj.signup();
		        	System.out.println("\nSign in now");
		        	obj.signin();
		        	break;
		     }
		     break;
		      case 'u' :
			  System.out.println("Want to signin or signup - to signin click 'a' or to signup click 'b' ");
			  char m = scan.next().charAt(0);
			  switch(m){
			  case 'a' :
				  obj.userSignin();
				  break;
			  case 'b' :
				  obj.signup();
				  System.out.println("\nSign in now");
				  obj.signin();
				  break; 
			  }
			  break;
		}
	}
	public void signup()
	{
		System.out.println("Enter the username :");
		userName=scan.next();
		while(true)
		{
			System.out.println("Enter the password :");
			password=scan.next();
			if(password.length()<8)
			{
				System.out.println("Password should not be less than 8 Characters ");
				System.out.println("Enter password again");
			}
			else
			{
				System.out.println("Account created successfully...");
				break;
			}
				
		}
	}
	public void signin(){
		System.out.println("Enter the User Name : ");
		String userName1=scan.next();
		System.out.println("Enter the password :");
		String password1=scan.next();
		if(userName1.equals(userName) && password1.equals(password)){
			System.out.println("Logged in successfully :");
		}
		else{
			System.out.println("Account not found.....");
			System.out.println("Try to signup first.....");
		}
		
	}
	public void adminSignin(){
		System.out.println("Enter the user name :");
		String name=scan.next();
		System.out.println("Enter the Password :");
		String pass =scan.next();
		if(name.equals(admin)&&pass.equals(adminPass)){
			System.out.println("Logged in successfully");
		}
		else{
			System.out.println("Admin account not found :");
			System.out.println("Please Sign in first :");
		}
	}
	public void userSignin(){
		System.out.println("Enter the user name :");
		String name1 = scan.next();
		System.out.println("Enter the password :");
		String password1=scan.next();
		if(name1.equals(user) && password1.equals(userPass)){
			System.out.println("Logged in successfully....");
		}
		else{
			System.out.println("User account not found");
			System.out.println("Please Sign in first :");
		}
	}


}