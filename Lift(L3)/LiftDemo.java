import java.util.*;
class LiftDemo
{
	public static void main(String [] args)
	{
		ZohoLift obj = new ZohoLift();
		obj.work();
	}
}

class LiftDetails
{
	int start;
	int end;
	int maintenance;
	public LiftDetails()
	{
		this.start=-1;
		this.end=0;
	}
	
}

class ZohoLift
{
	private String adminName="Nibila";
	private String adminPass="Nibila95";
	Scanner scan = new Scanner(System.in);
	LiftDetails[] position;
	int capacity;
	public ZohoLift()
	{
		System.out.println("Enter the Lift Capacity :");
		int capacity = scan.nextInt();
		position = new LiftDetails[5];
		for(int i=0;i<position.length;i++)
			position[i]=new LiftDetails();
		this.capacity = capacity;
	}
	private void adminWork()
	{
		int n;
		boolean flag = true;
		do
		{
			System.out.println("'1' for View Lift\n'2' for Put Lift in Maintenance\n'3' for Cancel Lift From Maintenance\n'4' for Exit");
			n = scan.nextInt();
			switch(n)
			{
				case 1:
				{
					displyPosition();
					break;
				}
				case 2:
				{
					assignMaintenance();
					break;
				}
				case 3:
				{
					deAssignMaintenance();
					break;
				}
				default :
				{
					flag = false;
					break;
				}
			}
		}while(flag);
	}
	public void adminAccess()
	{
		System.out.println("Enter Admin Name :");
		String str = scan.next();
		System.out.println("Enter Admin Pass :");
		String pass = scan.next();
		if(str.equals(adminName) && pass.equals(adminPass))
		{
			adminWork();
		}
		else
		{
			System.out.println("Wait a Minute You are not the admin Go and Call the boss!!!");
			return;
		}
	}
	public void work()
	{
		int n;
		boolean flag = true;
		do
		{
			System.out.println("'1' for Admin\n'2' for User\n'3' for Exit");
			n = scan.nextInt();
			switch(n)
			{
				case 1:
				{
					adminAccess();
					break;
				}
				case 2:
				{
					userWork();
					break;
				}
				default :
				{
					flag = false;
					break;
				}
			}
		}
		while(flag);
		
	}
	public void userWork()
	{
		int n;
		boolean flag = true;
		do
		{
			System.out.println("'1' for Display Lift Current Position\n'2' for Assign Lift\n'3' for Exit");
			n = scan.nextInt();
			switch(n)
			{
				case 1:
				{
					displyPosition();
					break;
				}
				case 2:
				{
					assignLift();
					break;
				}
				default :
				{
					flag = false;
					break;
				}
			}
		}
		while(flag);
	}
	public void displyPosition()
	{
		for(int i=0;i<position.length;i++)
		{
			if(position[i].maintenance!=-1)
				System.out.print("L"+(i+1)+"\t");
		}
		System.out.println();
		for(int i=0;i<position.length;i++)
		{
			if(position[i].maintenance!=-1)
				System.out.print(position[i].end+"\t");
		}
		System.out.println();
	}
	public void assignLift()
	{
		System.out.println("Enter how Many persons to Travel in lift");
		int n = scan.nextInt();
		if(n<=capacity)
		{
			int floor[] = new int[position.length];
			int index=0;
			System.out.println("Enter The Starting Floor :");
			int start = scan.nextInt();
			if(start<0)
			{
				System.out.println("No Such Floor is Found!!!");
				assignLift();
			}
			System.out.println("Enter the Destination Floor :");
			int end = scan.nextInt();
			if(end<0)
			{
				System.out.println("No Such Floor is Found!!!");
				assignLift();
			}
			int lowest =1000;
			for(int i=0;i<position.length;i++)
			{
				int ans=position[i].end-start;
			    floor[index++]=(ans<0)?ans*-1:ans;
			}
			for(int i=0;i<position.length;i++)
			{
				if(position[i].maintenance!=-1)
				{
					if(position[i].start==-1)
					{
						position[i].start=start;
						position[i].end=end;
						System.out.println("Lift "+(i+1)+" is Assigned ");
						Arrays.fill(floor,0);
						displyPosition();
						break;
					}
					else
					{
						int min=floor[0];
						int currindex=0;
						for(int j=0;j<floor.length;j++)
						{
							if(floor[j]<min)
							{
								min=floor[j];
								currindex=j;
							}
						}
						position[currindex].start=start;
						position[currindex].end=end;
						System.out.println("Lift "+(currindex+1)+" is Assigned ");
						Arrays.fill(floor,0);
						displyPosition();
						break;
					}
				}
			}
		}
		else
		{
			System.out.println("Over Load Not able to travel more than "+capacity+" persons!!!");
		}
		
	}
	public void assignMaintenance()
	{
		System.out.println("Enter the Lift Number to Assign it under Maintenance -'1'-'"+(position.length)+"' :");
		int assign = scan.nextInt();
		position[assign-1].maintenance=-1;
		System.out.println("Lift "+assign+"  is putted Under Maintenance...");
		
	}
	public void deAssignMaintenance()
	{
		System.out.println("Enter the Lift Number to De-Assign it from under Maintenance -'1'-'"+(position.length)+"' :");
		int assign = scan.nextInt();
		position[assign-1].maintenance=0;
		System.out.println("Lift "+assign+"  is De-Assigned From Maintenance...");
		
	}
}