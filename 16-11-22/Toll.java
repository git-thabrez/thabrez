import java.util.*;
class Toll
{
	public static void main(String [] args)
	{
		Working obj = new Working();
		obj.work();
	}
}


class Data
{
	String vehiType[]=new String[10];
	String startPoint[]=new String[10];
	String endPoint[]=new String[10];
	static int k=0;
}


class Working extends Data
{
	Scanner scan = new Scanner(System.in);
	public void work()
	{
		if(k!=0)
		{
			System.out.println("Enter the Vehicle Type :");
		String vehicle=scan.next();
		System.out.println("Enter the strating point :");
		String startpoint=scan.next();
		System.out.println("Entre the destination point :");
		String destipoint=scan.next();
		}
		
		
	}
}