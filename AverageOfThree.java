import java.util.*;
public class AverageOfThree 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the three Numbers : ");
		int n1=scan.nextInt();
		int n2=scan.nextInt();
		int n3=scan.nextInt();
		int sum =n1+n2+n3;
		System.out.println("The Average is : "+(sum/3));
	}

}
