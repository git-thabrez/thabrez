import java.util.*;
class Bank
{
	public static void main(String [] args)
	{
		Scanner scan = new Scanner(System.in);
		int n;
		do
		{
			System.out.println("Enter '1' for SignIn or '2' for SignUp or '3' for Exit :");
		    n = scan.nextInt();
			switch(n)
			{
				case 1:
				{
					User obj = new User();
					obj.signIn();
					break;
				}
				case 2:
				{
					User obj1 = new User();
					obj1.signUp();
					obj1.signIn();
					break;
				}
			}
		}
		while(n!=3);
		
		
	}
}

class Data
{
	static Scanner scan = new Scanner(System.in);
	static String cid[]=new String [3];
	static String cpass[]=new String[3];
	static int giftCard[]=new int[3];
	static int giftCardAmount[]=new int[3];
	static int pinNumber[]=new int[3];
	static int deposit[]=new int[3];
	static int reedemPoints[]=new int[3];
	static String block[]=new String[3];
	static int k=0;
	static int pinnum=3245;
	static int cardnum=191318;
}
class User extends Data
{
	String id;
	String password;
	int depo;
	public void signUp()
	{
		System.out.println("Enter Your Id :");
		id = scan.next();
		System.out.println("Enter Your Password :");
	    password = scan.next();
		System.out.println("Enter the Deposit amount to be added :");
		depo=scan.nextInt();
		
		for(int i=0;i<3;i++)
		{
			if(cid[i]==null && cpass[i]==null && deposit[i]==0)
			{
				cid[i]=id;
				cpass[i]=password;
				deposit[i]=depo;
			}
		}
	}
	
	public void signIn()
	{
		System.out.println("Enter Your Id :");
		String id = scan.next();
		System.out.println("Enter Your Password :");
		String password = scan.next();
		for(int i=0;i<3;i++)
		{
			if(cid[i].equals(id) && cpass[i].equals(password))
			{
				work(i);
				break;
			}
			else
			{
				System.out.println("Account not found...");
			}
		}		
	}
	
	
	public void createGiftCard(int i)
	{
		int index=i;
		giftCard[index]=cardnum;
		pinNumber[index]=pinnum;
		cardnum++;
		pinnum++;
		System.out.println("Gift Card Generated Successfully :");
		System.out.println("Card Num :"+cardnum+"\nCard Pin :"+pinnum);
		
		
		
	}
	public void topUp(int i)
	{
		int index=i;
		System.out.println("Enter the Amount to added to the gift card :");
		int n = scan.nextInt();
	    
			if(deposit[index]>=n)
		    {
			    giftCardAmount[i]=n;
				System.out.println("Amount added in giftCard ");
				
		    }
		    else
		    {
			    System.out.println("Not enough amount in deposit cash...");
		    }
	 	    
	}
	
	public void transactionHistory(int i)
	{
		int index=i;
		System.out.println("The Transaction history...");
		System.out.println("Amount in card :"+giftCardAmount[index]);
	}
	
	public void block(int i)
	{
		int index=i;
		System.out.println("Card is Blocked Successfully :");
		block[index]="Block";
		int amount=giftCardAmount[index];
		giftCardAmount[index]=0;
		deposit[index]+=amount;
	}
	
	public void work(int i)
	{
		int index=i;
		
		int n;
		do
		{
			System.out.println("Enter '1' for CreateGiftCard :\n"+
		                   "Enter '2' for Topup :\n"+
		                   "Enter '3' for Transaction History :\n"+
		                   "Enter '4' for Block :\n"+
		                   "Enter '5' for Logout :");
						   
	     n = scan.nextInt();
		
		switch(n)
		{
			case 1:
			{
				createGiftCard(index);
				break;
			}
			case 2:
			{
				topUp(index);
				break;
			}
			case 3:
			{
				transactionHistory(index);
				break;
			}
			case 4:
			{
				block(index);
				break;
			}
		}
		}
		while(n!=5);
	}
	
}