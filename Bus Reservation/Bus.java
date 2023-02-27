import java.util.*;
class Bus
{
	public static void main(String [] args)
	{
		Working obj = new Working();
		obj.work();
		
	}
}


class Data
{
	String name;
	int age;
	char gender;
	String phone;		
	String mail;
	int id;
	int fare;
	String pickup;
	String drop;
	int seatno;
	String type;
	public Data(String name,int age,char gender,String phone,String mail,int id,int fare,String pickup,String drop,int seatno,String type)
	{
		this.name=name;
		this.age=age;
		this.gender=gender;
		this.phone=phone;
		this.mail=mail;
		this.id=id;
		this.fare=fare;
		this.pickup=pickup;
		this.drop=drop;
		this.seatno=seatno;
		this.type=type;
	}
	public String toString()
	{
		return this.name+"\t\t"+this.age+"\t"+this.gender+"\t"+this.phone+"\t"+this.mail+"\t"+this.id+"\t"+this.fare+"\t"+this.pickup+"\t"+this.drop+"\t"+this.seatno+"\t"+this.type;
	}
}



class Working 
{
	Scanner scan = new Scanner(System.in);
	Data[] details = new Data[18];
	int seater[] = new int[12];
	int sleeper[] = new int[6];
	
	
	String admin="admin";
	String adminPass="adminPass";
	int index=0;
	int seaterId=131;
	int sleeperId=21;
	int seaterIndex=0;
	int sleeperIndex=0;
	
	
	
	public Working()
	{
		init();	
	}
	
	
	public void init()
	{
		for(int i=0;i<12;i++)
		{
			seater[i]=i+1;
		}
		for(int i=0;i<6;i++)
		{
			sleeper[i]=i+1;
		}
	}
	
	public void showAllDetails()
	{
		System.out.println("Name\t\t"+"Age\t"+"Gender\t"+"Phone\t"+"Mail\t"+"Id\t"+"Fare\t"+"Pickup\t"+"Drop\t"+"Seat\t"+"Type");
		for(int i=0;i<details.length;i++)
		{
			if(details[i]!=null)
			{
				System.out.println(details[i]);
			}
		}
	}
	public void adminWork()
	{
		System.out.println("Enter the Admin Name :");
		String str = scan.next();
		System.out.println("Enter the Admin Password :");
		String pass = scan.next();
		if(str.equals(admin) && pass.equals(adminPass))
		{
			 boolean flagg = true;
			int n=0;
			do
			{
				System.out.println("Enter '1' for ShowAllDetails\t'2' for ShowAvailable Tickets\t'3' for Exit ");
				n= scan.nextInt();
				switch(n)
				{
					case 1:
					{
						showAllDetails();
						break;
					}
					case 2:
					{
						seaterView();
						sleeperView();
						break;
					}
					case 3:
					{
						flagg = false;
						break;
					}
				}
			}
			while(flagg);
		}
		else
		{
			System.out.println("Wrong user name or password :");
		}
		
	}
	public void userWork()
	{
		System.out.println();
		int n = 0;
		boolean flag = true;
		do
		{
			System.out.println("Enter '1' for Book Tickets\nEnter '2' for Cancel Tickets\nEnter '3' for Available Tickets\nEnter '4' for Exit");
		    n = scan.nextInt();
			switch(n)
			{
				case 1:
				{
					bookTicket();
					break;
				}
				case 2:
				{
					cancelTicket();
					break;
				}
				case 3:
				{
					seaterView();
					sleeperView();
					break;
				}
				case 4:
				{
					flag = false;
					break;
				}
				default :
				{
					flag = false;
				}
			}
		}while(flag);
	}
	
