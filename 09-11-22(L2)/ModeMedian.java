
import java.util.Scanner;
public class ModeMedian {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the 1'st Array number of Elements :");
		int n = scan.nextInt();
		System.out.println("Enter the 2'nd Array number of Elements :");
		int n1 = scan.nextInt();
		int arr[]=new int[n];
		int arr1[]=new int[n1];
		int ans[]=new int[n+n1];
		int count=0;
		System.out.println("Enter the first Array Elements :");
		for(int i=0;i<n;i++,count++) {
			arr[i]=scan.nextInt();
			ans[count]=arr[i];
		}
		System.out.println("Enter the second Array Elements :");
		for(int i=0;i<n1;i++,count++) {
			arr1[i]=scan.nextInt();
			ans[count]=arr1[i];
		}
		scan.close();
		
		findMedian(ans);
		findMode(ans);
		
	}
	
	public static void findMedian(int ans[]) {
		int mid=ans.length;
		for(int i=0;i<ans.length;i++) {
			for(int j=0;j<ans.length;j++) {
				if(ans[i]>ans[j]) {
					int temp=ans[i];
					ans[i]=ans[j];
					ans[j]=temp;
				}
			}
		}
		if(mid%2!=0) {
			System.out.println("Median is = "+ans[mid/2]);
		}
		else {
			System.out.println("Median is = "+(ans[mid/2]+ans[mid/2-1])/2);
		}
	}
	public static void findMode(int ans[]) {
		int arr[]=ans;
		int n = arr.length;
		
		int count[]=new int[arr.length];
		
		
		//Removing duplicates of merged array
		for(int i=0;i<n;i++) {
			int find=1;
			if(arr[i]!=-99) {
				for(int j=i+1;j<n;j++) {
					if(arr[i]==arr[j]) {
						arr[j]=-99;
						find+=1;
					}
				}
				count[i]=find;
			}
			
		}
		int max=0;
		int index=0;
		
		//finding maximum count index in duplicate removed array
		for(int i=0;i<n;i++) {
			max=count[i];
			if(arr[i]!=-99) {
				for(int j=i+1;j<n;j++) {
					if(count[j]>max) {
						index=j;
					}
				}
			}
			
		}
		
		System.out.println("The Mode is = "+arr[index]);
		
		
	}

}
