import java.util.*;
class L35
{
	public static void main(String [] args)
	{
		Scanner scan = new Scanner(System.in);
		int n;
		do
		{
			System.out.println("Enter '1' for Admin or '2' for User or '3' for Exit :");
		    n = scan.nextInt();
		switch(n)
		{
			case 1:
			{
				Admin a = new Admin();
				a.work();
				break;
			}
			
			case 2:
			{
				User u = new User();
				System.out.println("Enter '1' for Signin or '2' for SignUp :");
				int m = scan.nextInt();
				switch(m)
				{
					case 1:
					{
						u.signIn();
					}
					case 2:
					{
						u.signUp();
						System.out.println("Now SignIn :");
						u.signIn();
						break;
					}
				}				
				u.work();
				//break;
			}
		}
		}
		while(n!=3);
		
	}
}

class Data
{
	static Scanner scan = new Scanner(System.in);
	static int cid[]=new int[3];
	static String cpass[]=new String[3];
	static int deposit[]=new int[3];
	static int k=0;
	static int giftCard[]=new int[3];
	static int pin[]=new int[3];
	
	static int gcno=0;
	static int cardnum=19131, pinnum=1313;
}

class User  extends Data
{
	public void signIn()
	{
		System.out.println("Enter your ID :");
		int id = scan.nextInt();
		System.out.println("Enter your PassWord :");
		String pass = scan.next();
		
		for(int i=0;i<3;i++)
		{
			if(cid[i]==id && cpass[i].equals(pass))
			{
				System.out.println("SignedIn Successfully");
				break;
			}
			else
			{
				System.out.println("No Account found Signup first :");
				break;
			}
		}
	}
	public void signUp()
	{
		System.out.println("Enter Your Id :");
		int n = scan.nextInt();
		System.out.println("Enter Your Password :");
		String pass = scan.next();
		
		for(int i=0;i<3;i++)
		{
			if(cid[i]==0  &&  cpass[i]==null)
			{
				cid[k]=n;
				cpass[k]=pass;
				deposit[k]=5000;
				k++;
				break;
			}
			else
			{
				System.out.println("All accounts are Full :");
			}
		}
	}
	public void createGiftCard()
	{
		
		
		for(int i=0;i<3;i++)
		{
			if(giftCard[i]==0)
			{
				giftCard[gcno++]=cardnum;
				pin[gcno++]=pinnum;
				cardnum++;
				pinnum++;
				break;
			}
		}
		System.out.println("Gift Card Generated Successfully :");
		System.out.println("Card Num :"+cardnum+"\nCard Pin :"+pinnum);
		
		
		
	}
	public void topUp()
	{
		
	}
	
	public void transactionHistory()
	{
		
	}
	
	public void work()
	{
		int n;
		do
		{
			System.out.println("Enter '1' for CreateGiftCard :\n"+
		                   "Enter '2' for Topup :\n"+
		                   "Enter '3' for Transaction History :\n"+
		                   "Enter '4' for Block :\n"+
		                   "Enter '5' for Logout :\n");
						   
	     n = scan.nextInt();
		
		switch(n)
		{
			case 1:
			{
				createGiftCard();
				break;
			}
			case 2:
			{
				topUp();
				break;
			}
			case 3:
			{
				break;
			}
			case 4:
			{
				transactionHistory();
				break;
			}
			case 5:
			{
				break;
			}
		}
		}
		while(n!=5);
		
	}
}
class Admin
{
	public void work()
	{
		
	}
}