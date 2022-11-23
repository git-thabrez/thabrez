import java.util.*;
class Try
{
	public static void main(String [] args)
	{
		
		
	}
}
class Data1
{
    String cusName[]=new String[10];
	String cusPass[]=new String[10];
	int cusID[]=new int[10];
	int cusaccNo[]=new int[10];
	int cashDepo[]=new int[10];
	String encrytPass[]=new String[10];
	String decryptPass[]=new String[10];
	static int customerID= 1001;
	static int customerACNO=2345;
	static int index=4;
	static int initialBalance=10000;
	
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
	
	
}

class BankinggL3 extends Data1
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
	
	
	
	public void work()
	{
		
	}
}