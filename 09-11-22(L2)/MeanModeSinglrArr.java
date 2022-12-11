import java.util.Scanner;

public class MeanModeSinglrArr {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the count of Array :");
		int n = scan.nextInt();
		int arr[]= new int[n];
		System.out.println("Enter the Array Elements :");
		for(int i=0;i<n;i++)
			arr[i]=scan.nextInt();
		
		//findMedian(arr);
		findMode(arr);
	}
	public static void findMode(int arr[]) {
		int ans[]=arr;
		int n = arr.length;
		
		int count[]=new int[ans.length];
		
		
		//Removing duplicates of merged array
		for(int i=0;i<n;i++) {
			int find=1;
			if(ans[i]!=-99) {
				for(int j=i+1;j<n;j++) {
					if(ans[i]==arr[j]) {
						ans[j]=-99;
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
	
    public static void findMedian(int arr[]) {
    	int ans[]=arr;
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
	

}
