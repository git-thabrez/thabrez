import java.util.*;

class Taxi2
{
	public static void main(String [] args)
	{
		Nadakum obj = new Nadakum();
		obj.work();
	}
}

class Storage
{
	char pickUp[]       =new char[10];
	char destination[]  =new char[10];
	int pickTime[]      =new int[10];
	int dropTime[]      =new int[10];
	int customerId[]    =new int[10];
	int bookingId[]     =new int[10];
	int taxiAlloted[]   =new int[10];
	int taxi[]          ={1,2,3,4};
	int taxiTime[]      =new int[4];
	int fare[]=new int[10];
	static int index=0,id=1;
	static int taxinumber=0,taxicount=0;
}

class Nadakum extends Storage
{
	Scanner scan = new Scanner(System.in);
	
	public void work()
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
		while(index!=10)
		{
			System.out.println("Enter Your PickUp Point :");
		char pick=scan.next().charAt(0);
		pickUp[index]=pick;
			
		System.out.println("Enter Your Destination :");
		char drop = scan.next().charAt(0);
		destination[index]=drop;
			
			
	    System.out.println("Enter Your PickUp Time :");
		int picktime=scan.nextInt();
		pickTime[index]=picktime;
		
		customerId[index]=id;
		bookingId[index]=id;
		
		if(taxicount!=4)
		{
			
			int dropTimeHolder=calculateTime(pick,drop,picktime);
			dropTime[index]=dropTimeHolder;
			taxiTime[taxinumber]=dropTimeHolder;
			taxiAlloted[index]=taxicount;
			System.out.println("Taxi "+taxicount+" is Alloted");
			System.out.println("Booking ID :"+id);
			
			fare[index]=calculateAmount(pick,drop);
			
		}
		else
		{
			int max=taxiTime[0];
			int found=0;
			for(int i=0;i<taxiTime.length;i++)
			{
				if(max<taxiTime[i] && taxiTime[i]<=picktime)
				{
					max=taxiTime[i];
					found=i;
				}
			}
			int dropTimeHolder=calculateTime(pick,drop,picktime);
			dropTime[index]=dropTimeHolder;
			//taxiTime[taxinumber]=dropTimeHolder;
			//taxiTime[index]
			System.out.println("Taxi "+taxi[found]+" is Alloted");
			System.out.println("Booking ID :"+id);
			taxiAlloted[index]=found+1;
			
			fare[index]=calculateAmount(pick,drop);
			
		}
		index++;
		id++;
		taxinumber++;
		taxicount++;
		break;
		}
		
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
	
	
	public void displayDetails()
	{
		int index=0;
		System.out.println("Enter the Booking ID :");
		int n = scan.nextInt();
		
		for(int i=0;i<taxiAlloted.length;i++)
		{
			if(bookingId[i]==n)
			{
				index=i;
			}
		}		
		if(index!=-1)
		{
			System.out.println("BookingID     :"+bookingId[index]+"\n"+
			                   "CustomerID    :"+customerId[index]+"\n"+
							   "From          :"+pickUp[index]+"\n"+
							   "To            :"+destination[index]+"\n"+
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
