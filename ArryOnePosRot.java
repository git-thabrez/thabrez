import java.util.*;
class ArryOnePosRot 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the  number of elements...");
		int sidd = scan.nextInt();
		System.out.println("Enter the elements...");
		int arr[] = new int[sidd];
		for(int i=0;i<sidd;i++)
	           arr[i]=scan.nextInt();
		int temp[] = new int[sidd];
		temp[0]=arr[sidd-1];
		for(int i=0;i<sidd-1;i++)
			temp[i+1]=arr[i];
		for(int i=0;i<sidd;i++)
			System.out.print(temp[i]);
	
	}	

}
