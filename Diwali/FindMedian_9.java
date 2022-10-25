import java.util.Scanner;

public class FindMedian_9 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Number of Elements for 1'st array :");
		int n = scan.nextInt();
		int arr1[]=new int[n];
		System.out.println("Enter the Elements :");
		for(int i=0;i<n;i++)
			arr1[i]=scan.nextInt();
		
		System.out.println("Enter the Number of Elements for 2'nd array :");
		int m = scan.nextInt();
		int arr2[]=new int[m];
		System.out.println("Enter the Elements :");
		for(int i=0;i<m;i++)
			arr2[i]=scan.nextInt();
		
		int z=arr1.length+arr2.length;
		int ans[]=new int[z];
		for(int i=0;i<arr1.length;i++)
			ans[i]=arr1[i];
		for(int i=0;i<arr2.length;i++)
			ans[arr1.length+i]=arr2[i];
		
		
		for(int i=0;i<ans.length;i++) {
			for(int j=i+1;j<ans.length-1;j++) {
				if(ans[i]>ans[j]) {
					int temp=ans[i];
					ans[i]=ans[j];
					ans[j]=temp;
				}
			}
		}
		

		
		int mee=ans.length/2;
		float median=0;
		if(z%2==0) {
			median =((float)ans[mee]+(float)ans[mee-1])/2;
			System.out.println("The Median is :"+median);
		}
		else {
			System.out.println("The Median is :"+ans[mee]);
		}
		
	}

}
