import java.util.*;
class Taxi1
{
	public static void main(String [] args)
	{
		if(taxicount==4)
		{
			taxicount=0;
		}
	    System.out.println("Enter Your PickUp Point :");
		char pick=scan.next().charAt(0);
		startPoint[count]=pick;
		System.out.println("Enter Your Destination :");
		char drop=scan.next().charAt(0);
		endPoint[count]=drop;
		
		custId[count]=id;
		bookId[count]=id;
				
		System.out.println("Enter the PickUp Time :");
		int time=scan.nextInt();
		pickTime[count]=time;
				
		//taxi[taxicount]=count;
		
		
		int droptimeholder=calculateTime(pick,drop,time);
		dropTime[count]=droptimeholder;
		
		for(int z=0;z<4;z++)
		{
			if(taxiTime[z]>0 && taxiTime[z]>=droptimeholder)
			{
				allotedTaxi[count]=taxi[z];
			}
            else
			{
				allotedTaxi[count]=taxi[z];
			}				
		}
		
		
		taxiTime[taxicount]=calculateTime(pick,drop,time);
		fare[count]=calculateAmount(pick,drop);
		
		System.out.println("Taxi "+taxicount+" is Alloted ");
		
		count++;
		id++; 
		taxicount++;
	}
}

class 