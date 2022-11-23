import java.util.*;

class Taxi3
{
	public static void main(String [] args)
	{
		ArrayList<Store> s = new ArrayList<>();
	}
}


class Store
{
	Scanner scan = new Scanner(System.in);
	char start;
	char desti;
	int strattime;
	int endtime;
	
	
}


class Starter
{
	Scanner scan = new Scanner(System.in);
	public void work()
	{
		int n=0;
		do
		{
			System.out.println("'1' for Book Taxi\n'2' for Display Taxi Details\n'3' for Exit ");
		    n=scan.nextInt();
			switch(n)
			{
				case 1:
				{
					startBooking();
					break;
				}
				case 2:
				{
					//display();
					break;					
				}
			}
		}
		while(n!=3);
	}
	public void startBooking()
	{
		Store obj = new Store();
		System.out.println("Enter the Pickup Point :");
		char starting = scan.next().CharAt(0);	
		
	}
}