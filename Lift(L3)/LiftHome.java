import java.util.*;
class LiftHome
{
	
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
class NibiLift
{
	Scanner scan = new Scanner(System.in);
	LiftDetails[] position;
	int capacity;
	public NibiLift()
	{
		System.out.println("Enter the Lift Capacity :");
		int capacity = scan.nextInt();
		position = new LiftDetails[5];
		for(int i=0;i<position.length;i++)
			position[i]=new LiftDetails();
		this.capacity = capacity;
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
}