	public void work()
	{
		int n=0;
		boolean flag = true;
		do
		{
			System.out.println("Enter '1' for Admin\t'2' for User\t'3' for Exit");
			n = scan.nextInt();
			switch(n)
			{
				case 1:
				{
					adminWork();
					break;
				}
				case 2:
				{
					userWork();
					break;
				}
				case 3:
				{
					flag = false;
					break;
				}
				default :
				{
					flag = false;
				}
			}
		}while(flag);
		
	}
	public void bookTicket()
	{
		System.out.println("Enter Your Name :");
		String name=scan.next();
		System.out.println("Enter Your Age :");
		int age = scan.nextInt();
		System.out.println("Enter Your Gender :");
		char gen = scan.next().charAt(0);
		System.out.println("Enter Your Phone Number :");
		String  phone = scan.next();
		System.out.println("Enter Your Mail-Id :");
		String mail= scan.next();
	    System.out.println("Enter Your PickUp Location :");
		String pickup=scan.next();
		System.out.println("Enter Your Drop Location :");
		String drop=scan.next();
		System.out.println("Enter '1' for Seater\t '2' for Sleeper ");
		int n = scan.nextInt();
		switch(n)
		{
			case 1:
			{	
				seaterView();
				System.out.println();
				if(seaterIndex<=12)
				{
					int amount=0;
					System.out.println("Ticket price is 300 to continue press '1' or to Exit press '2'");
					int input=scan.nextInt();
					if(input==1)
					{
						System.out.println("Pay the Amount :");
						amount = scan.nextInt();
					}
					else
					{
						System.out.println("You Cancelled Booking...");
						break;
					}
					System.out.println("Enter the Seat Number to  book :");
					int find = scan.nextInt();
					
					for(int i=0;i<seater.length;i++)
					{
						if(seater[i]==find)
						{
							int seatno=seater[i];
							details[index++]=new Data(name,age,gen,phone,mail,seaterId,amount,pickup,drop,seatno,"seater");
							seater[i]=seaterId;
							System.out.println("Ticket Booked Your ticket number is :"+seaterId);
							seaterId++;
							break;
						}
					}
				}
				else
				{
					System.out.println("Seater tickets Are full!!!");
				}
				break;
			}
			case 2:
			{
				sleeperView();
				System.out.println();
				if(sleeperIndex<=6)
				{
					int amount=0;
					System.out.println("Ticket price is 600 to continue press '1' or to Exit press '2'");
					int input=scan.nextInt();
					if(input==1)
					{
						System.out.println("Pay the Amount :");
						amount = scan.nextInt();
					}
					else
					{
						System.out.println("You Cancelled Booking...");
						break;
					}
					System.out.println("Enter the Seat Number to  book :");
					int sleepfind = scan.nextInt();
					for(int i=0;i<sleeper.length;i++)
					{
						if(sleeper[i]==sleepfind)
						{
							int seatno1=sleeper[i];
							details[index++]=new Data(name,age,gen,phone,mail,sleeperId,amount,pickup,drop,seatno1,"sleeper");
							sleeper[i]=sleeperId;
							System.out.println("Ticket Booked Your ticket number is :"+sleeperId);
							sleeperId++;
							break;
						}
					}
				}
				else
				{
					System.out.println("Sleeper tickets Are full!!!");
				}
				
				break;
			}
		}	
	}
	
	
	
	public void cancelTicket()
	{
		System.out.println("Enter the Ticket Number to cancel :");
		int number = scan.nextInt();
		int index=0;
		
		for(int i=0;i<seater.length;i++)
		{
			if(seater[i]==number)
			{
				index=i;
				cancelData(number);
				System.out.println("Your Amount Rs 300 is Refunded...");
				seater[index]=i+1;
				seaterIndex-=1;
				break;
			}
		}
		
		for(int i=0;i<sleeper.length;i++)
		{
			if(sleeper[i]==number)
			{
				index=i;
				cancelData(number);
				System.out.println("Your Amount Rs 600 is Refunded...");
				sleeper[index]=i+1;
				sleeperIndex-=1;
				break;
			}
		}
	}
	
	public void cancelData(int number)
	{
		
		for(int i=0;i<details.length;i++)
		{
			if(details[i]!=null)
			{
				if(details[i].id==number)
				{
					details[i]=null;
					break;
				}
			}
		}
	}
	
	
	
	public void seaterView()
	{
		System.out.println("Seater Available Tickets :");
		for(int i=0;i<seater.length;i++)
		{
			if(i%2==0)
			{
				if(seater[i]>130)
				{
					System.out.print("   ");
				}
				else
				{
					System.out.print(seater[i]+" ");
				}
				
			}
			else
			{
				if(seater[i]>130)
				{
					System.out.print("   ");
				}
				else
				{
					System.out.print(seater[i]);
				}
				System.out.println();
			}
			
		}
		System.out.println();
		
	}
	public void sleeperView()
	{
		System.out.println("Sleeper Available Tickets :");
		for(int i=0;i<sleeper.length;i++)
		{
			if(i%2==0)
			{
				if(sleeper[i]>10)
				{
					System.out.print("   ");
				}
				else
				{
					System.out.print(sleeper[i]+"   ");
				}
			}
			else
			{
				if(sleeper[i]>10)
				{
					System.out.print("   ");
				}
				else
				{
					System.out.print(sleeper[i]);
				}
				System.out.println();
			}
			
			
		}
		System.out.println();
		
	}
	
}