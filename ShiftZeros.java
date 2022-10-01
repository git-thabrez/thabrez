import java.util.Scanner;
public class ShiftZeros {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number of elements : ");
		int n = scan.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter the elements :");
		for(int i=0;i<n;i++)
			arr[i]=scan.nextInt();
		scan.close();
		for(int i=0;i<arr.length;i++) {
			int temp=0;
			for(int j=i+1;j<n;j++) {
				if(arr[i]>arr[j]) {
					temp =arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
							
				}
				
			}
		}
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]);
	}

}