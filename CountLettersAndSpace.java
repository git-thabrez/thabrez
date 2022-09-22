import java.util.*;
class CountLettersAndSpace 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the String : ");
		String str = scan.nextLine();
		int upper=0;
		int numbers=0;
		int space =0;
		int special=0;
		char arr[] = str.toCharArray();
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>=65 && arr[i]<=90 || arr[i]>=97 && arr[i]<=122)
			{
				upper++;				
			}
		    if(arr[i]==32)
			{
				space++;
			}
		    if(arr[i]>=48 && arr[i]<=57)
			{
				numbers++;
			}
		    if(arr[i]>=33 && arr[i]<=47 || arr[i]>=92 && arr[i]<=96)
			{
		    	special++;
		    }
			
		}
		System.out.println("No Of UpperCase          : "+upper);
		System.out.println("No Of Space              : "+space);
		System.out.println("No Of Numbers            : "+numbers);
		System.out.println("No Of Special Characters : "+special);
	}

}
