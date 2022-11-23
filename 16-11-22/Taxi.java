import java.util.*;
class Taxi
{
	public static void main(String [] args)
	{
		Booking1 obj = new Booking1();
		obj.book();
	}
}

class Data
{
	int custId[]       =new int[10];
	int bookId[]       =new int[10];
	char startPoint[]  =new char[10];
	char endPoint[]    =new char[10];
	int pickTime[]     =new int[10];
	int dropTime[]     =new int[10];
	int fare[]         =new int[10];
	int allotedTaxi[]  =new int[10];
	int taxi[]         ={0,1,2,3};
	int taxiTime[]     =new int[4];
	static int count=0,id=1;
	static int taxitime=0;
	static int taxicount=0;
	
}
class Booking1 extends Data
{
	Scanner scan = new Scanner(System.in);
	public void book()
	{
		int n;
		do
		{
			System.out.println("'1' for Booking\n'2' for Show Taxi Details\n'3' for Exit ");
		    n = scan.nextInt();
			switch(n)
			{
				case 1:
				{
					bookTaxi();
					break;
				}
				case 2:
				{
					displayDetails();
					break;
				}
			}
		}
		while(n!=3);
	}
	
	public void bookTaxi()
	{
		System.out.println("Enter Your PickUp Point :");
		char pick = scan.next().charAt(0);
		
		
		System.out.println("Enter Your Destination :");
		char drop=scan.next().charAt(0);
		
		
		System.out.println("Enter the PickUp Time :");
	    int time=scan.nextInt();
		
		
		
	}
	
	public int calculateAmount(char start,char end)
	{
		int a=start;
		int b=end;
		int amount=100;
		for(int i=a;i<b;i++)
		{
			amount+=100;
		}
		return amount;
	}
	
	public int calculateTime(char start,char end,int startTime)
	{
		int a=start;
		int b=end;
		int time=startTime;
		for(int i=a ;i<b;i++)
		{
			time+=1;
		}
		return time;
	}
	
	
	public void displayDetails()
	{
		int index=0;
		System.out.println("Enter the Taxi Number :");
		int n = scan.nextInt();
		
		for(int i=0;i<taxi.length;i++)
		{
			if(taxi[i]==n)
			{
				index=i;
			}
		}
		
		
		if(index!=-1)
		{
			System.out.println("BookingID     :"+bookId[index]+"\n"+
			                   "CustomerID    :"+custId[index]+"\n"+
							   "From          :"+startPoint[index]+"\n"+
							   "To            :"+endPoint[index]+"\n"+
							   "PickupTime    :"+pickTime[index]+"\n"+
							   "DropTime      :"+dropTime[index]+"\n"+
							   "Amount        :"+fare[index]); 
		}
		else
		{
			System.out.println("Taxi not found...");
		}
		
	}
}