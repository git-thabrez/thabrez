import java.util.*;

class Bank3
{
	public static void main(String [] args)
	{
		
	}
}

class Data
{
	static Scanner scan = new Scanner(System.in);
	static String cid[]={"null","null","null"};
	static String cpass[]={"null","null","null"}	;
	static int giftCard[]=new int[3];
	static int giftCardAmount[]=new int[3];
	static int pinNumber[]=new int[3];
	static int deposit[]=new int[3];
	static int reedemPoints[]=new int[3];
	static String block[]={"null","null","null"};
	static int k=0;
	static int pinnum=3245;
	static int cardnum=191318;
}
class User extends Data
{
	String id;
	String name;
}