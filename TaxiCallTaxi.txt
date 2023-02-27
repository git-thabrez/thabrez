import java.util.*;
import java.lang.*;
import java.io.*;

class TaxiBooking{
	static class taxi{
		int taxi_no;
		int total_earnings;
		char location;
		boolean busy;
		int endtime;
		
		taxi(int i,char x){
			taxi_no=i;
			total_earnings=0;
			location=x;
			busy=false;
		}
	};
	static class Booking{
		int BookingId,CustomerID;
		int pickuptime,droptime;
		char from,to;
		int taxi_no;
		int fair;
	};
	public static boolean check(taxi obj,int pickuptime){
		if(!obj.busy)
		return false;
		else{
			if(obj.endtime<=pickuptime){
				return false;
			}
			return true;
		}
	}
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int time=0;
		taxi obj[]=new taxi[5];
		Booking book[]=new Booking[10];
		for(int i=1;i<5;i++){
			obj[i]= new taxi(i,'A');
		}
		int temp;
		int n=0;
		while(true){
			System.out.println("1.Call taxi Booking\t2.Display the Taxi Details\t3.Exit");
			int ch=sc.nextInt();
			int y=0;
			switch(ch){
				case 1:
					n++;
					book[n]=new Booking(); 
					book[n].BookingId=n;
					System.out.println("CustomarID :");
					book[n].CustomerID=sc.nextInt();
					System.out.println("PICKUP POINT :");
					book[n].from=sc.next().charAt(0);
					System.out.println("DROP POINT :");
					book[n].to=sc.next().charAt(0);
					System.out.println("PICKUP TIME :");
					book[n].pickuptime=sc.nextInt();
					int min=100;
					for(int i=1;i<5;i++){
						int temp1=Math.abs((int)obj[i].location-(int)book[n].from);
						if(check(obj[i],book[n].pickuptime)){
							continue;
						}
						if(min>temp1){
							book[n].taxi_no=i;
							min=temp1;
						}
					}
					if(min==100)System.out.println("Taxi can not be allotted");
					else{
						System.out.println("Taxi can be allotted");
						book[n].fair=100+((Math.abs((int)book[n].from-(int)book[n].to)*15)-5)*10;
						obj[book[n].taxi_no].total_earnings+=book[n].fair;
						book[n].droptime=book[n].pickuptime+Math.abs((int)book[n].from-(int)book[n].to);
						obj[book[n].taxi_no].busy=true;
						obj[book[n].taxi_no].endtime=book[n].droptime;
						obj[book[n].taxi_no].location=book[n].to;
						System.out.println("Taxi-"+book[n].taxi_no+" is allotted");
					}
					break;
				case 2:
					for(int i=1;i<5;i++){
						System.out.println("Taxi-"+i+"\t"+"Total Earnings: Rs. "+obj[i].total_earnings);
						for(int j=1;j<n;j++){
							if(book[j].taxi_no==i){
								System.out.println(book[j].BookingId+" "+book[j].CustomerID+" "+book[j].from+" "+book[j].to+" "+book[j].pickuptime+" "+book[j].droptime+" "+book[j].fair);
							}
						}
					}
					break;
				case 3:
				    y=1;
					break;	
				default:
					System.out.println("Wrong input enter again");
					break;
			}
			if(y==1)break;
		}
	}
}