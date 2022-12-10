import java.util.Scanner;

public class TakeNotTake {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number of arrays :");
		int n = scan.nextInt();
		int arr[] =new int[n];
		System.out.println("Enter the Elements :");
		for(int i=0;i<n;i++)
			arr[i]=scan.nextInt();
		System.out.println("Enter the target value :");
		int target=scan.nextInt();
		System.out.println(count(arr,0,0,target));
	}
	
	
	public static int count(int arr[],int index,int sum,int target) {
		if(arr.length== index) {
		   return sum==target? 1:0;
		}
		return count(arr,index+1,sum+-arr[index],target)
				+ count(arr,index+1,sum+arr[index],target);
	}

}
