import java.util.*;
public class Railway4 {
	public static void main(String[] args) {
		Data6 obj = new Data6();
		obj.work();
	}

}
class Data6{
     Scanner scan = new Scanner(System.in);
	static String Name[]=new String[15];
	static int Age[]=new int[15];
	static String Gender[]=new String[15];
	static String Berth[]=new String[15];
	static int PNR[]=new int[15];
	static int Sno[]=new int[15];
	static int Fare[]=new int[15];
	static int index=0,pnr=4181,low=2,mid=2,up=2,wl=2,rac=2,seatno=1,fare=400;
	
	
	public void book(){
		System.out.println("Enter the number of tickets to book :");
		int n = scan.nextInt();
		
		if(seatno+n<=11){
		for(int i=0;i<n;i++){
			System.out.println("Enter Your Name :");
			String name= scan.next();
			Name[index]=name;
			System.out.println("Enter Your Age :");
			int age = scan.nextInt();
			Age[index]=age;
			System.out.println("Enter Your Gender :");
			String gen = scan.next();
			Gender[index]=gen;
			PNR[index]=pnr;
			
			if(rac<=0){
				Berth[index]="WL";
				PNR[index]=pnr++;
				Fare[index]=fare;
				seatno++;
			}
			
			else if(low<=0 && mid<=0 && up<=0){
				Berth[index]="RAC";
				Fare[index]=fare;
				PNR[index]=pnr++;
				Sno[index]=seatno;
				seatno++;
				--rac;
			}
			else if(age<=5){
				Berth[index]="-";
				Fare[index]=fare/2;
				index++;
				continue;
			}
			else if(age>60){
				Sno[index]=seatno++;
				if(low!=0){
					Berth[index]="Lower";
					Fare[index]=fare;
					--low;
				}
				else{
					berthPrefre();
				}
			}
			else{
				Fare[index]=fare;
				Sno[index]=seatno++;
				berthPrefre();
			}
			index++;
		}
		pnr++;
		}
		else
		{
			System.out.println("No Tickets Available...");
		}
	}
		
public void berthPrefre(){
		
		boolean flag = true;
		while(flag){
			System.out.println("Enter Berth Preference :\nEnter '1' for Lower, '2' for Middle, '3' for Upper");
			int n = scan.nextInt();
			switch(n){
			case 1:{
				if(low!=0){
					Berth[index]="Lower";
					System.out.println("Lower Ticket Booked...");
				    low--;
					flag = false;
					break;
				}
				else{
					System.out.println("No Lower Berth Available...");
					break;
				}
			}
			case 2:{
				if(mid!=0) {
					Berth[index]="Middle";
					mid--;
					flag = false;
					System.out.println("Middle Ticket Booked...");
					break;	
				}
				else
				{
					System.out.println("No Middle Berth Avilable....");
					break;
				}
			}
			case 3:{
				if(up!=0) {
					Berth[index]="Upper";
					up--;
					flag = false;
					System.out.println("Upper Ticket Booked...");
					break;	
				}
				else
				{
					System.out.println("No Upper Berth Avilable....");
					break;
				}
			}
		}	
	  }
	}
	

public void show(){
	System.out.println("PNR"+"\t"+"Seat NO"+"\t"+"Name"+"\t"+"Age"+"\t"+"Gender"+"\t"+"Berth"+"\t"+"Fare");
	for(int i=0;i<index;i++){
		if(Age[i]!=0){
			System.out.println(PNR[i]+"\t"+Sno[i]+"\t"+Name[i]+"\t"+Age[i]+"\t"+Gender[i]+"\t"+Berth[i]+"\t"+Fare[i]);
		}
	}
}
public void avail(){
	System.out.println("Lower"+"\t"+"Middle"+"\t"+"Upper");
	System.out.println(low+"\t"+mid+"\t"+up);
}
public void cancel(){
	System.out.println("Enter the Name to delete :");
	String str = scan.next();
	for(int i=0;i<index;i++){
		if(str.equals(Name[i])){
			if(rac<2)
			{
				for(int j=0;j<index;j++)
				{
					if(Berth[j]=="RAC")
					{
						Name[i]=Name[j];
						Age[i]=Age[j];
						Gender[i]=Gender[j];
						
						for(int o=j;o<index;o++)
						{
							Name[o]=Name[o+1];
							Age[o]=Age[o+1];
							Gender[o]=Gender[o+1];
						}
						if(wl==2)
							wl--;
						else
							rac++;
						break;
					}
				}
			}
			
		}
	}
}

public void work(){
	boolean flag = true;
	while(flag){
		 System.out.println("Enter '1' to BookTickets, '2' for Cancel Tickets, '3' for view Available Tickets, '4' to show Booked Tickets, '5' for Exit");
		  int n = scan.nextInt();
		    switch(n)
		     {
		       case 1:
		         {
			       book();
			       break;
		         }
		       case 2:
		         {
			       cancel();
			       break;
		         }
		       case 3:
		         {
		        	 avail();
			       break;
		         }
		       case 4:
		         {
			       show();
			       break;
		         }
        	   case 5:
		         {
			       flag =false;
			       break;
		         } 
		    }
	}
}
}
