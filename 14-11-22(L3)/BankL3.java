import java.util.*;

class BankL3 extends Data
{
	static Scanner scan = new Scanner(System.in);
	public static void main(String [] args)
	{
		BankingL3 obj = new BankingL3();
		int z;
		do
		{
			System.out.println("Enter '1' for NewAccount\nEnter '2' for Banking\nEnter '3' for Exit ");
		    z = scan.nextInt();
		    switch(z)
		     {
			    case 1:
			    {
					obj.addNewCustomer();
				    break;
			    }
			    case 2:
			    {
					obj.work();
					break;
				
			    }
		     }
		}
		while(z!=3);
		
		
	}
}

class Data
{
	static String cusName[]=new String[10];
	static String cusPass[]=new String[10];
	static int cusID[]=new int[10];
	static int cusaccNo[]=new int[10];
	static int cashDepo[]=new int[10];
	static String encrytPass[]=new String[10];
	static String decryptPass[]=new String[10];
	static int customerID= 1001;
	static int customerACNO=2345;
	static int index=4;
	static int initialBalance=10000;
	
	public void addDefault()
	{
		cusID[0]=11;
	    cusaccNo[0]=11011;
	    cusName[0]="Kumar";
	    cashDepo[0]=10000;
	    encrytPass[0]="ApipNbjm";
	
	
	    cusID[1]=22;
	    cusaccNo[1]=22022;
	    cusName[1]="Madhu";
	    cashDepo[1]=20000;
	    encrytPass[1]="Cboljoh";
	
	
	    cusID[2]=33;
	    cusaccNo[2]=33033;
	    cusName[2]="Rahul";
	    cashDepo[2]=30000;
	    encrytPass[2]="dbnqvt";
	
	
	    cusID[3]=44;
	    cusaccNo[3]=44044;
	    cusName[3]="Robin";
	    cashDepo[3]=40000;
	    encrytPass[3]="kbwb22";
	}
	
	
	public Data()
	{
		addDefault();	    
	}
	
	
	
	
	
}
class BankingL3 extends Data
{
	Scanner scan = new Scanner(System.in);
	public void addNewCustomer()
	{
		if(index!=10)
		{
			System.out.println("Enter Your Name :");
		    String cusname=scan.next();
		    System.out.println("Enter Your Password :");
		    String cuspass=scan.next();
			
			boolean flag = true;
		    while(flag)
		    {
			    System.out.println("Re-Type the password Again :");
		        String retypepass=scan.next();
			    boolean checkpass=checkPassword(cuspass,retypepass);
			    if(checkpass)
		         {
			        System.out.println("Password is correct :");
			        flag=false;
		         }
		        else
		         {
			        System.out.println("Password typed is mismatching type again :");
		         }
		    }
			cusName[index]=cusname;
		    cusPass[index]=cuspass;
		    cusID[index]=customerID;
		    cusaccNo[index]=customerACNO;
		    cashDepo[index]=initialBalance;
		    String changedpass=(String)encrypt(cuspass);
		    encrytPass[index]=changedpass;
		    shownewcus(index);
		    customerID++;
		    customerACNO++;
		    index++;
		}	
	}
	
	
	public void atmWithdrawl()
	{
		System.out.println("Enter Your Password :");
		String str = scan.next();
		boolean flag = false;
		String pass=encrypt(str);
		int cusindex=0;
		for(int i=0;i<=index;i++)
		{
			if(pass.equals(encrytPass[i]))
			{
				cusindex=i;
				flag=true;
				break;
			}
		}
		
		if(flag==true)
		{
			System.out.println("Enter the amount to be Withdraw :");
			int withdraw=scan.nextInt();
			
			if(cashDepo[cusindex]>=1000)
			{
				cashDepo[cusindex]-=withdraw;
				System.out.println("Amount is Withdrawn...");
				System.out.println("Amount in account is :"+cashDepo[cusindex]);
			}
		}
		else
		{
			System.out.println("Wrong Password !!!");
		}
	}
	
	
	public void cashDeposit()
	{
		System.out.println("Enter Your Password :");
		String str = scan.next();
		boolean flag = false;
		String pass=encrypt(str);
		int cusindex=0;
		for(int i=0;i<=index;i++)
		{
			if(pass.equals(encrytPass[i]))
			{
				cusindex=i;
				flag=true;
				break;
			}
		}
		
		if(flag==true)
		{
			System.out.println("Enter the amount to be Deposited :");
			int deposit=scan.nextInt();
			cashDepo[cusindex]+=deposit;
			System.out.println("Amount is Added :");
			System.out.println("Amount in account is :"+cashDepo[cusindex]);
			
		}
		else
		{
			System.out.println("Wrong Password !!!");
		}
		
	}
	
	
	public void accountTransfer()
	{
		System.out.println("Enter Your Password :");
		String str = scan.next();
		boolean flag = false;
		String pass=encrypt(str);
		int cusindex=0;
		for(int i=0;i<=index;i++)
		{
			if(pass.equals(encrytPass[i]))
			{
				cusindex=i;
				flag=true;
				break;
			}
		}
		int secondcusindex=0;
		
		if(flag == true)
		{
			System.out.println("Enter the account number to transfer :");
			int accno=scan.nextInt();
			for(int i=0;i<index;i++)
			{
				if(cusaccNo[i]==accno)
				{
					secondcusindex=i;
				}
			}
			
			if(cashDepo[cusindex]>=1000)
			{
				System.out.println("Enter the amount to transfer :");
				int amount=scan.nextInt();
				cashDepo[secondcusindex]+=amount;
				cashDepo[cusindex]-=amount;
				System.out.println("Amount has been transferred Successfully :");
				System.out.println("Amout in account is :"+cashDepo[cusindex]);
				System.out.println("Amount in sender account is :"+cashDepo[secondcusindex]);
			}
		}
		else
		{
			System.out.println("Wrong Password !!!");
		}
	}
	
	
	public void work()
	{
		
		System.out.println("Enter Your ID :");
		int id = scan.nextInt();
		boolean flag =false;
		int cusindex=0;
		for(int i=0;i<=index;i++)
		{
			if(id==cusID[i])
			{
				cusindex=i;
				flag=true;
			}
		}  
		
		
		if(flag==true)
		{
			int m;
		    do
		    {
			    System.out.println("Enter '1' for ATM Withdrawal\nEnter '2' for CashDeposit\nEnter '3' for AccountTransfer\nEnter '4' for Exit ");
		        m = scan.nextInt();
			
			    switch(m)
			     {
				    case 1:
				     {
					    atmWithdrawl();
					    break;
				     }
				    case 2:
				     {
					    cashDeposit();
					    break;
				     }
				    case 3:
				     {
					    accountTransfer();
					    break;
				     }
			}
		}
		while(m!=4);
		}
		else
		{
			System.out.println("Account not found !!!");
		}
	}
	
	
	public void shownewcus(int k)
	{
		System.out.println("Cust  ID\t"+"Account Number\t\t"+"Name\t\t\t"+"Balance\t\t\t"+"Password");
		    System.out.println(cusID[k]+"\t\t"+cusaccNo[k]+"\t\t\t"+cusName[k]+"\t\t\t"+cashDepo[k]+"\t\t\t"+encrytPass[k]);
	}
	
	
	public boolean checkPassword(String originalPass,String retypesPass)
	{
		int count=0;
		for(int i=0;i<retypesPass.length();i++)
		{
			if(retypesPass.charAt(i)==originalPass.charAt(i))
			{
				++count;
			}
			else
			{
				break;
			}
		}
		if(count==retypesPass.length())
		{
			return true;
		}
		else
		{
			return false;
		}
		
	}
	
	
	public String encrypt(String str)
	{
		String temp="";
		
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)>=65 && str.charAt(i)<=90)
			{
				temp+=(char)(str.charAt(i)+1);
			}
			else if(str.charAt(i)>=97 && str.charAt(i)<=122)
			{
				temp+=(char)(str.charAt(i)+1);
			}
			else
			{
				temp+=(char)(str.charAt(i)+1);
				
			} 
		}
		return temp;
	}
	
	public String decrypt(String str)
	{
		String temp="";
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)>=65 && str.charAt(i)<=90)
			{
				temp+=(char)(str.charAt(i)-1);
			}
			else if(str.charAt(i)>=97 && str.charAt(i)<=122)
			{
				temp+=(char)(str.charAt(i)-1);
			}
			else
			{
				temp+=(char)(str.charAt(i)-1);
				
			}
		}
		return temp;
	}
	
	
	public String authentication(String str)
	{
		String temp="";
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)>=65 && str.charAt(i)<=90)
			{
				temp+=(char)(str.charAt(i)-1);
			}
			else if(str.charAt(i)>=97 && str.charAt(i)<=122)
			{
				temp+=(char)(str.charAt(i)-1);
			}
			else
			{
				temp+=str.charAt(i)-1;
			}
		}
		
		return temp;
	}
	
	
	public void show()
	{
		for(int k=0;k<=index;k++)
		{
			System.out.println("Cust  ID\t"+"Account Number\t\t"+"Name\t\t\t"+"Balance\t\t\t"+"Password");
		    System.out.println(cusID[k]+"\t\t"+cusaccNo[k]+"\t\t\t"+cusName[k]+"\t\t\t"+cashDepo[k]+"\t\t\t"+encrytPass[k]);
		}
		
	}
}