import java.util.Scanner;
public class ZigZagMatix {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Number of Rows :");
		int row = scan.nextInt();
		System.out.println("Enter the Number of Columns :");
		int col = scan.nextInt();
		
		int arr[][]=new int[row][col];
		System.out.println("Enter the Elements :");
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++) {
				arr[i][j]=scan.nextInt();
			}
		}
		System.out.println(Arrays.toString(findDiog(arr,row,col)));
		
		
		
		
	}
	public static int[] findDiog(int arr[][],int row,int col) {
		int m = arr.length,n=arr[0].length;
		int ans[]=new int[m*n];
		int i=0;int row1=0,col1=0;
		
		boolean up = true;
		
		while(row1<m && col1<n) {
			if(up) {
				while(row1>0 && col1<n-1) {
					ans[i++]=arr[row1][col1];
					row1--;
					col1++;
				}
				ans[i++]=arr[row1][col1];
				if(col1==n-1) {
					row1++;
				}
				else {
					col1++;
				}
			}
			else {
				while(col1>0 && row1<m-1) {
					ans[i++]=arr[row1][col1];
					row1++;
					col1--;
				}
				ans[i++]=arr[row1][col1];
				if(row1==m-1) {
					col1++;
				}
				else {
					row1++;
				}
			}
			
			up=!up;
		}
		return ans;
	}

}
